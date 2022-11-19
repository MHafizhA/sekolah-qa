package ProjectCicleApp.StepsDefinition;

import ProjectCicleApp.Config.BaseClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.Setting;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class StepsBoard {
    static AppiumDriver<MobileElement> driver;

    static DesiredCapabilities capabilities;

    //PASCA01-Positive
    @Given("User open staging-cicle on mobile")
    public void user_open_staging_cicle_on_mobile() throws Exception {
        capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "ASUS X00TD");
        capabilities.setCapability("udid", "J5AXGF01Z258EJ6");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "9");
        capabilities.setCapability("appPackage", "staging.cicle");
        capabilities.setCapability("appActivity", "staging.cicle.MainActivity");
        capabilities.setCapability("noReset", true);
//            capabilities.setCapability("skipDeviceInitialization", true);
//            capabilities.setCapability("skipServerInstallation", true);
//            capabilities.setCapability("ignoreUnimportantViews", true);
//            capabilities.setCapability("appium:newCommandTimeout", 10000);
//            capabilities.setCapability("appium:ensureWebviewsHavePages", true);


        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AppiumDriver<MobileElement>(url, capabilities);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.setSetting(Setting.WAIT_FOR_IDLE_TIMEOUT, 100);

    }

    @When("User Tap on Sekolah QA in Team menu")
    public void user_tap_on_sekolah_qa_in_team_menu() throws Exception{
        Thread.sleep(3000);
        MobileElement TapSekolaQA = driver.findElementByAccessibilityId("Sekolah QA\n" +
                "Team B");
        TapSekolaQA.click();
    }

    @And("User Tap on Board menu")
    public void user_tap_on_board_menu() throws Exception {
        Thread.sleep(3000);
        MobileElement TapBoardMenu = driver.findElementByAccessibilityId("Board");
        TapBoardMenu.click();
    }

    @Then("user can see inside Board menu")
    public void user_can_see_inside_board_menu() throws Exception {
        Thread.sleep(3000);
        Assert.assertTrue(driver.findElementByAccessibilityId("Board").isDisplayed());
    }

    //PASCA02-Positive
    @And("User Tap on button +")
    public void userTapOnButton() throws Exception {
        MobileElement AddNewBoard = driver.findElement(By.xpath("//android.widget.Button[@index = 2]"));
        Thread.sleep(5000);
        AddNewBoard.click();
    }

    @And("User type Test Board")
    public void userTypeTestBoard() throws Exception {
        MobileElement TypeNameBoard = driver.findElement(By.xpath("//android.widget.EditText[@index = 1]"));
        Thread.sleep(3000);
        TypeNameBoard.click();
        Thread.sleep(3000);
        TypeNameBoard.sendKeys("Test Board 1");
    }

    @And("User Tap button submit")
    public void userTapButtonSubmit() throws Exception {
        MobileElement TapBtnSubmit = driver.findElementByAccessibilityId("Submit");
        Thread.sleep(3000);
        TapBtnSubmit.click();
    }

    @Then("user see a new board")
    public void userSeeANewBoard() throws Exception {
        Thread.sleep(3000);
        Assert.assertTrue(driver.findElementByAccessibilityId("Test Board 1").isDisplayed());
        Thread.sleep(3000);
//        driver.quit();
    }

    //PASCA03-Positive
    @And("User Tap on icon + add new card on Test Board1")
    public void userTapOnIconAddNewCardOnTestBoard() throws Exception {
        MobileElement AddNewCard = driver.findElementByAccessibilityId("Add new card");
        Thread.sleep(3000);
        AddNewCard.click();
    }

    @And("User type on your card name Pertemuan1")
    public void userTypeOnYourCardNamePertemuan() throws Exception {
        MobileElement TypeNameBoard = driver.findElement(By.xpath("//android.widget.EditText[@index = 1]"));
        Thread.sleep(3000);
        TypeNameBoard.click();
        Thread.sleep(3000);
        TypeNameBoard.sendKeys("Pertemuan 1");
    }

    @And("User Tap on button Check")
    public void userTapOnButtonCheck() throws Exception {
        MobileElement TapBtnSubmit = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Private Card\"]/android.widget.EditText/android.view.View"));
        Thread.sleep(3000);
        TapBtnSubmit.click();
    }

    @Then("user see a new card")
    public void userSeeANewCard() throws Exception {
        Thread.sleep(3000);
        Assert.assertTrue(driver.findElementByAccessibilityId("Pertemuan 1\n" +
                "Show menu").isDisplayed());
        Thread.sleep(3000);
//        driver.quit();
    }

    //PASCA04-Positive
    @And("User Tap on card Test Board1")
    public void userTapOnCardTestBoard() throws Exception {
        MobileElement OpenCard = driver.findElement(By.xpath("//android.widget.Button[@index = 0]"));
        Thread.sleep(3000);
        OpenCard.click();
        Thread.sleep(3000);
    }

    @And("User Tap on icon pencil next title card")
    public void userTapOnIconPencilNextTitleCard() throws Exception {
        MobileElement EditTitle = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Pertemuan 1\"]/android.view.View[2]/android.view.View/android.view.View/android.view.View[1]"));
        Thread.sleep(3000);
        EditTitle.click();
        Thread.sleep(3000);
    }

    @And("User Type and chenge pertemuan1 to Materi1")
    public void userTypeAndChengePertemuanToMateri() throws Exception {
        MobileElement TypeEditTitle = driver.findElement(By.xpath("//android.widget.EditText[@index = 0]"));
        TypeEditTitle.click();
        TypeEditTitle.sendKeys("Materi 1");
        Thread.sleep(3000);
    }

    @And("User Tap on icon Checklist next title card")
    public void userTapOnIconChecklistNextTitleCard() throws Exception {
        MobileElement TapBtnChecklist = driver.findElement(By.xpath("//android.widget.Button[@index = 1]"));
        Thread.sleep(3000);
        TapBtnChecklist.click();
        Thread.sleep(3000);
    }

    @Then("User can see Popup message update succesfully")
    public void userCanSeePopupMessageUpdateSuccesfully() throws Exception {
        Thread.sleep(3000);
        Assert.assertTrue(driver.findElementByAccessibilityId("Materi 1").isDisplayed());
        Thread.sleep(3000);
//        driver.quit();

    }

    //PASCA05-Positive
    @And("User Tap on button label")
    public void userTapOnButtonLabel() throws Exception {
        Thread.sleep(5000);
        MobileElement AddLabel = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Materi 1\"]/android.view.View[2]/android.view.View/android.view.View/android.view.View[3]"));
        Thread.sleep(3000);
        AddLabel.click();
    }

    @And("User Tap on Name Your label")
    public void userTapOnNameYourLabel() throws Exception {
        MobileElement TypeNameYourLabel = driver.findElement(By.xpath("//android.widget.EditText[@text = \"Name your label...\"]"));
        Thread.sleep(3000);
        TypeNameYourLabel.click();
    }

    @And("User Type Pertemuan_1")
    public void userTypePertemuan() throws Exception {
        MobileElement TypeNameYourLabel = driver.findElement(By.xpath("//android.widget.EditText[@text = \"Name your label...\"]"));
        Thread.sleep(3000);
        TypeNameYourLabel.sendKeys("pertemuan 1");
        driver.navigate().back();
    }

    @And("User Tap on button submit")
    public void userTapOnButtonSubmit() throws Exception {
        MobileElement TapBtnSubmit = driver.findElement(By.xpath("//android.widget.Button[@index = 42]"));
        Thread.sleep(3000);
        TapBtnSubmit.click();
    }

    @Then("user can add succesfully")
    public void userCanAddSuccesfully() {
    }

    @When("user Tap on label Pertemuan1")
    public void userTapOnLabelPertemuan() throws Exception {
        MobileElement TapToggleLabel = driver.findElementByAccessibilityId("pertemuan 1");
        Thread.sleep(3000);
        TapToggleLabel.click();
    }

    @Then("User can toggle succesfully")
    public void userCanToggleSuccesfully() throws Exception {
        Thread.sleep(3000);
        driver.closeApp();
    }

    //PASCA06-Negative
    @And("User Tap on icon +")
    public void userTapOnIcon() throws Exception {
        Thread.sleep(3000);
        MobileElement AddNewBoard = driver.findElement(By.xpath("//android.widget.Button[@index = 2]"));
        Thread.sleep(3000);
        AddNewBoard.click();
    }

    @And("User Tap on button submit+")
    public void userTapOnButtonSubmit2() throws Exception {
        MobileElement TapBtnSubmit = driver.findElementByAccessibilityId("Submit");
        Thread.sleep(3000);
        TapBtnSubmit.click();
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().back();
    }

    @Then("user can't add new board")
    public void userCanTAddNewBoard() {
    }

    //PASCA07-Negative
    @And("User Tap on icon + add new card on Test Board_1")
    public void userTapOnIconAddNewCardOnTestBoard_1() throws Exception {
        MobileElement InAddNewCard = driver.findElementByAccessibilityId("Add new card");
        Thread.sleep(3000);
        InAddNewCard.click();
    }

    @And("User Tap on icon Checklist")
    public void userTapOnIconChecklist() throws Exception {
        MobileElement TapBtnChecklist = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Private Card\"]/android.widget.EditText/android.view.View"));
        Thread.sleep(3000);
        TapBtnChecklist.click();
    }

    @Then("User can't add new card in Board list")
    public void userCanTAddNewCardInBoardList() {
    }

    //PASCA08-Negative
    @And("User Tap on Card Materi_1 in Board Test Board_1")
    public void userTapOnCardMateriInBoardTestBoard() throws Exception {
        MobileElement OpenCard = driver.findElementByAccessibilityId("pertemuan 1\n" +
                "Materi 1\n" +
                "Show menu");
        Thread.sleep(3000);
        OpenCard.click();
        Thread.sleep(3000);
    }

    @And("User Tap on add new comment")
    public void userTapOnAddNewComment() throws Exception {
        MobileElement TapAddNewComment = driver.findElementByAccessibilityId("Add new comment...");
        Thread.sleep(3000);
        TapAddNewComment.click();
    }

    @And("User Tap on button submitCM")
    public void userTapOnButtonSubmitCM() throws Exception {
        MobileElement TapBtnSubmit = driver.findElementByAccessibilityId("submit");
        Thread.sleep(3000);
        TapBtnSubmit.click();
        driver.navigate().back();
    }

    @Then("User can't add new comment")
    public void UserCantAddNewComment() {
    }

    //PASCA09-Negative
    @And("User Tap on Card Materi1 in Board Test Board_1")
    public void userTapOnCardMateri1InBoardTestBoard1() throws Exception {
//        MobileElement OpenCard = driver.findElementByAccessibilityId("pertemuan 1\n" +
//                "Materi 1\n" +
//                "Show menu");
//        Thread.sleep(3000);
//        OpenCard.click();
//        Thread.sleep(3000);
    }

    @And("User Tap on icon pencil on description")
    public void userTapOnIconPencilOnDescription() throws Exception {
        MobileElement TapAddDescription = driver.findElement(By.xpath("//android.view.View[@index = 5]"));
        Thread.sleep(5000);
        TapAddDescription.click();
    }

    @And("user Tap on button Publish")
    public void userTapOnButtonPublish() throws Exception {
        MobileElement TapBtnPublish = driver.findElementByAccessibilityId("Publish");
        Thread.sleep(3000);
        TapBtnPublish.click();
    }

    @Then("user can't add description")
    public void userCanTAddDescription() {
    }

    //PASCA10-Negative
    @And("User Tap on button + on label")
    public void userTapOnButtonOnLabel() throws Exception {
        MobileElement TapAddLabel = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Materi 1\"]/android.view.View[2]/android.view.View/android.view.View/android.view.View[3]"));
        Thread.sleep(3000);
        TapAddLabel.click();
    }

    @And("User Tap on button Create new label")
    public void userTapOnButtonCreateNewLabel() throws Exception {
        MobileElement TapCreateNewLabel = driver.findElementByAccessibilityId("Create new label");
        Thread.sleep(3000);
        TapCreateNewLabel.click();
    }

    @And("User Tap on button submit_4")
    public void userTapOnButtonSubmit_4() throws Exception {
        MobileElement TapBtnSubmit = driver.findElementByAccessibilityId("submit");
        Thread.sleep(3000);
        TapBtnSubmit.click();
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().back();
    }

    @Then("User can't add new label")
    public void userCanTAddNewLabel() {
    }

}
