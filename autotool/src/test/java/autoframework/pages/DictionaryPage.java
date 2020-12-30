package autoframework.pages;

import net.thucydides.core.annotations.DefaultUrl;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import net.serenitybdd.core.pages.WebElementFacade;
import java.util.stream.Collectors;

import net.serenitybdd.core.annotations.findby.FindBy;

import net.thucydides.core.pages.PageObject;

import java.util.List;

import static org.openqa.selenium.By.cssSelector;

//@DefaultUrl("https://en.wikipedia.org/wiki/Main_Page")
public class DictionaryPage extends PageObject {
    public static WebDriver driver;
    private static WebElement element;

    By emailInp = By.name("username");
    By passwordInp = By.name("password");
    By loginBtn = By.className("mdc-button__label");
    By CVDBtn = By.cssSelector("a[href*='contact-requests']");
//    By fgBtn    = By.name("")

    public void gotoUrl(String url) {
        getDriver().get(url);
    }

    public void insertEmail(String email) {
        getDriver().findElement(emailInp).sendKeys(email);
    }

    public void insertPass(String pass) {
        getDriver().findElement(passwordInp).sendKeys(pass);
    }

    public void clickLogin() {
        getDriver().findElement(loginBtn).click();
    }
    public void clickContactReq() {
        getDriver().findElement(CVDBtn).click();
    }

    public String getErrorMessage() {

        return getDriver().findElement(cssSelector("div[class=error-box]")).getText();
    }

    public void txt_successfully() {
        String actualurl="https://mektoube.fr/main/discoveries";
        String expectedurl = getDriver().getCurrentUrl();
        Assert.assertEquals(expectedurl,actualurl);
    }
}


