package com.simbirsoft.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static com.simbirsoft.Config.implicityWait;

public class Page {

    protected WebDriver driver;

    public Page(WebDriver driver) {
        this.driver = driver;
    }

    protected WebElement waitVisible(By element) {
        WebDriverWait wait = new WebDriverWait(driver, 10, 100);
        return wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }

    protected void setImplicitly(boolean val) {
        if (val) {
            driver.manage().timeouts().implicitlyWait(implicityWait, TimeUnit.SECONDS);
            return;
        }
        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
    }
}
