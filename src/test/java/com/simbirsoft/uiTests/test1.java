package com.simbirsoft.uiTests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.simbirsoft.Config.*;

public class test1 extends baseTest {

    @BeforeMethod
    public void setup() {
//        app.getDriver().get(baseUrl);
    }

    @Test
    public void test1() {
        app.getDriver().get(baseUrl);
        app.getUserHelper().auth(userName, userPass);
        app.getMainPage().createFolder("ololo");
//        app.getMainPage().dnd();
        System.out.println();
    }
}
