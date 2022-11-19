package Learn;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class IdScenario {

    static WebDriver driver;
//    WebDriverWait wait =  new WebDriverWait(driver, Duration.ofSeconds(7));

    @BeforeClass
    public static void setUp() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
    }

    @Test
    public void Login() {

        //path
        WebElement email = driver.findElement(By.id("email"));
        WebElement password = driver.findElement(By.id("passwd"));
        WebElement loginButton = driver.findElement(By.id("SubmitLogin"));

        // value username & password
        email.sendKeys("hafizh.abdillah49@gmail.com");
        password.sendKeys("abiol12249");

        // click login
        loginButton.click();

        //validasi / assertion
        WebElement profile = driver.findElement(By.className("account"));
        Assert.assertTrue(profile.isDisplayed());
    }

    /*@AfterClass
    public static void closeBrowse() {
        driver.quit();
    }*/

}
