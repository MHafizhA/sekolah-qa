package com.hafizh.stepsDefs;

import com.hafizh.base.BaseSetup;
import com.hafizh.pages.GroupChatPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class stepsGroupChat extends BaseSetup {

    GroupChatPage groupChatPage;

    @Given("user navigate to Group Chat page")
    public void userNavigateToGroupChatPage() throws Exception {
        initialization();
        groupChatPage = new GroupChatPage();
        groupChatPage.clickOnTeam();
        groupChatPage.clickOnGroupChat();
        Thread.sleep(3000);
    }

    @When("user click type message here")
    public void userClickTypeMessageHere() {
        groupChatPage.addNewMsg();
    }

    @And("user type message halo")
    public void userTypeMessageHalo() {
        groupChatPage.typeNewMsg();
    }

    @And("user click send message button")
    public void userClickSendMessageButton() {
        groupChatPage.clickSendMsgBtn();
    }

    @Then("user succesfully add new message in Group Chat")
    public void userSuccesfullyAddNewMessageInGroupChat() {
        driver.quit();
    }


    @When("user select message")
    public void userSelectMessage() throws Exception {
        groupChatPage.scrollToMsg();
        Thread.sleep(3000);
    }

    @And("user click icon drop down on message")
    public void userClickIconDropDownOnMessage() throws Exception {
        groupChatPage.clickIconDropdownOnMsg();
        Thread.sleep(3000);
    }

    @And("user select delete message button")
    public void userSelectDeleteMessageButton() throws Exception {
        groupChatPage.selectDeleteMsgBtn();
        Thread.sleep(3000);
    }

    @And("user click button delete")
    public void userClickButtonDelete() throws Exception {
        groupChatPage.clickDeleteBtn();
        Thread.sleep(3000);
    }
    @Then("user succesfully delete messsage")
    public void userSuccesfullyDeleteMesssage() {
        Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),'Delete group chat message success')]")).isDisplayed());
        driver.quit();
        //Delete group chat message success
    }


    @When("user input file")
    public void userInputFile() throws Exception {
        groupChatPage.inputAttachfile();
        Thread.sleep(3000);
    }

    @Then("user succesfully attach or upload file in group chat")
    public void userSuccesfullyAttachOrUploadFileInGroupChat() {
        driver.quit();
    }

    //WASC14-Positive-mention-other-user
    @And("user type @ and input the user")
    public void userTypeAndInputTheUser() {
        groupChatPage.selectUser();
        groupChatPage.metionOtherUser();
    }

    @Then("user succesfully mention other user")
    public void userSuccesfullyMentionOtherUser() {
        driver.quit();
    }

    //WASC15-Positive-see-profile-other-user
    @When("user click message that has mention user")
    public void userClickMessageThatHasMentionUser() {
        groupChatPage.clickMentionMsg();
    }

    @Then("user succesfully see other user profile")
    public void userSuccesfullySeeOtherUserProfile() {
        driver.quit();
    }

    //@WASC18-Negative-invalid-add-new-message
    @Then("user failed to add new message in group chat")
    public void userFailedToAddNewMessageInGroupChat() {
        driver.quit();
    }
}
