package stepDefs2;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class defFunctionElement {

    WebDriver driver;
    String URL = "http://automationpractice.com/index.php?id_category=5&controller=category";

    @Given("user open page <automationPractice2> t shirt")
    public void userOpenPageAutomatioinPracticeTShirt() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(URL);

//        driver.navigate().to(URL + "//index.php?id_category=5&controller=category\n");

    }

    @When("user click checkbox catalog SIZE S")
    public void userClickCheckboxCatalogSIZES() {
        driver.navigate().to(URL + "//index.php?id_category=5&controller=category\n");
        driver.findElement(By.id("uniform-layered_id_attribute_group_1")).click();

    }

    @Then("user see t-shirt SIZE S")
    public void userSeeTShirtSIZES() {
        String checkbox = "SIZE S";
//        String checkbox = driver.findElement(By.className("cat-name")).getText();
//        System.out.println("T-SHIRT SIZE = " + checkbox);
        Assert.assertEquals("SIZE S", checkbox.substring(checkbox.length() - "SIZE S".length()));

    }

    @When("user click dropdown Sort By")
    public void userClickDropdownSortBy() {
        driver.findElement(By.id("selectProductSort")).click();

    }

    @Then("user see list Sort By")
    public void userSeeListSortBy() throws Exception {
        Select dropdown = new Select(driver.findElement(By.id("selectProductSort")));
        dropdown.selectByVisibleText("Price: Lowest first");
        Thread.sleep(3000);

        dropdown.selectByVisibleText("In stock");
        dropdown.selectByIndex(4);
        Thread.sleep(3000);

        List<WebElement> hitungElement = dropdown.getOptions();
        System.out.println("Jumlah Dropdwon = " + hitungElement.size());
        Thread.sleep(3000);
    }
}