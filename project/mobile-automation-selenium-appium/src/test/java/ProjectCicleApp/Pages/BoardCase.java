package ProjectCicleApp.Pages;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import ProjectCicleApp.Config.BaseClass;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
//import io.appium.java_client.AppiumBy;
//import io.appium.java_client.android.options.UiAutomator2Options;
//import io.appium.java_client.MobileElement;
import io.appium.java_client.MobileElement;
import org.junit.*;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BoardCase extends BaseClass {

    @Test
    public void a_TeamSekolahQA() throws Exception {
        Thread.sleep(3000);
        MobileElement TapSekolaQA = driver.findElementByAccessibilityId("Sekolah QA\n" +
                "Team B");
        TapSekolaQA.click();
    }

    @Test
    public void b_OpenBoardMenu() throws Exception {
        Thread.sleep(3000);
        WebElement TapBoardMenu = driver.findElementByAccessibilityId("Board");
        TapBoardMenu.click();
    }
    @Test
    public void c_AddNewBoardList() throws Exception {
        MobileElement AddNewBoard = driver.findElement(By.xpath("//android.widget.Button[@index = 2]"));
        Thread.sleep(5000);
        AddNewBoard.click();

        MobileElement TypeNameBoard = driver.findElement(By.xpath("//android.widget.EditText[@index = 1]"));
        Thread.sleep(3000);
        TypeNameBoard.click();
        Thread.sleep(3000);
        TypeNameBoard.sendKeys("Test Board 1");

        MobileElement TapBtnSubmit = driver.findElementByAccessibilityId("Submit");
        Thread.sleep(3000);
        TapBtnSubmit.click();

    }

    @Test
    public void d_AddNewCardOnBoard() throws Exception {
        MobileElement AddNewCard = driver.findElementByAccessibilityId("Add new card");
        Thread.sleep(3000);
        AddNewCard.click();

        MobileElement TypeNameBoard = driver.findElement(By.xpath("//android.widget.EditText[@index = 1]"));
        Thread.sleep(3000);
        TypeNameBoard.click();
        Thread.sleep(3000);
        TypeNameBoard.sendKeys("Pertemuan 1");

        MobileElement TapBtnSubmit = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Private Card\"]/android.widget.EditText/android.view.View"));
        Thread.sleep(3000);
        TapBtnSubmit.click();
    }

    @Test
    public void e_EditTitleOnCard() throws Exception {
        MobileElement OpenCard = driver.findElement(By.xpath("//android.widget.Button[@index = 0]"));
        Thread.sleep(3000);
        OpenCard.click();
        Thread.sleep(3000);

        MobileElement EditTitle = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Pertemuan 1\"]/android.view.View[2]/android.view.View/android.view.View/android.view.View[1]"));
        Thread.sleep(3000);
        EditTitle.click();
        Thread.sleep(3000);

        MobileElement TypeEditTitle = driver.findElement(By.xpath("//android.widget.EditText[@index = 0]"));
        TypeEditTitle.click();
        TypeEditTitle.sendKeys("Materi 1");
        Thread.sleep(3000);

        MobileElement TapBtnChecklist = driver.findElement(By.xpath("//android.widget.Button[@index = 1]"));
        Thread.sleep(3000);
        TapBtnChecklist.click();
        Thread.sleep(3000);

    }

    @Test
    public void f_AddNewLabelOnCard() throws Exception {
//        MobileElement OpenCard = driver.findElement(By.xpath("//android.widget.Button[@index = 0]"));
//        Thread.sleep(5000);
//        OpenCard.click();
        Thread.sleep(5000);
        MobileElement AddLabel = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Materi 1\"]/android.view.View[2]/android.view.View/android.view.View/android.view.View[3]"));
        Thread.sleep(3000);
        AddLabel.click();

        MobileElement TypeNameYourLabel = driver.findElement(By.xpath("//android.widget.EditText[@text = \"Name your label...\"]"));
        Thread.sleep(3000);
        TypeNameYourLabel.click();
        Thread.sleep(3000);
        TypeNameYourLabel.sendKeys("pertemuan 1");
        driver.navigate().back();

        MobileElement TapBtnSubmit = driver.findElement(By.xpath("//android.widget.Button[@index = 42]"));
        Thread.sleep(3000);
        TapBtnSubmit.click();

        MobileElement TapToggleLabel = driver.findElementByAccessibilityId("pertemuan 1");
        Thread.sleep(3000);
        TapToggleLabel.click();
    }

    @Test
    public void g_InAddBoardList() throws Exception {
        MobileElement InAddNewBoard = driver.findElement(By.xpath("//android.widget.Button[@index = 2]"));
        Thread.sleep(3000);
        InAddNewBoard.click();

        MobileElement TapBtnSubmit = driver.findElementByAccessibilityId("Submit");
        Thread.sleep(3000);
        TapBtnSubmit.click();
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().back();
    }

    @Test
    public void h_InAddNewCardOnBoard() throws Exception {
        MobileElement InAddNewCard = driver.findElementByAccessibilityId("Add new card");
        Thread.sleep(3000);
        InAddNewCard.click();

        MobileElement TapBtnChecklist = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Private Card\"]/android.widget.EditText/android.view.View"));
        Thread.sleep(3000);
        TapBtnChecklist.click();
    }

    @Test
    public void i_InAddNewCommentOnCard() throws Exception {
        MobileElement OpenCard = driver.findElementByAccessibilityId("pertemuan 1\n" +
                "Materi 1\n" +
                "Show menu");
        Thread.sleep(3000);
        OpenCard.click();
        Thread.sleep(3000);

        MobileElement TapAddNewComment = driver.findElementByAccessibilityId("Add new comment...");
        Thread.sleep(3000);
        TapAddNewComment.click();

        MobileElement TapBtnSubmit = driver.findElementByAccessibilityId("submit");
        Thread.sleep(3000);
        TapBtnSubmit.click();
        driver.navigate().back();
    }

    @Test
    public void j_InAddDescriptionOnCard() throws Exception {
        MobileElement OpenCard = driver.findElementByAccessibilityId("pertemuan 1\n" +
                "Materi 1\n" +
                "Show menu");
        Thread.sleep(3000);
        OpenCard.click();
        Thread.sleep(3000);

        MobileElement TapAddDescription = driver.findElement(By.xpath("//android.view.View[@index = 5]"));
        Thread.sleep(5000);
        TapAddDescription.click();

        MobileElement TapBtnPublish = driver.findElementByAccessibilityId("Publish");
        Thread.sleep(3000);
        TapBtnPublish.click();
    }

    @Test
    public void k_InAddNewLabelOnCard() throws Exception {
//        MobileElement OpenCard = driver.findElementByAccessibilityId("pertemuan 1\n" +
//                "Materi 1\n" +
//                "Show menu");
//        Thread.sleep(3000);
//        OpenCard.click();
//        Thread.sleep(3000);

        MobileElement TapAddLabel = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Materi 1\"]/android.view.View[2]/android.view.View/android.view.View/android.view.View[3]"));
        Thread.sleep(3000);
        TapAddLabel.click();

        MobileElement TapCreateNewLabel = driver.findElementByAccessibilityId("Create new label");
        Thread.sleep(3000);
        TapCreateNewLabel.click();

        MobileElement TapBtnSubmit = driver.findElementByAccessibilityId("submit");
        Thread.sleep(3000);
        TapBtnSubmit.click();
        Thread.sleep(3000);
        driver.navigate().back();
    }
}
