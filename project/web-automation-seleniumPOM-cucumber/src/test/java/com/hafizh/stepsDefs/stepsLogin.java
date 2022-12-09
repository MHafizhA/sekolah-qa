package com.hafizh.stepsDefs;

import com.hafizh.base.BaseSetup;
import com.hafizh.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepsLogin extends BaseSetup {
    LoginPage loginPage;
    @Given("^user navigate to staging cicle$")
    public void userNavigateToStagingCicle() {
        initialization();
        loginPage = new LoginPage();

    }

    @When("^user click google login button$")
    public void userClickGoogleLoginButton() {
        loginPage.clickGoogleLoginBtn();
    }

    @And("^user input google email field$")
    public void userInputGoogleEmailField() {
        loginPage.inputGoogleEmailField(properties.getProperty("username"));
    }

    @And("^User click google after email button$")
    public void userClickGoogleAfterEmailButton() {
        loginPage.clickGoogleAfterEmail();
    }

    @And("^user input password google$")
    public void userInputPasswordGoogle() {
    }

    @And("^user click google after password button$")
    public void userClickGoogleAfterPasswordButton() {
        loginPage.setGooglePasswordField(properties.getProperty("password"));
    }

    @Then("^user succesfully login$")
    public void userSuccesfullyLogin() {
        loginPage.clickGoogleAfterPassword();
    }
}
