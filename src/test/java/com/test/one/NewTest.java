package com.test.one;

import com.test.one.bean.Person;
import com.test.one.utils.OkhttpUtils;
import org.testng.annotations.*;

import java.io.IOException;

public class NewTest {


    @Test
    public void one() {
        System.out.println("1");
        String url = "http://test.credit.hexinxiaodai.com";
        try {
            Person person = new Person();
            person.setAge("11");
            person.setName("22");

            OkhttpUtils.post(url, person);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void two() {
        System.out.println("2");
    }

    @Test
    public void three() {
        System.out.println("3");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("===begin===");
    }

    @AfterTest
    private void afterTest() {
        System.out.println("===end===");
    }

    @BeforeSuite
    public void beforeSuit() {
        System.out.println("===ready====");
    }

    @AfterSuite
    public void afterSuit() {
        System.out.println("====finally close====");
    }


}
