package com.hafizh.stepsDefs;

import com.hafizh.base.BaseSetup;
import com.hafizh.pages.BlastPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class stepsBlast extends BaseSetup {

    BlastPage blastPage;

    // WASC08-add-new-blast
    @Given("user navigate to blast page")
    public void userNavigateToBlastPage() throws Exception {
        initialization();
        blastPage = new BlastPage();
        blastPage.clickOnTeam();
        blastPage.clickOnBlast();
        Thread.sleep(3000);

    }

    @When("user click on create blast button")
    public void userClickOnCreateBlastButton() {
        blastPage.clickCreateBlast();
    }

    @And("user click on Type a title field")
    public void userClickOnTypeATitleField() {
        blastPage.clickTitleBlast();
    }

    @And("user type title blast")
    public void userTypeTitleBlast() {
        blastPage.inputTitleBlast();
    }

    @And("user click on Tell your story here")
    public void userClickOnTellYourStoryHere() {
        blastPage.clickTellYourStory();
    }

    @And("user type Tell your story here")
    public void userTypeTellYourStoryHere() {
        blastPage.inputTellYourStory();
    }

    @And("user click button publish")
    public void userClickButtonPublish() {
        blastPage.clickPublishBtn();
    }

    @Then("user successfully add new blast")
    public void userSuccessfullyAddNewBlast() {
        Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),'Create post successful')]")).isDisplayed());
        driver.quit();
    }

    // WASC09-user-can-open-sent-blast
    @When("user click on sent post blast")
    public void userClickOnSentPostBlast() {
        blastPage.clickOnSentPostblast();
    }

    @Then("user succesfully open blast")
    public void userSuccesfullyOpenBlast() {
//        Assert.assertTrue(driver.findElement(By.xpath("//*[contains(@placeholder,'Type a title...')]")).isDisplayed());
        driver.quit();
    }

    // WASC10-edit-title-and-description-sent-post-Blast
    @And("user click on dot 3 button")
    public void userClickOnDotButton() {
        blastPage.clickDot3Btn();
    }

    @And("user click on icon edit")
    public void userClickOnIconEdit() {
        blastPage.clickIconPencil();
    }

    @And("user click title blast")
    public void userClickTitleBlast() {
        blastPage.clickTitleBlast();
    }

    @And("user type and change title blast")
    public void userTypeAndChangeTitleBlast() {
        blastPage.clickTellYourStory();
    }

    @And("user click on save Changes button")
    public void userClickOnSaveChangesButton() {
        blastPage.clickSaveChangeBtn();
    }

    @Then("user succesfully edit title blast")
    public void userSuccesfullyEditTitleBlast() {
        Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),'Update post successful')]")).isDisplayed());
        driver.quit();
    }

    // WASC11-add-new-comment-in-post-blast

    @And("user click add new comment in post blast")
    public void userClickAddNewCommentInPostBlast() {
        blastPage.clickAddNewCommentBlast();
    }
    @And("user type comment")
    public void userTypeComment() {
        blastPage.typeComment();
    }

    @And("user click button post")
    public void userClickButtonPost() {
        blastPage.clickPostBtn();
    }

    @Then("user succesfully add new comment in post blast")
    public void userSuccesfullyAddNewCommentInPostBlast() {
        Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),'Create comment on blast post successful')]")).isDisplayed());
        driver.quit();
    }

    // WASC12-Negative-invalid-add-new-blast-with
    @And("user empty field Type a title")
    public void userEmptyFieldTypeATitle() {

    }

    @And("user click publish button")
    public void userClickPublishButton() {
        blastPage.clickPublishBtn();
    }

    @Then("user failed to add new blast")
    public void userFailedToAddNewBlast() {
        Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),'Field parameter not complete.')]")).isDisplayed());
        driver.quit();
    }

    //WASC16-Positive-delete-comment-in-post-blast
    @When("user click on sent post blast comment")
    public void userClickOnSentPostBlastComment() {
        blastPage.clickSentPostBlastDelete();
    }
    @And("user click on sent comment dot 3")
    public void userClickOnSentCommentDot3() {
        blastPage.clickDot3Comment();
    }

    @And("user select delete icon")
    public void userSelectDeleteIcon() {
        blastPage.selectDeleteIcon();
    }

    @And("user click delete button")
    public void userClickDeleteButton() {
        blastPage.deleteBtnComment();
    }

    @Then("user succesfully delete comment in sent post blast")
    public void userSuccesfullyDeleteCommentInSentPostBlast() {
        Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),'Delete comment on blast post successful')]")).isDisplayed());
        driver.quit();
    }


}
