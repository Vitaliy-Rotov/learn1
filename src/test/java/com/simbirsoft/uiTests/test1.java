package com.simbirsoft.uiTests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.simbirsoft.Config.*;
import static org.testng.Assert.assertEquals;

public class test1 extends BaseTest {

    @BeforeMethod
    public void setup() {
        app.getDriver().get(BASE_URL);
        app.getLoginPage().waitLoadPage();
        app.getUserHelper().auth(USER_NAME, USER_PASS);
    }

    @Test
    public void test1() {
        app.getMainPage().createFolder("ololo");
        assertEquals(app.getMainPage().getResourceByIndex(0).name.getText(), "ololo");
    }
}
