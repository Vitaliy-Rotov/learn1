package com.simbirsoft.uiTests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.simbirsoft.Config.*;

public class test1 extends baseTest {

    @BeforeMethod
    public void setup() {
        app.getDriver().get(BASE_URL);
        app.getMainPage().waitLoadPage();
        app.getUserHelper().auth(USER_NAME, USER_PASS);
    }

    @Test
    public void test1() {
        app.getMainPage().createFolder("ololo");
        Assert.assertEquals(app.getMainPage().getResourceByIndex(1).getText(), "ololo");
    }
}
