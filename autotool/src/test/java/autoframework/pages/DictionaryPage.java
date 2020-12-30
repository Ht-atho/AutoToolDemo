package autoframework.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import net.thucydides.core.pages.PageObject;


import static org.openqa.selenium.By.cssSelector;

//@DefaultUrl("https://en.wikipedia.org/wiki/Main_Page")
public class DictionaryPage extends PageObject {
    public static WebDriver driver;
    private static WebElement element;

    By emailInp = By.name("username");
    By passwordInp = By.name("password");
    By loginBtn = By.className("mdc-button__label");
    By CVDBtn = By.cssSelector("a[href*='contact-requests']");
    By fgBtn    = By.cssSelector("a[href*='forgot-password'");

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

    public String getErrorMessage() {

        return getDriver().findElement(cssSelector("div[class=error-box]")).getText();
    }
    public void clickfgBtn(){
        getDriver().findElement(fgBtn).click();
    }
    public void txt_login_successfully() {
        String actualurl="https://mektoube.fr/main/discoveries";
        String expectedurl = getDriver().getCurrentUrl();
        Assert.assertEquals(expectedurl,actualurl);
    }
// go to Forgot Password page successfully
    public void FgPage(String actualurl) {
//      String actualurl="https://mektoube.fr/forgot-password";
        String expectedurl = getDriver().getCurrentUrl();
        Assert.assertEquals(expectedurl,actualurl);
    }
}


