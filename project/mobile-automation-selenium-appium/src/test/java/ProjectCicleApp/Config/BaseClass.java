package ProjectCicleApp.Config;
import io.appium.java_client.Setting;
import org.junit.*;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.MobileElement;
import io.appium.java_client.AppiumDriver;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BaseClass {
    public static AppiumDriver<MobileElement> driver;

    public static DesiredCapabilities capabilities;


    @BeforeClass
    public static void setUp() {
        try {
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

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }



    }

    @AfterClass
    public static void tearDown() throws Exception {
        Thread.sleep(3000);
        driver.quit();
    }
}
