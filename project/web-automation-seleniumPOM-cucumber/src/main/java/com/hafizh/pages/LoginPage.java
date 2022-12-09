package com.hafizh.pages;

import com.hafizh.base.BaseSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseSetup {
    public LoginPage() {
        PageFactory.initElements(driver, "/signin");
    }

    By googleLoginBtn = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]");
    By googleEmailField = By.cssSelector("input[type=email i]");
    By googleBerikutnyaBtn = By.xpath("//*[@id=\"identifierNext\"]/div/button/span");
    By googlePasswordField = By.name("password");
    By googleNextAfterPassword = By.xpath("//*[@id=\"passwordNext\"]/div/button/span");

    public void clickGoogleLoginBtn() {
        driver.findElement(googleLoginBtn).click();
    }

    public void inputGoogleEmailField(String email) {
        driver.findElement(googleEmailField).sendKeys(email);
    }

    public void clickGoogleAfterEmail() {
        driver.findElement(googleBerikutnyaBtn).click();
    }

    public void setGooglePasswordField(String password) {
        driver.findElement(googlePasswordField).sendKeys(password);
    }

    public void clickGoogleAfterPassword() {
        driver.findElement(googleNextAfterPassword).click();
    }

}
