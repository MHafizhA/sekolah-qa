package com.hafizh.pages;

import com.hafizh.base.BaseSetup;
import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.time.Duration;

public class BoardPage extends BaseSetup {

    WebDriverWait wait = new WebDriverWait(driver, 5, 5);
    public BoardPage() {
            PageFactory.initElements(driver, "https://staging.cicle.app/companies/61eba2c85080f47b25ddc8f8/teams/636b9e72aa1f4a00a8ab27f8/boards/636b9e72aa1f4a00a8ab286c");
    }

    By click_On_Team = By.xpath("//*[contains(text(),'Cicle Bug & Feature Request')]");
    By click_On_Board = By.cssSelector("div.TeamPage_rowBox__zylkg:nth-child(2) > div:nth-child(1) > a:nth-child(1) > div:nth-child(1)");

    public void clickOnTeam() {
        WebElement onTeam = wait.until(ExpectedConditions.presenceOfElementLocated(click_On_Team));
        onTeam.click();
    }

    public void clickOnBoard() {
        WebElement onBoard = wait.until(ExpectedConditions.presenceOfElementLocated(click_On_Board));
        onBoard.click();
    }



    // add new list
    By add_List = By.xpath("//*[contains(text(),'Add List')]");
    By input_List_Name = By.xpath("//input[@name=\"name\"]");
    By btn_Creat_List = By.xpath("//button[@class=\"btn btn-success btn-sm\"]");

    // add new card
    By click_Add_Card = By.xpath("//*[contains(text(),'Add Card')]");
    By input_Card_Name = By.xpath("//input[@placeholder=\"Card name\"]");
    By click_Add_Card_Btn = By.xpath("//button[@class=\"btn btn-success btn-sm\"]");

    // edit title card
    By click_Edit_Card = By.id("editCardMenu");
    By click_Change_Name = By.id("editCardMenuButton__Name__text");
    By click_Save_Btn = By.xpath("//button[@class=\"btn btn-success btn-sm\"]");
    By input_Change_Name = By.name("name");

    // change due date
    By clickEditDueDate = By.id("editCardMenuButton__Date__text");
    By clickFieldDate = By.xpath("//input[@placeholder='yyyy/mm/dd']");
    By clickFieldTime = By.xpath("//input[@placeholder='hh:mm (a|p)m']");
    By clickChooseDate = By.xpath("//button[@aria-label='Nov 30, 2022']");
    By clickIconDate = By.xpath("//button[@aria-label='Choose date, selected date is Nov 28, 2023']");

    // add quick comment
    By clickQuickComment = By.xpath("//*[contains(text(),'Quick Comment')]");
    By clickAddNewComment = By.xpath("//input[@placeholder='Add new comment...']");
    By inputNewcomment = By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[1]/div/div/div[1]/div[2]/div[2]/div[3]/div/div/div/div[1]/div/div[2]/div[2]/div[1]/div/div/div[2]/div");
    By clickPost = By.xpath("//*[contains(text(),'Post')]");

    // delete comment on card
    By clickOnCard = By.cssSelector(".ModalLinkNoDecor_ModalLink__1zSCj");
    By clickDot3 = By.cssSelector(".More_container__2VGML > svg:nth-child(1)");
    By scrollToComment = By.cssSelector(".CommentItem_commentTextContainer__8Gd1V");
    By clickDelete = By.xpath("//*[contains(text(),'Delete')]");
    By clickDeleteBtn = By.cssSelector(".Main_iconDanger__LRdQD > h1:nth-child(1)");
//    delete comment is success






    // add new list
    public void clickAddList() {
        WebElement clicBtn = wait.until(ExpectedConditions.presenceOfElementLocated(add_List));
        clicBtn.click();
//        driver.findElement(addList).click();
    }
    public void inputListName() {
        driver.findElement(input_List_Name).sendKeys("hafizh list");
    }
    public void clickCreateListBtn() {
        driver.findElement(btn_Creat_List).click();
    }

    // add new card
    public void clickAddCard() {
        WebElement addCard = wait.until(ExpectedConditions.presenceOfElementLocated(click_Add_Card));
        addCard.click();
    }

    public void inputCardName() {
        WebElement typeCardName = wait.until(ExpectedConditions.presenceOfElementLocated(input_Card_Name));
        typeCardName.sendKeys("Pertemuan 1");
    }

    public void ClickAddCardBtn() {
        WebElement addCardBtn = wait.until(ExpectedConditions.presenceOfElementLocated(click_Add_Card_Btn));
        addCardBtn.click();
    }

    // edit title card
    public void clickEditCard() {
        WebElement editCard = wait.until(ExpectedConditions.presenceOfElementLocated(click_Edit_Card));
        editCard.click();
    }

    public void clickChangeName() {
        WebElement changeName = wait.until(ExpectedConditions.presenceOfElementLocated(click_Change_Name));
        changeName.click();
    }

    public void inputChangeName() {
        WebElement typeChangeName = wait.until(ExpectedConditions.presenceOfElementLocated(input_Change_Name));
        typeChangeName.clear();
        typeChangeName.sendKeys("Materi 1");
    }

    public void clickSaveBtn() {
        WebElement saveBtn = wait.until(ExpectedConditions.presenceOfElementLocated(click_Save_Btn));
        saveBtn.click();
    }

    // change due date
    public void clickEditDueDate() {
        WebElement editDueDate = wait.until(ExpectedConditions.presenceOfElementLocated(clickEditDueDate));
        editDueDate.click();
    }

    public void clickFieldDate() {
        WebElement fieldDate = wait.until(ExpectedConditions.presenceOfElementLocated(clickFieldDate));
        fieldDate.click();
    }

    public void inputNewDueDate() {
        WebElement newDueDate = wait.until(ExpectedConditions.presenceOfElementLocated(clickFieldDate));
        newDueDate.sendKeys(Keys.DELETE);
        newDueDate.sendKeys("2023/01/01");
    }

    public void clickFieldTime() {
        WebElement fieldTime = wait.until(ExpectedConditions.presenceOfElementLocated(clickFieldTime));
        fieldTime.click();
    }

    public void inputNewTime() {
        WebElement newTime = wait.until(ExpectedConditions.presenceOfElementLocated(clickFieldTime));
        newTime.sendKeys(Keys.DELETE);
        newTime.sendKeys("00:00 PM");
    }

    public void clickIconDate() {
        WebElement iconDate = wait.until(ExpectedConditions.presenceOfElementLocated(clickIconDate));
        iconDate.click();
    }

    public void clickChooseDate() {
        WebElement chooseDate = wait.until(ExpectedConditions.presenceOfElementLocated(clickChooseDate));
        chooseDate.click();
    }

    // add new quick comment on card
    public void clickQuickComment() {
        WebElement quickComment = wait.until(ExpectedConditions.presenceOfElementLocated(clickQuickComment));
        quickComment.click();
    }

    public void clickAddNewComment() {
        WebElement addNewComment = wait.until(ExpectedConditions.presenceOfElementLocated(clickAddNewComment));
        addNewComment.click();
    }

    public void inputNewComment() {
        WebElement newComment = wait.until(ExpectedConditions.presenceOfElementLocated(inputNewcomment));
        newComment.sendKeys("halo");
    }

    public void clickPost() {
        WebElement postBtn = wait.until(ExpectedConditions.presenceOfElementLocated(clickPost));
        postBtn.click();
    }

    // delete comment on card
    public void clickOnCard() {
        WebElement clickCard = wait.until(ExpectedConditions.presenceOfElementLocated(clickOnCard));
        clickCard.click();
    }

    public void scrollToComment() {
        WebElement scrollComment = wait.until(ExpectedConditions.presenceOfElementLocated(scrollToComment));
        Actions actions = new Actions(driver);
        actions.moveToElement(scrollComment);
        actions.perform();
    }

    public void clickDot3() {
        WebElement dot3 = wait.until(ExpectedConditions.presenceOfElementLocated(clickDot3));
        dot3.click();

    }

    public void clickDelete() {
        WebElement iconDelete = wait.until(ExpectedConditions.presenceOfElementLocated(clickDelete));
        iconDelete.click();

    }

    public void clickDeleteBtn() {
        WebElement deleteBtn = wait.until(ExpectedConditions.presenceOfElementLocated(clickDeleteBtn));
        deleteBtn.click();
    }

}
