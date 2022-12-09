package com.hafizh.pages;

import com.hafizh.base.BaseSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BlastPage extends BaseSetup {

    WebDriverWait wait = new WebDriverWait(driver, 5, 5);

    public BlastPage() {
        PageFactory.initElements(driver,"https://staging.cicle.app/companies/61eba2c85080f47b25ddc8f8/teams/636b9e72aa1f4a00a8ab27f8/blasts/636b9e72aa1f4a00a8ab286e");
    }

    By click_On_Team = By.xpath("//*[contains(text(),'Cicle Bug & Feature Request')]");
    By click_On_Blast = By.cssSelector("div.PostSnapshot_outerContainer__2TueU:nth-child(1)");

    public void clickOnTeam() {
        WebElement onTeam = wait.until(ExpectedConditions.presenceOfElementLocated(click_On_Team));
        onTeam.click();
    }

    public void clickOnBlast() {
        WebElement onBlast = wait.until(ExpectedConditions.presenceOfElementLocated(click_On_Blast));
        onBlast.click();
    }

    // add new blast
    By createBlast = By.xpath("//*[contains(text(),'Create Blast')]");
    By clickTitleBlast = By.xpath("//*[contains(@placeholder,'Type a title...')]");
    By clickTellYourStory = By.cssSelector(".fr-element");
    By clickPublishBtn = By.xpath("//*[contains(text(),'Publish')]");

    // open sent post Blast
    By clickSentPostBlast = By.cssSelector("div.Post_container__3xxgM:nth-child(1)");

    // edit title sent post Blast
    // --> clickSentPostBlast ,clickTitleBlast , clickTellYourStory
    By Dot3Btn = By.cssSelector(".More_container__2VGML > svg:nth-child(1)");
    By InconPencil = By.cssSelector("div.Item_container__3qBQE:nth-child(1)");

    By saveChangeBtn = By.xpath("//*[contains(text(),'Save Changes')]");

    // add new comment in post blast
    // --> clickSentPostBlast
    By clickAddNewComment_Blast = By.xpath("//*[contains(@placeholder,'Add new comment...')]");
    By TypeComment = By.cssSelector(".fr-element");
    By PostBtn = By.xpath("//*[contains(text(),'Post')]");

    // invalid add new blast
    // --> createBlast, clickPublishBtn

    // delete message in sent post blast
    By SentPostBlastDelete = By.cssSelector("div.Post_container__3xxgM:nth-child(1) > a:nth-child(1) > div:nth-child(1)");
    By dot3comment = By.xpath("//*[contains(@data-testid,'MoreHorizOutlinedIcon')]");
    By selectDelete = By.cssSelector("div.Item_container__3qBQE:nth-child(3) > div:nth-child(2) > p:nth-child(1)");
    By delete_Btn_Comment = By.cssSelector("div.MuiBox-root:nth-child(2) > button:nth-child(1)");


    // delete message in sent post blast
    public void clickSentPostBlastDelete() {
        WebElement postBlast = wait.until(ExpectedConditions.presenceOfElementLocated(SentPostBlastDelete));
        postBlast.click();
    }

    public void clickDot3Comment() {
        WebElement dot3 = wait.until(ExpectedConditions.presenceOfElementLocated(dot3comment));
        dot3.click();
    }

    public void selectDeleteIcon() {
        WebElement deleteIcon = wait.until(ExpectedConditions.presenceOfElementLocated(selectDelete));
        deleteIcon.click();
    }

    public void deleteBtnComment() {
        WebElement deleteBtn = wait.until(ExpectedConditions.presenceOfElementLocated(delete_Btn_Comment));
        deleteBtn.click();
    }

    public void clickAddNewCommentBlast() {
        WebElement addNewComment = wait.until(ExpectedConditions.presenceOfElementLocated(clickAddNewComment_Blast));
        addNewComment.click();
    }
    public void typeComment() {
        WebElement comment = wait.until(ExpectedConditions.presenceOfElementLocated(TypeComment));
        comment.sendKeys("halo");
    }

    public void clickPostBtn() {
        WebElement postBtn = wait.until(ExpectedConditions.presenceOfElementLocated(PostBtn));
        postBtn.click();
    }

    // Edit title sent post Blast
    public void clickDot3Btn() {
        WebElement dot3Btn = wait.until(ExpectedConditions.presenceOfElementLocated(Dot3Btn));
        dot3Btn.click();
    }

    public void clickIconPencil() {
        WebElement iconPencil = wait.until(ExpectedConditions.presenceOfElementLocated(InconPencil));
        iconPencil.click();
    }

    public void clickSaveChangeBtn() {
        WebElement saveChange = wait.until(ExpectedConditions.presenceOfElementLocated(saveChangeBtn));
        saveChange.click();
    }

    // open sent post Blast
    public void clickOnSentPostblast() {
        WebElement sentPostBlast = wait.until(ExpectedConditions.presenceOfElementLocated(clickSentPostBlast));
        sentPostBlast.click();
    }


    // add new blast
    public void clickCreateBlast() {
        WebElement createBlastbtn = wait.until(ExpectedConditions.presenceOfElementLocated(createBlast));
        createBlastbtn.click();
    }

    public void clickTitleBlast() {
        WebElement titleBlast = wait.until(ExpectedConditions.presenceOfElementLocated(clickTitleBlast));
        titleBlast.click();
    }

    public void inputTitleBlast() {
        WebElement titleBlast = wait.until(ExpectedConditions.presenceOfElementLocated(clickTitleBlast));
        titleBlast.sendKeys("materi 3");
    }

    public void clickTellYourStory() {
        WebElement tellyourStory = wait.until(ExpectedConditions.presenceOfElementLocated(clickTellYourStory));
        tellyourStory.click();
    }

    public void inputTellYourStory() {
        WebElement tellYourStory = wait.until(ExpectedConditions.presenceOfElementLocated(clickTellYourStory));
        tellYourStory.sendKeys("pembahasan 3");
    }

    public void clickPublishBtn() {
        WebElement publishBtn = wait.until(ExpectedConditions.presenceOfElementLocated(clickPublishBtn));
        publishBtn.click();
    }
}
