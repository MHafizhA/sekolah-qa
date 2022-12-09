package com.hafizh.pages;

import com.hafizh.base.BaseSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;

public class GroupChatPage extends BaseSetup {

    WebDriverWait wait = new WebDriverWait(driver, 5, 5);

    public GroupChatPage() {
        PageFactory.initElements(driver,"https://staging.cicle.app/companies/61eba2c85080f47b25ddc8f8/teams/636b9e72aa1f4a00a8ab27f8/group-chats/636b9e72aa1f4a00a8ab286d");
    }

    By click_On_Team = By.xpath("//*[contains(text(),'Cicle Bug & Feature Request')]");
    By click_On_Group_Chat = By.cssSelector(".GroupChatSnapshot_FetchMessages__2k1Xq");

    public void clickOnTeam() {
        WebElement onTeam = wait.until(ExpectedConditions.presenceOfElementLocated(click_On_Team));
        onTeam.click();
    }

    public void clickOnGroupChat() {
        WebElement onBoard = wait.until(ExpectedConditions.presenceOfElementLocated(click_On_Group_Chat));
        onBoard.click();
    }

    // add new message
    By add_New_Msg = By.xpath("/html/body/div[1]/div[3]/div[1]/div[2]/div/div[2]/div/div/div/p");
    By click_Send_Msg_Btn = By.cssSelector("div.OverlayButton_container__3kxDV:nth-child(3)");

    // delete message
    By scrollToMsg = By.cssSelector("div.Message_container__3maDl:nth-child(1) > div:nth-child(1) > div");
    By clickIconDropdownOnMsg = By.cssSelector("div.Message_container__3maDl:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > svg");
    By selectDeleteMsgBtn = By.cssSelector(".MessageMenuPopUp_bodySection__BxPUp");
    By clicDeleteBtn = By.cssSelector(".Button_container__1WNuB");

    // attach/upload file
    By clickIconAttachFile = By.xpath("//input[@type='file']");
    String filename1 = "src/main/resources/gunung.jpg";
    File file1 = new File(filename1);
    String path1 = file1.getAbsolutePath();

    // mention other user
    By mentionUser = By.xpath("//*[contains(@data-index,'5')]");

    // user can see profile other user after click that has mention in message
    By seeProfile = By.cssSelector("#mentioned-user");

    public void clickMentionMsg() {
        WebElement profile = wait.until(ExpectedConditions.presenceOfElementLocated(seeProfile));
        profile.click();
    }

    // mention user
    public void metionOtherUser() {
        WebElement mention_User = wait.until(ExpectedConditions.presenceOfElementLocated(mentionUser));
        mention_User.click();
    }

    public void selectUser() {
        WebElement typeMsg = wait.until(ExpectedConditions.presenceOfElementLocated(add_New_Msg));
        typeMsg.sendKeys("@");
    }

    // add new message
    public void addNewMsg() {
        WebElement clickTypeMsg = wait.until(ExpectedConditions.presenceOfElementLocated(add_New_Msg));
        clickTypeMsg.click();
    }

    public void typeNewMsg() {
        WebElement typeMsg = wait.until(ExpectedConditions.presenceOfElementLocated(add_New_Msg));
        typeMsg.sendKeys("Halo");
    }

    public void clickSendMsgBtn() {
        WebElement sendMsgBtn = wait.until(ExpectedConditions.presenceOfElementLocated(click_Send_Msg_Btn));
        sendMsgBtn.click();
    }

    // delete message
    public void scrollToMsg() {
        WebElement scrollMsg = wait.until(ExpectedConditions.presenceOfElementLocated(scrollToMsg));
        Actions actions = new Actions(driver);
        actions.moveToElement(scrollMsg);
        actions.perform();
    }

    public void clickIconDropdownOnMsg() {
        WebElement dropDownMsg = wait.until(ExpectedConditions.presenceOfElementLocated(clickIconDropdownOnMsg));
        Actions actions = new Actions(driver);
        actions.moveToElement(dropDownMsg);
        actions.click().build().perform();

    }

    public void selectDeleteMsgBtn() {
        WebElement deleteMsgBtn = wait.until(ExpectedConditions.presenceOfElementLocated(selectDeleteMsgBtn));
        deleteMsgBtn.click();
    }

    public void clickDeleteBtn() {
        WebElement deleteBtn = wait.until((ExpectedConditions.presenceOfElementLocated(clicDeleteBtn)));
        deleteBtn.click();
    }

    // attach/upload file
    public void inputAttachfile() {
        System.out.println("Upload file"+path1);
        driver.findElement(clickIconAttachFile).sendKeys(path1);
    }
}
