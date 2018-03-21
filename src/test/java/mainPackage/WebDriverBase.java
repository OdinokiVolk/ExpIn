package mainPackage;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class WebDriverBase {
    protected static WebDriver browser;

    {
        System.setProperty("webdriver.chrome.driver", "/home/villi/Automation/chromedriver");
    }

    @BeforeTest
    public static void setUp() {
        browser = new ChromeDriver(new ChromeOptions().addArguments("--start-maximized", "--incognito"));
        browser.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);

        mainPackage.WebDriverTools.setDriver(browser);
    }

    @AfterTest
    public static void finish() {
        System.out.println("End");
        browser.close();
    }
}