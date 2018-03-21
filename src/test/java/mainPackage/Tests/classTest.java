package mainPackage.Tests;

import mainPackage.WebDriverBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;

import static org.openqa.selenium.By.cssSelector;


public class classTest extends WebDriverBase {


    private LoginPage loginPage;
    private AddExperience addExperience;


    @BeforeClass
    public void initPages() {
        loginPage = PageFactory.initElements(browser, LoginPage.class);
        addExperience = PageFactory.initElements(browser, AddExperience.class);
    }


    @Test(description = "Valid Login")
    public void successfulLogin() {

        loginPage.successfulLogin();
    }

    @Test(description = "Valid Login", dependsOnMethods = {"successfulLogin"})
    public void addExp() {

        addExperience.addExp();
    }


}

