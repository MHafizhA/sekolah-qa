package com.hafizh.auth;

import com.hafizh.base.TestBase;
import com.hafizh.pages.LoginPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    LoginPage loginPage;

    public LoginTest() {
        super();
    }

    @BeforeMethod
    public void setUp() throws InterruptedException {
        initialization();
        loginPage = new LoginPage();
    }



    @Test
    public void verify_succes_login_when_user_entered_valid_an_account() {
        loginPage.clickGoogleLoginBtn();
        loginPage.inputGoogleEmailField(properties.getProperty("username"));
        loginPage.clickGoogleAfterEmail();
//        loginPage.setGooglePasswordField(properties.getProperty("password"));
//        loginPage.clickGoogleAfterPassword();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
