package com.simbirsoft;

import com.simbirsoft.helpers.UserHelper;
import com.simbirsoft.pages.MainPage;
import com.simbirsoft.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;

public class ApplicationManager {

    private WebDriver driver;

    private LoginPage loginPage;
    private MainPage mainPage;

    private UserHelper userHelper;

    public ApplicationManager() {

    }

    public ApplicationManager(String browser) {
        this();
        switch (browser) {
            case "Firefox":
                driver = new FirefoxDriver();
                break;
            default:
                driver = new ChromeDriver();
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);

        loginPage = new LoginPage(driver);
        mainPage = new MainPage(driver);

        userHelper = new UserHelper(this);
    }

    public LoginPage getLoginPage() {
        return loginPage;
    }

    public MainPage getMainPage() {
        return mainPage;
    }

    public UserHelper getUserHelper() {
        return userHelper;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void stop() {
        if (driver != null) {
            driver.quit();
        }
    }
}
