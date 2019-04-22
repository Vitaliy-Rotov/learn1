package com.simbirsoft.pages;

import com.simbirsoft.components.Resource;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;

import static org.openqa.selenium.support.ui.ExpectedConditions.invisibilityOfElementLocated;
import static org.testng.Assert.assertTrue;

public class MainPage extends Page {

    private By userButton = By.cssSelector(".user2__current-account");
    private By createButton = By.cssSelector(".create-resource-popup-with-anchor");
    private By createResourceList = By.cssSelector(".create-resource-popup-with-anchor__create-items > button");
    private By nameModalInput = By.cssSelector(".modal__table input");
    private By submitModalButton = By.cssSelector(".confirmation-dialog__button");
    private By resourceList = By.cssSelector("div.listing__items > div:not(.listing-item_theme_tile-empty)");

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

    public Resource getResourceByIndex(int index) {
        WebElement element = driver.findElements(resourceList).get(index);
        return new Resource(element, driver);
    }

    public int getResourceListSize() {
        return driver.findElements(resourceList).size();
    }

    public void waitHiddenCreateModal() {
        WebDriverWait wait = new WebDriverWait(driver, 1, 100);
        wait.until(invisibilityOfElementLocated(submitModalButton));
    }

    public void dragAndDrop(Resource resource1, Resource resource2) {
        Actions actions = new Actions(driver);
        actions.dragAndDrop(resource1.root, resource2.root).perform();
    }

    public void dropResourceToKorzina(Resource resource) {
        Actions actions = new Actions(driver);
        List<WebElement> list = driver.findElements(resourceList);
        Resource korzina = getResourceByIndex(list.size()-1);
        actions.clickAndHold(resource.root).moveToElement(korzina.root).build().perform();
        assertTrue(korzina.isActive());
    }
}
