package com.simbirsoft.uiTests;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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
        int size = app.getMainPage().getResourceListSize();
        app.getMainPage().createFolder("ololo");
        app.getMainPage().waitHiddenCreateModal();
        WebDriverWait wait = new WebDriverWait(app.getDriver(), 10, 100);
        wait.until(dr -> app.getMainPage().getResourceListSize() == size + 1);
        assertEquals(app.getMainPage().getResourceByIndex(0).name.getText(), "ololo");
        app.getMainPage().dropResourceToKorzina(app.getMainPage().getResourceByIndex(0));
    }
}
