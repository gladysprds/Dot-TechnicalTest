package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import net.thucydides.core.annotations.Steps;

import starter.pages.HomePage;
import starter.pages.LoginPage;


public class LoginStepDefinitions {

    @Steps
    LoginPage loginPage;


    @Steps
    HomePage homePage;

    @Given("i am on login page")
    public void iAmOnLoginPage() {
        loginPage.openUrl();
        loginPage.validateAccountIsApp();
        loginPage.clickIconAccount();
        loginPage.validateLoginFormIsApp();
    }

    @When("i input {string} username")
    public void iInputUsername(String username) {
        loginPage.inputUsername(username);
    }

    @And("i input {string} password")
    public void iInputPassword(String password) {
        loginPage.inputPassword(password);
    }


    @And("click login button")
    public void clickLoginButton() {
        loginPage.clickLoginButton();

    }

    @Then("i get the {string}")
    public void iGetThe(String result) {
        if(result.equals("home page")){
            homePage.scrollToTextHomePage();
            homePage.textHomeIsApp();
        } else {
            loginPage.validateLoginFormIsApp();
            loginPage.errorMessageAlert(result);
        }
    }



   // @When("i input valid username")
  //  public void iInputValidUsername() {

  //  }

    //@And("I input valid password")
    //public void iInputValidPassword() {
       // loginPage.inputPassword("realgladz1511");

  //  }



  //  @Then("I am at homepage")
    // public void iAmAtHomepage() {
      //  homePage.scrollToTextHomePage();
      //  homePage.textHomeIsApp();

  //  }




}
