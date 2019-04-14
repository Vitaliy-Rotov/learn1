package com.simbirsoft.uiTests;

import com.simbirsoft.ApplicationManager;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class baseTest {

    protected ApplicationManager app;

    @Parameters({"browser"})
    @BeforeClass
    public void init(@Optional("chrome") String browser) {
        app = new ApplicationManager(browser);
    }

    @AfterClass
    public void stop() {
        app.stop();
    }
}
