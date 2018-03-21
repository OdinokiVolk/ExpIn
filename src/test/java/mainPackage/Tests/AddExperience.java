package mainPackage.Tests;


import org.openqa.selenium.WebDriver;
import static org.openqa.selenium.By.cssSelector;


public class AddExperience {


    private final WebDriver browser;

    public AddExperience(WebDriver browser) {

        this.browser = browser;
    }

    void addExp()  {
        browser.findElement(cssSelector("#ext-element-2180")).click();
        browser.findElement(cssSelector("#ext-element-2716")).click();
    }
}
