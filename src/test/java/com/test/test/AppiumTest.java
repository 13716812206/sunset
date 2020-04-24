package com.test.test;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.URL;

public class AppiumTest {
    TestDemo testDemo = TestDemo.getInstance();

    DesiredCapabilities desiredCapabilities = new DesiredCapabilities();


    AppiumDriver appiumDriver;

    @Test
    public void startAppium() throws InterruptedException, java.net.MalformedURLException {


        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("app", "C:\\Users\\Administrator.EIT-20130101WFQ\\Desktop\\test.apk");
        desiredCapabilities.setCapability("deviceName", "77ebb83b");
        desiredCapabilities.setCapability("uuid", "77ebb83b");
        desiredCapabilities.setCapability("platformVersion", "8.1.0");
        desiredCapabilities.setCapability("appPackage", "com.hxd.mall");
        desiredCapabilities.setCapability("appActivity",
                "com.hxd.mall.module.startup.WelcomeActivity");

        desiredCapabilities.setCapability("noReset", true); //true 不清除数据
        // 每次启动时覆盖session，否则第二次后运行会报错不能新建session
        desiredCapabilities.setCapability("sessionOverride", true);
        appiumDriver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);
        Thread.sleep(4000);
        int width = appiumDriver.manage().window().getSize().width;
        int height = appiumDriver.manage().window().getSize().height;

        for (int i = 0; i < 3; i++) {
            testDemo.move(appiumDriver, width / 2, height / 2, width / 8, height / 2);
            Thread.sleep(1000);
        }

    }

}
