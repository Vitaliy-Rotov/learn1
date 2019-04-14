package com.simbirsoft.helpers;

import com.simbirsoft.ApplicationManager;

import static org.testng.Assert.assertTrue;

public class UserHelper {

    ApplicationManager app;

    public UserHelper(ApplicationManager app) {
        this.app = app;
    }

    public void auth(String username, String password) {
        if (!app.getMainPage().isLoggedIn()) {
            app.getLoginPage().login(username, password);
        }
        app.getMainPage().waitLoadPage();
        assertTrue(app.getMainPage().isLoggedIn());
    }
}
