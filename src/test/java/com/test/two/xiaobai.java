package com.test.two;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public  class xiaobai {
    static AppiumDriver appiumDriver;

    public static void main(String[] args) throws MalformedURLException, InterruptedException {


        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("app", "C:\\Users\\Administrator.EIT-20130101WFQ\\Desktop\\xiaobai.apk");
        desiredCapabilities.setCapability("deviceName", "66J5T19117002161");
        desiredCapabilities.setCapability("uuid", "66J5T19117002161");
        desiredCapabilities.setCapability("platformVersion", "10");
        desiredCapabilities.setCapability("appPackage", "com.hxd.writemall");
        desiredCapabilities.setCapability("appActivity",
                "com.hxd.writemall.module.MainActivity");

        desiredCapabilities.setCapability("noReset", true); //true 不清除数据
        // 每次启动时覆盖session，否则第二次后运行会报错不能新建session
        desiredCapabilities.setCapability("sessionOverride", true);
        appiumDriver=new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"),desiredCapabilities);
        appiumDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);



        WebElement webElement=new WebDriverWait(appiumDriver,5,1000).until(new ExpectedCondition<WebElement>() {
            //显示等待   参数 驱动，超时时间，刷新间隔
            @NullableDecl
            @Override
            public WebElement apply(@NullableDecl WebDriver driver) {
                WebElement tongyi=appiumDriver.findElement(By.xpath("//*[@text='同意']"));
                return tongyi;
            }
        });
        webElement.click();

//        appiumDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); //隱式等待

        int width=appiumDriver.manage().window().getSize().width;
        int height=appiumDriver.manage().window().getSize().height;
        TouchAction touchAction=new TouchAction(appiumDriver);
        touchAction.press(PointOption.point(width,height)).release().perform();
        //release() 结束的行动取消屏幕上的指针。
        //Perform() 执行的操作发送到服务器的命令操作




        }

}
