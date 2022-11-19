package ProjectCicleApp.StepsDefinition;

import io.appium.java_client.AppiumDriver;
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

public class StepsGroupChat {

    static AppiumDriver<MobileElement> driver;

    static DesiredCapabilities capabilities;

    @Given("User open staging-cicle on mobile <Group Chat>")
    public void userOpenStagingCicleOnMobile1() throws Exception {
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

    @When("User Tap on Sekolah QA in Team menu <Group Chat>")
    public void userTapOnSekolahQAInTeamMenu() throws Exception {
        Thread.sleep(3000);
        MobileElement TapSekolaQA = driver.findElementByAccessibilityId("Sekolah QA\n" +
                "Team B");
        TapSekolaQA.click();
    }

    //PASCA21-Positive
    @And("User Tap on Group Chat menu")
    public void userTapOnGroupChatMenu() throws Exception {
        Thread.sleep(3000);
        MobileElement TapBlastMenu = driver.findElementByAccessibilityId("Group Chat");
        TapBlastMenu.click();
    }

    @Then("User can see inside Group Chat menu")
    public void userCanSeeInsideGroupChatMenu() throws Exception {
        Thread.sleep(3000);
        Assert.assertTrue(driver.findElementByAccessibilityId("Group Chat").isDisplayed());
    }

    //PASCA22-Positive

    @And("User Tap on type message")
    public void userTapOnTypeMessage() throws Exception {
        MobileElement AddNewMessage = driver.findElement(By.xpath("//android.widget.EditText[@text = \"type message...\"]"));
        Thread.sleep(3000);
        AddNewMessage.click();
    }

    @And("User type Hallo")
    public void userTypeHallo() throws Exception {
        MobileElement TypeMsg = driver.findElement(By.xpath("//android.widget.EditText[@text = \"type message...\"]"));
        Thread.sleep(3000);
        TypeMsg.sendKeys("Hallo");
    }

    @And("User Tap on button send")
    public void userTapOnButtonSend() throws Exception {
        MobileElement TapBtnSend = driver.findElement(By.xpath("//android.widget.Button[@index = 6]"));
        Thread.sleep(3000);
        TapBtnSend.click();
    }

    @Then("user succesfully send message")
    public void userSuccesfullySendMessage() {
    }

    //PASCA23-Positive

    @And("User Tap on type message <Group Chat>")
    public void userTapOnTypeMessageGC() throws Exception {
        MobileElement MentionUser = driver.findElement(By.xpath("//android.widget.EditText[@text = \"type message...\"]"));
        Thread.sleep(3000);
        MentionUser.click();
    }

    @And("User Tap on icon mention <Group Chat>")
    public void userTapOnIconMentionGC() throws Exception {
        MobileElement MentionUser2 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[4]"));
        Thread.sleep(5000);
        MentionUser2.click();
    }

    @And("User Tap on user Hafizh Abdillah")
    public void userTapOnUserHafizhAbdillah() throws Exception {
        MobileElement MentionUser3 = driver.findElementByAccessibilityId("Hafizh Abdillah");
        Thread.sleep(3000);
        MentionUser3.click();
    }

    @Then("User succesfully mention other user")
    public void userSuccesfullyMentionOtherUser() {
    }

    //PASCA24-Positive
    @And("User Tap on sent message")
    public void userTapOnSentMessage() throws Exception {
        MobileElement TapMsg = driver.findElementByAccessibilityId("05:00 PM");
        Thread.sleep(3000);
        TapMsg.click();
    }

    @And("User Tap on Delete")
    public void userTapOnDelete() throws Exception {
        MobileElement DeleteMsg = driver.findElementByAccessibilityId("Delete");
        Thread.sleep(3000);
        DeleteMsg.click();
    }

    @And("user Tap on Ok")
    public void userTapOnOk() throws Exception {
        MobileElement TapBtnOk = driver.findElementByAccessibilityId("Ok");
        Thread.sleep(3000);
        TapBtnOk.click();
    }

    @Then("User succesfully delete sent message")
    public void userSuccesfullyDeleteSentMessage() throws Exception {
        Thread.sleep(3000);
        Assert.assertTrue(driver.findElementByAccessibilityId("This message was deleted\n" +
                "05:00 PM").isDisplayed());
    }

    //PASCA25-Positive
    @And("User Tap on DropDown Group Chat")
    public void userTapOnDropDownGroupChat() throws Exception {
        MobileElement TapDropDown = driver.findElementByAccessibilityId("Group Chat");
        Thread.sleep(3000);
        TapDropDown.click();
    }

    @And("User Tap on Blast")
    public void userTapOnBlast() throws Exception {
        MobileElement TapBlast = driver.findElementByAccessibilityId("Blast");
        Thread.sleep(3000);
        TapBlast.click();
    }

    @Then("User succesfully change or move to Blast")
    public void userSuccesfullyChangeOrMoveToBlast() throws Exception {
        Thread.sleep(3000);
        Assert.assertTrue(driver.findElementByAccessibilityId("Blast").isDisplayed());
    }

    @And("user Tap on sent message that already deleted")
    public void userTapOnSentMessageThatAlreadyDeleted() throws Exception {
        MobileElement TapMsg = driver.findElementByAccessibilityId("This message was deleted\n" +
                "05:00 PM");
        Thread.sleep(3000);
        TapMsg.click();
        Thread.sleep(3000);
        driver.navigate().back();
    }

    @Then("User unsuccesfully delete message that already deleted")
    public void userUnsuccesfullyDeleteMessageThatAlreadyDeleted() throws Exception {
        Thread.sleep(3000);
        Assert.assertTrue(driver.findElementByAccessibilityId("This message was deleted\n" +
                "05:00 PM").isDisplayed());
    }

    //PASCA34-Negative
    @And("User Tap on textboxt")
    public void userTapOnTextboxt() throws Exception {
        MobileElement AddNewMessage = driver.findElement(By.xpath("//android.widget.EditText[@text = \"type message...\"]"));
        Thread.sleep(3000);
        AddNewMessage.click();
    }

    @And("User Type @Hafizh Abdillah")
    public void userTypeHafizhAbdillah() throws Exception {
        MobileElement AddNewMessage = driver.findElement(By.xpath("//android.widget.EditText[@text = \"type message...\"]"));
        Thread.sleep(3000);
        AddNewMessage.sendKeys("@Hafizh Abdillah");
    }

    @And("User Tap button send")
    public void userTapButtonSend() {
    }

    @Then("User unsuccesfully to mention other user")
    public void userUnsuccesfullyToMentionOtherUser() throws Exception {
        MobileElement TapBtnSend = driver.findElement(By.xpath("//android.widget.Button[@index = 6]"));
        Thread.sleep(3000);
        TapBtnSend.click();
    }

    //PASCA35-Negative
    @And("User Tap message other user")
    public void userTapMessageOtherUser() throws Exception {
        MobileElement TapMsg = driver.findElementByAccessibilityId("Hafizh Abdillah\n" +
                "halo\n" +
                "05:43 PM");
        Thread.sleep(3000);
        TapMsg.click();
        Thread.sleep(3000);
        driver.navigate().back();
    }

    @Then("User unsuccesfully delete message other user")
    public void userUnsuccesfullyDeleteMessageOtherUser() {
    }
}
