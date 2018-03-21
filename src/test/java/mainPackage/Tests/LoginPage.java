package mainPackage.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import mainPackage.WebDriverTools;

import java.util.List;

import static org.openqa.selenium.By.cssSelector;

public class LoginPage {
    private final By inputUsername = cssSelector("input[name=username]");  //#ext-element-1569
    private final By inputPassword = cssSelector("input[name=password]");
    @FindBy(css = "#ext-element-1579")
    private List<WebElement> messageError;


    private final WebDriver browser;

    public LoginPage(WebDriver browser) {

        this.browser = browser;
    }

    public void successfulLogin() {

        login(Vars.password);
    }

    public void failureLogin() {
        login("badPassword");
        Assert.assertFalse(messageError.size() != 0);
    }

    private void login(String password) {
        browser.get(Vars.baseURL);

        WebDriverTools.clearAndFill(inputUsername, Vars.username);
        WebDriverTools.clearAndFill(inputPassword, password).submit();
    }

}
