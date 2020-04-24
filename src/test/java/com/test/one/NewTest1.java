package com.test.one;

import com.test.one.bean.*;
import com.test.one.utils.JDBCHelp;
import com.test.one.utils.JSONUtils;
import com.test.one.utils.OkhttpUtils;
import com.test.one.utils.Phone;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Logger;

public class NewTest1 {


//    private static Logger logger = Logger.getLogger(String.valueOf(NewTest1.class));

//    WebDriver webDriver = null;

    @Test
    public void one() {
        String aa = JSONUtils.javaToJSON(new JsonRequest());
        System.out.println("===============" + aa);
         WebDriver webDriver = new ChromeDriver();
        System.out.println("我是第一");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator.EIT-20130101WFQ\\AppData\\Local\\Google\\Chrome\\Application\\chromedriver.exe");
//        System.setProperty("webdriver.firefox.bin", "C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
//        System.setProperty("webdriver.gecko.driver", "C:\\Program Files (x86)\\Mozilla Firefox\\geckodriver.exe");
//        webDriver = new FirefoxDriver();
        webDriver.get("http://test.credit.hexinxiaodai.com/");
        webDriver.manage().window().maximize();
//        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        webDriver.manage().deleteAllCookies();
        WebElement webElement = new WebDriverWait(webDriver, 5).until(new ExpectedCondition<WebElement>() {

            @Override
            public WebElement apply(WebDriver driver) {
                return webDriver.findElement(By.xpath("//*[@class='el-input__inner']"));
            }
        });

        webElement.sendKeys("");
        webDriver.close();

    }

    AppiumDriver appiumDriver = null;

    @Test
    public void aa() throws MalformedURLException, InterruptedException {
        System.out.println("我是第二");
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("app", "C:\\Users\\Administrator.EIT-20130101WFQ\\Desktop\\test.apk");
        desiredCapabilities.setCapability("deviceName", "77ebb83b");
        desiredCapabilities.setCapability("uuid", "77ebb83b");
        desiredCapabilities.setCapability("platformVersion", "8.1.0");
        desiredCapabilities.setCapability("appPackage", "com.hxd.mall");
        desiredCapabilities.setCapability("appActivity",
                ".MainActivity");

        desiredCapabilities.setCapability("noReset", false); //true 不清除数据
        // 每次启动时覆盖session，否则第二次后运行会报错不能新建session
        desiredCapabilities.setCapability("sessionOverride", true);

        appiumDriver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);
        WebElement webElement = new WebDriverWait(appiumDriver, 5).until(new ExpectedCondition<WebElement>() {

            @Override
            public WebElement apply(WebDriver driver) {
                return appiumDriver.findElement(By.xpath("//*[@text='我的']"));

            }
        });
//        Thread.sleep(5000);
        webElement.click();
//        WebElement webElement = appiumDriver.findElement(By.xpath("//*[@text='我的']"));
//        Assert.assertEquals(true, webElement.isDisplayed(), "判断是否找到控件");
        int width = appiumDriver.manage().window().getSize().width;
        int height = appiumDriver.manage().window().getSize().height;

//        touchAction.press(PointOption.point(width / 2, height * 3 / 4)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(width / 2, height / 4)).release().perform();
        TouchAction touchAction = new TouchAction(appiumDriver);
        Thread.sleep(1000);
        touchAction.press(PointOption.point(width / 4, height / 6)).release().perform();//登录注册按钮
        Thread.sleep(2000);
        touchAction.press(PointOption.point(width * 2 / 3, height * 10 / 11)).release().perform();//注册
        Thread.sleep(2000);
        WebElement phone = appiumDriver.findElement(By.xpath("//android.widget.[@text='输入手机号']"));
        phone.sendKeys("13711111111");
        appiumDriver.findElement(By.xpath("//*[@text='发送验证码']")).click();
        WebElement mess = appiumDriver.findElement(By.xpath("//android.widget.EditText[@text='短信验证码']"));
        mess.click();
        mess.sendKeys("888888");
        appiumDriver.hideKeyboard();
        WebElement password = appiumDriver.findElement(By.xpath("//hierarchy/android.widget.FrameLayout/android.wid" +
                "get.LinearLayout/android.widget" +
                ".FrameLayout/android.widget.FrameLayout/android.v" +
                "iew.View/android.view.View/android.view.View/android.view.V" +
                "iew/android.view.View/" +
                "android.widget.ScrollView/android.vie" +
                "w.View/android.widget.EditText[3]"));
        password.click();
        password.sendKeys("12345678");
        appiumDriver.hideKeyboard();
        WebElement checkRead = appiumDriver.findElement(By.xpath("//hierarchy/android.widget.FrameLayout/android.wid" +
                "get.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.vie" +
                "w.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view." +
                "View/android.view.View[1]/android.widget.ImageView"));
        checkRead.click();
//        appiumDriver.findElement(By.xpath(""));
        appiumDriver.close();

    }

    /*
    注册实名
     */
    @Test
    public static void hxdRegister() throws IOException, SQLException, InterruptedException {
//        System.out.println(new Phone().getRegisterurl());
//        System.out.println(new Phone().getRegisterurl1());
        String url = new Phone().getRegisterurl();
//        System.out.println(JSONUtils.javaToJSON(new OnlyPhone()).toString());
        OkhttpUtils okhttpUtils = new OkhttpUtils();
        okhttpUtils.jsonRequest(url, JSONUtils.javaToJSON(new OnlyPhone()).toString());
        Thread.sleep(2000);

        okhttpUtils.jsonRequest(new Phone().getRegisterurl1(), JSONUtils.javaToJSON(new JsonRequest()).toString());

        Connection conn = JDBCHelp.getConn();
        Statement statement = conn.createStatement();
        String sql = "update user_info SET user_name='" + new Phone().getName() + "',id_card='" + new Phone().getIdcard() + "',authentication_status = 1,face_recognition=0 where mobile_phone='" + new Phone().getPhone() + "'";
        int executeUpdate = statement.executeUpdate(sql);
        if (executeUpdate == 1) {
            System.out.println("插入身份证信息成功");
            ResultSet resultSet = statement.executeQuery("select id from user_info where mobile_phone='" + new Phone().getPhone() + "'");
            int id = 0;
            if (resultSet.next()) {
                id = resultSet.getInt("id");
                System.out.println("++++++++++" + id);
            }
            int front = statement.executeUpdate("insert INTO attachment (user_id,file_name,file_type,path_info,create_time,attachment_type,description)VALUES(" + id + ",1,1,'/www/frontend/attachment/fangdai/20180726154159_190057.png',NOW(),1,'front')");

                int back = statement.executeUpdate(" insert INTO attachment (user_id,file_name,file_type,path_info,create_time,attachment_type,description)VALUES(" + id + ",1,1,'/export/data/img_server/credit-app/ocrSecond/2019-07-25/1564049943-zACtv-b-0.png',NOW(),1,'back')");
            if (front == 1 && back == 1) {
                System.out.println("实名成功成功");
            }

        } else {
            System.out.println("插入用户信息失败");
        }
//        OkhttpUtils.get("http://api-sandbox.hxgp.com/v1/user/getCurrentSupportWay?nothing=");
//
      String aa=  okhttpUtils.jsonRequest(new Phone().getLoginurl(), JSONUtils.javaToJSON(new login()).toString());
       loginRe a = new loginRe();
      JSONUtils.jsonToBean(aa,a);
        System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaa"+aa);

        Thread.sleep(2000);
        okhttpUtils.jsonRequest(new Phone().getStaff(),JSONUtils.javaToJSON(new staff()).toString());
//        Thread.sleep(2000);
//        okhttpUtils.jsonRequest(new Phone().getCreateAudit(), JSONUtils.javaToJSON(new creditAudit()).toString());
//        Thread.sleep(2000);
//        okhttpUtils.jsonRequest(new Phone().getUserBaseurl(), JSONUtils.javaToJSON(new UserBase()).toString());
//        Thread.sleep(2000);
//        okhttpUtils.jsonRequest(new Phone().getOccipationurl(), JSONUtils.javaToJSON(new Occupation()).toString());
//        Thread.sleep(2000);
//        okhttpUtils.jsonRequest(new Phone().getRealtionurl(), JSONUtils.javaToJSON(new Relation()).toString());

    }



}
