package ProjectCicleApp.Pages;

import ProjectCicleApp.Config.BaseClass;
import io.appium.java_client.MobileElement;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class InboxCase extends BaseClass {

    @Test
    public void a_OpenInbox() throws Exception {
        Thread.sleep(3000);
        WebElement TapBoardMenu = driver.findElementByAccessibilityId("Menu\n" +
                "Tab 4 of 4");
        TapBoardMenu.click();

        MobileElement TapInbox = driver.findElementByAccessibilityId("Inbox");
        Thread.sleep(3000);
        TapInbox.click();
    }

    @Test
    public void b_NewChat() throws Exception {
        WebElement TapNewChat = driver.findElement(By.xpath("//android.widget.Button[@index = 3]"));
        Thread.sleep(3000);
        TapNewChat.click();

        WebElement TapUser = driver.findElement(By.xpath("(//android.widget.ImageView[@content-desc=\"Muhammad Hafizh Abdillah\"])[2]"));
        Thread.sleep(3000);
        TapUser.click();

        WebElement TapTypeMsg = driver.findElement(By.xpath("//android.widget.EditText[@text = \"type message...\"]"));
        Thread.sleep(3000);
        TapTypeMsg.click();
        Thread.sleep(3000);
        TapTypeMsg.sendKeys("Hallo");

        WebElement TapBtnSend = driver.findElement(By.xpath("//android.widget.Button[@index = 5]"));
        Thread.sleep(3000);
        TapBtnSend.click();
        driver.navigate().back();
    }

    @Test
    public void c_MentionUser() throws Exception {
        WebElement TapTypeMsg = driver.findElement(By.xpath("//android.widget.EditText[@text = \"type message...\"]"));
        Thread.sleep(3000);
        TapTypeMsg.click();

        MobileElement MentionUser2 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[3]"));
        Thread.sleep(3000);
        MentionUser2.click();
        Thread.sleep(10000);

        MobileElement MentionUser3 = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Muhammad Hafizh Abdillah\"]"));
        Thread.sleep(3000);
        MentionUser3.click();

        MobileElement TapBtnSend = driver.findElement(By.xpath("//android.widget.Button[@index = 5]"));
        Thread.sleep(3000);
        TapBtnSend.click();
        driver.navigate().back();
    }

    @Test
    public void d_deleteMsg() throws Exception {
//        WebElement TapNewChat = driver.findElement(By.xpath("//android.widget.Button[@index = 3]"));
//        Thread.sleep(3000);
//        TapNewChat.click();
//
//        WebElement TapUser = driver.findElement(By.xpath("(//android.widget.ImageView[@content-desc=\"Muhammad Hafizh Abdillah\"])[1]"));
//        Thread.sleep(3000);
//        TapUser.click();
        Thread.sleep(3000);
        WebElement TapMsg = driver.findElementByAccessibilityId("Hallo\n" +
                "11:17 PM");
        Thread.sleep(3000);
        TapMsg.click();

        WebElement DeleteMsg = driver.findElementByAccessibilityId("Delete");
        Thread.sleep(3000);
        DeleteMsg.click();

        MobileElement TapBtnOk = driver.findElementByAccessibilityId("Ok");
        Thread.sleep(3000);
        TapBtnOk.click();
//        driver.navigate().back();
    }

    @Test
    public void e_SelectMsg() throws Exception {
        MobileElement TapMsg = driver.findElementByAccessibilityId("Hallo\n" +
                "11:19 PM");
        Thread.sleep(3000);
        TapMsg.click();

        MobileElement TapSelect = driver.findElementByAccessibilityId("Select");
        Thread.sleep(3000);
        TapSelect.click();

        MobileElement TapClose = driver.findElement(By.xpath("//android.widget.Button[@index = 1]"));
        Thread.sleep(3000);
        TapClose.click();
    }

    @Test
    public void f_CantDeleteMsg() throws Exception {
        MobileElement TapMsg = driver.findElementByAccessibilityId("This message was deleted\n" +
                "11:18 PM");
        Thread.sleep(3000);
        TapMsg.click();
        driver.navigate().back();
    }
//
    @Test
    public void g_InMentionUser() throws Exception {
        MobileElement TapMsg = driver.findElement(By.xpath("//android.widget.EditText[@text = \"type message...\"]"));
        Thread.sleep(3000);
        TapMsg.click();

        Thread.sleep(3000);
        TapMsg.sendKeys("@Muhmmad Hafizh Abdillah");

        MobileElement TapBtnSend = driver.findElement(By.xpath("//android.widget.Button[@index = 5]"));
        Thread.sleep(3000);
        TapBtnSend.click();
        driver.navigate().back();
    }

    @Test
    public void h_deleteMsgOtherUser() throws Exception {
        Thread.sleep(3000);
        MobileElement TapMsg = driver.findElementByAccessibilityId("Muhammad Hafizh Abdillah\n" +
                "hallo\n" +
                "11:16 PM");
        Thread.sleep(3000);
        TapMsg.click();
        driver.navigate().back();
        Thread.sleep(5000);
    }

}
