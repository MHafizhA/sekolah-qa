package ProjectCicleApp.StepsDefinition;

import ProjectCicleApp.Config.BaseClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.Setting;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class StepsInbox extends BaseClass {

    static AppiumDriver<MobileElement> driver;

    static DesiredCapabilities capabilities;

    //PASCA26-Positive
    @Given("User open staging-cicle on mobile <Inbox>")
    public void userOpenStagingCicleOnMobileIB() throws Exception {
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


    @When("User Tap on Menu")
    public void userTapOnMenu() throws Exception {
        Thread.sleep(3000);
        WebElement TapBoardMenu = driver.findElementByAccessibilityId("Menu\n" +
                "Tab 4 of 4");
        TapBoardMenu.click();
    }

    @And("User Tap on Inbox")
    public void userTapOnInbox() throws Exception {
        MobileElement TapInbox = driver.findElementByAccessibilityId("Inbox");
        Thread.sleep(3000);
        TapInbox.click();
    }

    @Then("User can see inside Inbox")
    public void userCanSeeInsideInbox() throws Exception {
        Thread.sleep(3000);
        Assert.assertTrue(driver.findElementByAccessibilityId("Inbox").isDisplayed());
    }

    //PASCA27-Positive
    @And("User Tap on new chat")
    public void userTapOnNewChat() throws Exception {
        WebElement TapNewChat = driver.findElement(By.xpath("//android.widget.Button[@index = 3]"));
        Thread.sleep(3000);
        TapNewChat.click();
    }

    @And("User Tap on user Muhammad Hafizh Abdillah")
    public void userTapOnUserMuhammadHafizhAbdillah() throws Exception {
        WebElement TapUser = driver.findElementByAccessibilityId("Muhammad Hafizh Abdillah");
        Thread.sleep(3000);
        TapUser.click();
    }

    @And("User Tap on type message <Inbox>")
    public void userTapOnTypeMessageIB() throws Exception {
        WebElement TapTypeMsg = driver.findElement(By.xpath("//android.widget.EditText[@text = \"type message...\"]"));
        Thread.sleep(3000);
        TapTypeMsg.click();
    }

    @And("User Type HalloIB")
    public void userTypeHalloIB() throws Exception {
        WebElement TapTypeMsg = driver.findElement(By.xpath("//android.widget.EditText[@text = \"type message...\"]"));
        Thread.sleep(3000);
        TapTypeMsg.sendKeys("Hallo");
    }

    @And("User Tap button SendIB")
    public void userTapButtonSendIB() throws Exception {
        WebElement TapBtnSend = driver.findElement(By.xpath("//android.widget.Button[@index = 5]"));
        Thread.sleep(3000);
        TapBtnSend.click();
        driver.navigate().back();
    }

    @Then("User succesfully send message")
    public void userSuccesfullySendMessage() {
    }

    //PASCA28-Positive
    @And("User Tap on icon mention <Inbox>")
    public void userTapOnIconMentionIB() throws Exception {
        MobileElement TapIconMT = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[3]"));
        Thread.sleep(3000);
        TapIconMT.click();
    }

    @And("User Tap on user Muhammad Hafizh AbdillahMT")
    public void userTapOnUserMuhammadHafizhAbdillahMT() throws Exception {
        Thread.sleep(5000);
        MobileElement TapUser = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Muhammad Hafizh Abdillah\"]"));
        Thread.sleep(3000);
        TapUser.click();
    }

    @And("User Tap on button send <Inbox>")
    public void userTapOnButtonSendIB() throws Exception {
        MobileElement TapBtnSend = driver.findElement(By.xpath("//android.widget.Button[@index = 5]"));
        Thread.sleep(3000);
        TapBtnSend.click();
    }

    @Then("User succesfully mention other user <Inbox>")
    public void userSuccesfullyMentionOtherUserIB() throws Exception {
        Thread.sleep(3000);
        Assert.assertTrue(driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Muhammad Hafizh Abdillah\"]")).isDisplayed());
    }


    @And("User Tap on sent message <Inbox Delete>")
    public void userTapOnSentMessageIB() throws Exception {
        MobileElement TapMsg = driver.findElementByAccessibilityId("Hallo\n" +
                "07:54 PM");
        Thread.sleep(3000);
        TapMsg.click();
    }

    @And("User Tap on Delete <Inbox>")
    public void userTapOnDeleteIB() throws Exception {
        MobileElement DeleteMsg = driver.findElementByAccessibilityId("Delete");
        Thread.sleep(3000);
        DeleteMsg.click();
    }

    @And("user Tap on Ok <Inbox>")
    public void userTapOnOkIB() throws Exception {
        MobileElement TapBtnOk = driver.findElementByAccessibilityId("Ok");
        Thread.sleep(3000);
        TapBtnOk.click();
    }

    @Then("User succesfully delete sent message <Inbox>")
    public void userSuccesfullyDeleteSentMessageIB() {
    }

    //PASCA30-Positive
    @And("User Tap on sent message <Inbox Select>")
    public void userTapOnSentMessageSL() throws Exception {
        MobileElement TapMsg = driver.findElementByAccessibilityId("Hallo\n" +
                "07:41 PM");
        Thread.sleep(3000);
        TapMsg.click();
    }

    @And("User Tap on Select")
    public void userTapOnSelect() throws Exception {
        MobileElement TapSelect = driver.findElementByAccessibilityId("Select");
        Thread.sleep(3000);
        TapSelect.click();
    }

    @And("User Tap on close")
    public void userTapOnClose() throws Exception {
        MobileElement TapClose = driver.findElement(By.xpath("//android.widget.Button[@index = 1]"));
        Thread.sleep(3000);
        TapClose.click();
    }

    @Then("User succesfully select message")
    public void userSuccesfullySelectMessage() {
    }

    //PASCA31-Negative
    @And("User Tap on sent message <Inbox Already>")
    public void userTapOnSentMessageAL() throws Exception {
        MobileElement TapMsg = driver.findElementByAccessibilityId("This message was deleted\n" +
                "08:07 PM");
        Thread.sleep(3000);
        TapMsg.click();
        Thread.sleep(3000);
        driver.navigate().back();
    }

    @Then("User unsuccesfully delete message that already deleted <Inbox>")
    public void userUnsuccesfullyDeleteMessageThatAlreadyDeletedAl() {
    }

    //PASCA32-Negative
    @And("User Tap on textbox")
    public void userTapOnTextbox() throws Exception {
        MobileElement TapMsg = driver.findElement(By.xpath("//android.widget.EditText[@text = \"type message...\"]"));
        Thread.sleep(3000);
        TapMsg.click();
    }

    @And("User Type @Muhammd Hafizh Abdillah")
    public void userTypeMuhammdHafizhAbdillah() throws Exception {
        MobileElement TapMsg = driver.findElement(By.xpath("//android.widget.EditText[@text = \"type message...\"]"));
        Thread.sleep(3000);
        TapMsg.sendKeys("@Muhmmad Hafizh Abdillah");
    }

    @And("User Tap button send <Inbox>")
    public void userTapButtonSendInbox() throws Exception {
        MobileElement TapBtnSend = driver.findElement(By.xpath("//android.widget.Button[@index = 5]"));
        Thread.sleep(3000);
        TapBtnSend.click();
//        driver.navigate().back();
    }

    @Then("User unsuccesfully to mention other user <Inbox>")
    public void userUnsuccesfullyToMentionOtherUserInbox() {
    }

    //PASCA36-Negative
    @And("User Tap message other user <Inbox>")
    public void userTapMessageOtherUserInbox() throws Exception {
        Thread.sleep(3000);
        MobileElement TapMsg = driver.findElementByAccessibilityId("Muhammad Hafizh Abdillah\n" +
                "halo\n" +
                "08:57 PM");
        Thread.sleep(3000);
        TapMsg.click();
        Thread.sleep(3000);
        driver.navigate().back();
//        Thread.sleep(5000);
    }

    @Then("User unsuccesfully delete message other user <inbox>")
    public void userUnsuccesfullyDeleteMessageOtherUserInbox() {
    }
}
