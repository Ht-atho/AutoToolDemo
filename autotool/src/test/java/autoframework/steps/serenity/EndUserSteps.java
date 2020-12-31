package autoframework.steps.serenity;

import autoframework.pages.DictionaryPage;

public class EndUserSteps {

    DictionaryPage dictionaryPage;

    public void gotoUrl(String url) {
        dictionaryPage.gotoUrl(url);
    }

    //login
    public void insertEmail(String email) throws InterruptedException {
        dictionaryPage.insertEmail(email);
    }

    public void insertPass(String pass) {
        dictionaryPage.insertPass(pass);
    }

    public void clickLogin() {
        dictionaryPage.clickLogin();
    }

    public String getErrorMessage() {
        return dictionaryPage.getErrorMessage();
    }


    //test04- click forgot password button
    public void clickfgBtn(){ dictionaryPage.clickfgBtn();}
    public void successfully(String expectrul) {
        dictionaryPage.FgPage(expectrul);
    }


    public void login_successfully(String expecturl) throws InterruptedException {
        dictionaryPage.loginSuccess(expecturl);
    }
}