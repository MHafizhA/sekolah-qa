package com.hafizh.stepsDefs;

import com.hafizh.base.BaseSetup;
import com.hafizh.pages.BoardPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class stepsBoard extends BaseSetup {

    BoardPage boardPage;

    //WASC01-Positive-Add-new-board-list
    @Given("user navigate to board page")
    public void userNavigateToBoardPage() throws Exception {
        initialization();
        boardPage = new BoardPage();
        boardPage.clickOnTeam();
        boardPage.clickOnBoard();
        Thread.sleep(3000);
    }

    @When("user click add list")
    public void userClickAddList() throws Exception {
        boardPage.clickAddList();
        Thread.sleep(3000);
    }

    @And("user input list name")
    public void userInputListName() throws Exception {
        boardPage.inputListName();
        Thread.sleep(3000);
    }

    @And("user click button create")
    public void userClickButtonCreate() throws Exception {
        boardPage.clickCreateListBtn();
        Thread.sleep(3000);
    }

    @Then("user succesfully add new board list")
    public void userSuccesfullyAddNewBoardList() throws Exception  {
        Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),'Creating list is success')]")).isDisplayed());
        Thread.sleep(3000);
        driver.quit();

    }


    //WASC02-Positive-Add-new-card-in-board-list
    @When("User click on icon + add new card on hafizh list")
    public void userClickOnIconAddNewCardOnHafizhList()  {
        boardPage.clickAddCard();
    }

    @And("User type Pertemuan 1")
    public void userTypePertemuan1() throws Exception {
        boardPage.inputCardName();
        Thread.sleep(3000);
    }

    @And("User click on button check")
    public void userClickOnButtonCheck() throws Exception {
        boardPage.ClickAddCardBtn();
        Thread.sleep(3000);
    }

    @Then("User successfully add new card")
    public void userSuccessfullyAddNewCard() throws Exception {
        Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),'Creating card is success')]")).isDisplayed());
        Thread.sleep(3000);
        driver.quit();
    }

    //WASC03-Edit-title-on-card-in-board-list
    @When("User click on icon pencil next title card")
    public void userClickOnIconPencilNextTitleCard() throws Exception {
        boardPage.clickEditCard();
        Thread.sleep(3000);
    }
    @And("User click on change name")
    public void userClickOnChangeName() throws Exception {
        boardPage.clickChangeName();
        Thread.sleep(3000);
    }

    @And("User type and change pertemuan 1 to materi 1")
    public void userTypeAndChangePertemuanToMateri() throws Exception {
        boardPage.inputChangeName();
        Thread.sleep(3000);
    }

    @And("User click save button")
    public void userClickOnSaveButton() throws Exception {
        boardPage.clickSaveBtn();
        Thread.sleep(3000);
    }

    @Then("User successfully update title card")
    public void userSuccessfullyUpdateTitleCard() throws Exception {
        Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),'Update card is success')]")).isDisplayed());
        Thread.sleep(3000);
        driver.quit();
    }

    //@WASC04-Change-due-date-on-card
    @And("user click quick comment")
    public void userClickQuickComment() throws Exception {
        boardPage.clickQuickComment();
        Thread.sleep(3000);
    }

    @And("user click add new comment")
    public void userClickAddNewComment() throws Exception {
        boardPage.clickAddNewComment();
        Thread.sleep(3000);
    }

    @And("user click Tell your story here")
    public void userClickTellYourStoryHere() throws Exception {
        boardPage.inputNewComment();
        Thread.sleep(3000);
    }

    @And("user input new comment")
    public void userInputNewComment() throws Exception {
        boardPage.inputNewComment();
        Thread.sleep(3000);
    }

    @And("user click post")
    public void userClickPost() throws Exception {
        boardPage.clickPost();
        Thread.sleep(3000);
    }

    @Then("user successfully add quick comment")
    public void userSuccessfullyAddQuickComment() throws Exception {
        Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),'Create comment is success')]")).isDisplayed());
        driver.quit();
        Thread.sleep(3000);
    }

    //WASC05-Delete-comment-on-card
    @When("user click on card materi 1")
    public void userClickOnCardMateri1() throws Exception {
        boardPage.clickOnCard();
        Thread.sleep(3000);
    }

    @And("user scroll to comment")
    public void userScrollToComment() throws Exception {
        boardPage.scrollToComment();
        Thread.sleep(3000);
    }

    @And("user click dot3 on comment")
    public void userClickDotOnComment3() throws Exception {
        boardPage.clickDot3();
        Thread.sleep(3000);
    }

    @And("user click on delete")
    public void userClickOnDelete() throws Exception {
        boardPage.clickDelete();
        Thread.sleep(3000);
    }

    @And("user click on delete button")
    public void userClickOnDeleteButton() throws Exception {
        boardPage.clickDeleteBtn();
        Thread.sleep(3000);
    }

    @Then("user successfully delete comment")
    public void userSuccessfullyDeleteComment() throws Exception {
        Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),'delete comment is success')]")).isDisplayed());
        driver.quit();
        Thread.sleep(3000);
    }

    //WASC17-Invalid=-add-new-board-list
    @And("user empty list name")
    public void userEmptyListName() {
    }

    @Then("user failed to add new board list")
    public void userFailedToAddNewBoardList() throws Exception {
        Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),'List name cannot be empty')]")).isDisplayed());
        Thread.sleep(3000);
        driver.quit();
    }
}
