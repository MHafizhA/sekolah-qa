package stepDefs2;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class defBehaviorInteraction {
    WebDriver driver;
    String URL = "http://automationpractice.com/index.php";


    @Given("user open page home <automatioinPractice>")
    public void userOpenPageHomeAutomatioinPracticeAutomationpractice() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(URL);
    }

    @When("user click button menu t shirt")
    public void userClickButtonMenuTShirt() {
        driver.navigate().to(URL + "//index.php?id_category=5&controller=category\n");
    }

    @And("user click button back")
    public void userClickButtonBack() {
        driver.navigate().back();
    }

    @And("user click button forward")
    public void userClickButtonForward() {
        driver.navigate().forward();
    }

    @And("user click button refresh")
    public void userClickButtonRefresh() {
        driver.navigate().refresh();
    }

//    @Then("Close the page")
//    public void closeThePage() throws Exception {
//        Thread.sleep(3000);
//        driver.close();
//    }
}
