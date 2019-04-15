package com.simbirsoft.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage extends Page {

    private By userButton = By.cssSelector(".user2__current-account");
    private By createButton = By.cssSelector(".create-resource-popup-with-anchor");
    private By createResourceList = By.cssSelector(".create-resource-popup-with-anchor__create-items > button");
    private By nameModalInput = By.cssSelector(".modal__table input");
    private By submitModalButton = By.cssSelector(".confirmation-dialog__button");
    private By resourceList = By.cssSelector("div.listing__items > div");

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public boolean isLoggedIn() {
        setImplicitly(false);
        boolean result = driver.findElements(userButton).size() > 0;
        setImplicitly(true);
        return result;
    }

    public void waitLoadPage() {
        waitVisible(userButton);
    }

    public void createFolder(String name) {
        driver.findElement(createButton).click();
        driver.findElements(createResourceList).get(0).click();
        driver.findElement(nameModalInput).sendKeys(Keys.chord(Keys.CONTROL, "a"), Keys.DELETE);
        driver.findElement(nameModalInput).sendKeys(name);
        driver.findElement(submitModalButton).click();
    }

    public WebElement getResourceByIndex(int index) {
        return driver.findElements(resourceList).get(index);
    }
}
