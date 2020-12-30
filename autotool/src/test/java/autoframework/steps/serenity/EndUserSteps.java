package autoframework.steps.serenity;

import autoframework.pages.DictionaryPage;

public class EndUserSteps {

    DictionaryPage dictionaryPage;

    public void gotoUrl(String url) {
        dictionaryPage.gotoUrl(url);
    }

    //login
    public void insertEmail(String email) {
        dictionaryPage.insertEmail(email);
    }

    public void insertPass(String pass) {
        dictionaryPage.insertPass(pass);
    }

    public void clickLogin() {
        dictionaryPage.clickLogin();
    }
    public void login_successfully(){
        dictionaryPage.txt_login_successfully();
    }
    public String getErrorMessage() {
        return dictionaryPage.getErrorMessage();
    }


    //test04- click forgot password button
    public void clickfgBtn(){ dictionaryPage.clickfgBtn();}
    public void successfully(String actualurl) {
        dictionaryPage.FgPage(actualurl);
    }


}