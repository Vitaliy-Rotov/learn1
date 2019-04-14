package com.simbirsoft.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends Page {

    public By loginButton = By.cssSelector(".button_login");

    private By usernameField = By.id("passp-field-login");
    private By passwordField = By.id("passp-field-passwd");
    private By submitButton = By.cssSelector("button[type='submit']");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void login(String username, String password) {
        driver.findElement(loginButton).click();
        driver.findElement(usernameField).sendKeys(username);
        driver.findElement(submitButton).click();
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(submitButton).click();
    }
}
