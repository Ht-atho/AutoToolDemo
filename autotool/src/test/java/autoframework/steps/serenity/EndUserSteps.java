package autoframework.steps.serenity;

import autoframework.pages.DictionaryPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.openqa.selenium.By;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

public class EndUserSteps {

    DictionaryPage dictionaryPage;

    public void gotoUrl(String url) {
        dictionaryPage.gotoUrl(url);
    }

    public void insertEmail(String email) {
        dictionaryPage.insertEmail(email);
    }

    public void insertPass(String pass) {
        dictionaryPage.insertPass(pass);
    }


    public void clickLogin() {
        dictionaryPage.clickLogin();
    }
    public void clickContactReq(){ dictionaryPage.clickContactReq();}

    public String getErrorMessage() {
        return dictionaryPage.getErrorMessage();
    }

    public void successfully() {
         dictionaryPage.txt_successfully();
    }
//    public void contact_req_successfully(){
//        dictionaryPage.contact_req_successfully();
//    }


    ///=======================================================///
//    @Step
//    public void enters(String keyword) {
//        dictionaryPage.enter_keywords(keyword);
//    }
//
//    @Step
//    public void starts_search() {
//        dictionaryPage.lookup_terms();
//    }
//
//    @Step
//    public void should_see_definition(String definition) {
//        assertThat(dictionaryPage.getDefinitions(), hasItem(containsString(definition)));
//    }
//
//    @Step
//    public void is_the_home_page() {
//        dictionaryPage.open();
//    }
//
//    @Step
//    public void looks_for(String term) {
//        enters(term);
//        starts_search();
//    }

}