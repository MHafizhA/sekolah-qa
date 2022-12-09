package com.hafizh.base;

import com.hafizh.utils.TestUtils;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseSetup {
    public static WebDriver driver;
    public static Properties properties;

    public BaseSetup() {
        try {
            // code logic here
            properties = new Properties();
            FileInputStream inputStream = new FileInputStream("src/main/java/com/hafizh/config/config.properties");
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//    @BeforeClass
    public static void initialization() {
        ChromeOptions chrome_options = new ChromeOptions();
//        chrome_options.addArguments("start-maximized");
        chrome_options.addArguments("--no-sandbox");
        chrome_options.addArguments("--disable-dev-shm-usage");
        chrome_options.addArguments("--disable-extensions");
        chrome_options.addArguments("--disable-popup-blocking");
        chrome_options.addArguments("--profile-directory=Default");
        chrome_options.addArguments("--ignore-certificate-errors");
        chrome_options.addArguments("--disable-plugins-discovery");
        chrome_options.addArguments("user_agent=DN");
        chrome_options.addArguments("user-data-dir=C:/Users/AL - HAFIZH/AppData/Local/Google/Chrome/User Data/");
        chrome_options.addArguments("--profile-directory=default");
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver(chrome_options);
//        driver.manage().window().maximize();

        driver.get(properties.getProperty("url"));
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(TestUtils.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(TestUtils.IMPLICIT_WAIT, TimeUnit.SECONDS);

    }
}
