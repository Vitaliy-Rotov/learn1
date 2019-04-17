package com.simbirsoft.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Resource {

    private WebDriver driver;

    public WebElement name;

    public Resource(WebElement root, WebDriver driver) {
        this.driver = driver;
        name = root.findElement(By.cssSelector("span.clamped-text"));
    }

}
