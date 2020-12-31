package autoframework.pages;

import org.apache.tools.ant.taskdefs.Sleep;
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
    By loginBtn = By.cssSelector("button[type='submit']");
    By CVDBtn = By.cssSelector("a[href*='contact-requests']");
    By fgBtn    = By.cssSelector("a[href*='forgot-password'");

    public void gotoUrl(String url) {
        getDriver().get(url);
    }

    public void insertEmail(String email) throws InterruptedException {
        Thread.sleep(10000);
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

// go to Forgot Password page successfully
    public void clickfgBtn(){
    getDriver().findElement(fgBtn).click();
}
    public void FgPage(String expectedurl ) {
//      String actualurl="https://mektoube.fr/forgot-password";
        String actualurl = getDriver().getCurrentUrl();
        Assert.assertEquals(expectedurl,actualurl);
    }

    public void loginSuccess(String expecturl) throws InterruptedException {
//        try {
//            wait(10000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        Thread.sleep(5000);
        Assert.assertEquals(expecturl, getDriver().getCurrentUrl());
    }
}


