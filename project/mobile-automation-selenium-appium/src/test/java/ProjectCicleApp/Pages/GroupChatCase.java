package ProjectCicleApp.Pages;

import ProjectCicleApp.Config.BaseClass;
import io.appium.java_client.MobileElement;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class GroupChatCase extends BaseClass {

    @Test
    public void a_TeamSekolahQA() throws Exception {
        Thread.sleep(3000);
        MobileElement TapSekolaQA = driver.findElementByAccessibilityId("Sekolah QA\n" +
                "Team B");
        TapSekolaQA.click();
    }

    @Test
    public void b_OpenGroupChatMenu() throws Exception {
        Thread.sleep(3000);
        MobileElement TapBlastMenu = driver.findElementByAccessibilityId("Group Chat");
        TapBlastMenu.click();
    }

    @Test
    public void c_AddNewMessageGC() throws Exception {
        MobileElement AddNewMessage = driver.findElement(By.xpath("//android.widget.EditText[@text = \"type message...\"]"));
        Thread.sleep(3000);
        AddNewMessage.click();

        Thread.sleep(3000);
        AddNewMessage.sendKeys("Hallo");

        MobileElement TapBtnSend = driver.findElement(By.xpath("//android.widget.Button[@index = 6]"));
        Thread.sleep(3000);
        TapBtnSend.click();
    }

//    @Test
//    public void d_MentionUser() throws Exception {
//        MobileElement MentionUser = driver.findElement(By.xpath("//android.widget.EditText[@text = \"type message...\"]"));
//        Thread.sleep(3000);
//        MentionUser.click();
//
//        MobileElement TapIconMT = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[3]"));
//        Thread.sleep(3000);
//        TapIconMT.click();
//
//        Thread.sleep(5000);
//        MobileElement TapUser = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Muhammad Hafizh Abdillah\"]"));
//        Thread.sleep(3000);
//        TapUser.click();
//
//        MobileElement TapBtnSend = driver.findElement(By.xpath("//android.widget.Button[@index = 5]"));
//        Thread.sleep(3000);
//        TapBtnSend.click();
//    }
//
//    @Test
//    public void e_DeleteSentMessage() throws Exception {
//
//        //need recent message to automanted
//        MobileElement TapMsg = driver.findElementByAccessibilityId("04:33 PM");
//        Thread.sleep(3000);
//        TapMsg.click();
//
//        MobileElement DeleteMsg = driver.findElementByAccessibilityId("Delete");
//        Thread.sleep(3000);
//        DeleteMsg.click();
//
//        MobileElement TapBtnOk = driver.findElementByAccessibilityId("Ok");
//        Thread.sleep(3000);
//        TapBtnOk.click();
//    }
//
//    @Test
//    public void f_ChangeMenu() throws Exception {
//        MobileElement TapDropDown = driver.findElementByAccessibilityId("Group Chat");
//        Thread.sleep(3000);
//        TapDropDown.click();
//
//        MobileElement TapBlast = driver.findElementByAccessibilityId("Blast");
//        Thread.sleep(3000);
//        TapBlast.click();
//    }
//
//    @Test
//    public void g_CantDeleteMsg() throws Exception {
//        MobileElement TapMsg = driver.findElementByAccessibilityId("04:33 PM");
//        Thread.sleep(3000);
//        TapMsg.click();
//        driver.navigate().back();
//    }
//
//    @Test
//    public void h_InMentionUser() throws Exception {
//        MobileElement AddNewMessage = driver.findElement(By.xpath("//android.widget.EditText[@text = \"type message...\"]"));
//        Thread.sleep(3000);
//        AddNewMessage.click();
//
//        Thread.sleep(3000);
//        AddNewMessage.sendKeys("@Hafizh Abdillah");
//
//        MobileElement TapBtnSend = driver.findElement(By.xpath("//android.widget.Button[@index = 6]"));
//        Thread.sleep(3000);
//        TapBtnSend.click();
//    }
//    @Test
//    public void i_CantDeleteMsgOtherUser() throws Exception {
//        MobileElement TapMsg = driver.findElementByAccessibilityId("Hafizh Abdillah\n" +
//                "halo\n" +
//                "05:43 PM");
//        Thread.sleep(3000);
//        TapMsg.click();
//        driver.navigate().back();
//    }

}
