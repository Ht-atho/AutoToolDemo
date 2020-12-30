package autoframework.steps;


import net.thucydides.core.annotations.Steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import autoframework.steps.serenity.EndUserSteps;

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

    @Then("^Show error-box$")
    public void error_box() throws Exception {
        System.out.println("login fail");
        anna.getErrorMessage();
    }
    @Then ("^User login successfully into front site$")
    public void user_login_successfully_into_front_site() throws Exception {
        System.out.println("login successfully");
        anna.login_successfully();

    }
    //test 04 - forgot password button

    @When("^Click forgot password button$")
    public void clivkfgButton(){
        System.out.println("click forgot password button");
        anna.clickfgBtn();
    }
    @Then("^User go to successfully into '(.*)' front site$")
    public void user_go_to_successfully_into_front_site(String actualurl) throws Exception {
        System.out.println("go to forgot password page successfully");
        anna.successfully(actualurl);

    }
}