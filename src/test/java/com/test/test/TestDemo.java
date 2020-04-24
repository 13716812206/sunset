package com.test.test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

import java.time.Duration;

public class TestDemo {


    private static TestDemo testDemo=new TestDemo();
    private TestDemo(){}

    public static TestDemo getInstance(){

        return testDemo;

    }


    public void move(AppiumDriver appiumDriver,int startx,int starty,int endx,int endy){

        TouchAction touchAction=new TouchAction(appiumDriver);
        touchAction.press(PointOption.point(startx,starty)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(300))).moveTo(PointOption.point(endx,endy)).release().perform();





    }

}
