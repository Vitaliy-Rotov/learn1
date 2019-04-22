package com.simbirsoft.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Resource {

    private WebDriver driver;

    public WebElement root;
    public WebElement name;
//    public WebElement isActive;

    public Resource(WebElement root, WebDriver driver) {
        this.root = root;
        this.driver = driver;
        name = root.findElement(By.cssSelector("span.clamped-text"));
//        isActive = root.findElement(By.xpath(".//self::*[contains(@class,'_active')]"));
    }

    public void click() {
        Actions actions = new Actions(driver);
        actions.doubleClick(root).perform();
    }

    public boolean isActive() {
        return root.findElement(By.xpath(".//self::*[contains(@class,'_active')]")).isDisplayed();
    }
}
