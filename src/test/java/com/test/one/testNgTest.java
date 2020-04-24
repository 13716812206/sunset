package com.test.one;

import org.testng.annotations.*;

public class testNgTest {


    @BeforeSuite
    public void beforeSuite() {
        System.out.println("我是BeforeSuite");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("我是AfterSuite");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("BeforeClass");
    }

    @AfterClass
    public void afterClass() {

        System.out.println("AfterClass");
    }

    @BeforeGroups(groups = {"group1"})
    public void beforeGroup() {
        System.out.println("BeforeGroups");
    }

    @AfterGroups(groups = {"group1"})
    public void afterGroup() {
        System.out.println("AfterGroups");
    }

    @BeforeMethod
    public void beforeMethond() {
        System.out.println("BeforeMethod");

    }

    @AfterMethod
    public void afterMethos() {
        System.out.println("AfterMethod");
    }

    @Test(groups = {"group1"})
    public void test() {
        System.out.println("test");
    }
}
