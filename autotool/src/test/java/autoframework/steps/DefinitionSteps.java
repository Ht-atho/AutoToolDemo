package autoframework.steps;

import cucumber.api.PendingException;
import net.thucydides.core.annotations.Steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import autoframework.steps.serenity.EndUserSteps;
import org.junit.Assert;

import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.assertThat;

public class DefinitionSteps {

    @Steps
    EndUserSteps anna;

    @Given("^Go to '(.*)' url$")
    public void goToUrl(String url) {
        System.out.println("go to the " + url);
        anna.gotoUrl(url);
    }

    @When("^Insert '(.*)' into the Email field$")
    public void insertAIntoTheEmailField(String email) {
        System.out.println("insert the username");
        anna.insertEmail(email);
    }

    @When("^Insert '(.*)' into the Password field$")
    public void insertAIntoThePasswordField(String pass) {
        System.out.println("insert the password");
        anna.insertPass(pass);
    }

    @When("^Click login button$")
    public void clickLoginButton() {
        System.out.println("Click login button");
        anna.clickLogin();
    }
    @When("^Click forgot password button$")
    public void clivkfgButton(){
        System.out.println("click forgot password button");
        anna.clickfgBtn();
    }

//    @Then("^The user will be on the home page '(.*)'$")
////    public void aErrorMessageWillBeDisplay(String url2) {
////        System.out.println("This is the home page");
//////        assertThat(anna.getErrorMessage(),containsString(message));
////        anna.LoginSuccess(url2);
////    }
//    public void goToUrlhome(String url) {
//        System.out.println("go to the " + url);
//        anna.gotoUrl(url);
//    }
    @Then("^User login successfully into '(.*)' front site$")
    public void user_login_successfully_into_front_site(String actualurl) throws Exception {
        System.out.println("login successfully");
        anna.successfully(actualurl);

    }
    @Then("^Show error-box$")
    public void error_box() throws Exception {
        System.out.println("login fail");
        anna.getErrorMessage();
    }
//====================================
//    @Given("^after login,user is on Home Page with '(.email)' and password: '(.pass)'")
//    public void onHome(String email, String pass) {
//        System.out.println("go to the the Mektoube homepage");
//        anna.gotoUrl("https://mektoube.fr/login");
//        System.out.println("insert the username");
//        anna.insertEmail(email);
//        System.out.println("insert the password");
//        anna.insertPass(pass);
//        System.out.println("Click login button");
//        anna.clickLogin();
//        System.out.println("login successfully");
//        anna.successfully();
//    }
//
//    @When("^click Croisez vos destins button$")
//    public void clickContactReq() {
//        System.out.println("Click Contact Request button");
//        anna.clickContactReq();
//    }
//
//    //    @Then("^The user will be on the home page '(.*)'$")
//////    public void aErrorMessageWillBeDisplay(String url2) {
//////        System.out.println("This is the home page");
////////        assertThat(anna.getErrorMessage(),containsString(message));
//////        anna.LoginSuccess(url2);
//////    }
////    public void goToUrlhome(String url) {
////        System.out.println("go to the " + url);
////        anna.gotoUrl(url);
////    }
//    @Then("^User login successfully into the Croisez vos destins page$")
//    public void user_login_successfully_into_the_croisez_vos_destins_page() throws Exception {
//        System.out.println("successfully");
//        anna.contact_req_successfully();
//    }



//    ///=======================================================///
//    @Given("the user is on the google home page")
//    public void givenTheUserIsOnTheGoogleHomePage() {
//        anna.is_the_home_page();
//    }
//
//    @When("the user looks up the definition of the word '(.*)'")
//    public void whenTheUserLooksUpTheDefinitionOf(String word) {
//        anna.looks_for(word);
//    }
//
//    @Then("they should see the definition '(.*)'")
//    public void thenTheyShouldSeeADefinitionContainingTheWords(String definition) {
//        anna.should_see_definition(definition);
//    }
}