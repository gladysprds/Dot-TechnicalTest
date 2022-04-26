package starter.pages;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class LoginPage extends PageObject {

    private By iconAccount(){
        return By.className("icon-user");
    }

    private By loginText(){
        return By.xpath("//*[@id=\"customer_login\"]/div[1]/div/h3");
    }

    private By usernameField(){
        return By.id("username");
    }

    private By passwordField(){
        return By.id("password");
    }

    private By buttonLogin(){
        return By.name("login");
    }

    private By errorMessage(){
        return By.className("message-container container alert-color medium-text-center");
    }


    @Step
    public void openUrl(){
        openUrl("https://www.psegameshop.com/");
    }

    @Step
    public boolean validateAccountIsApp(){

       return $(iconAccount()).isDisplayed();
    }

    @Step
    public void clickIconAccount(){
        $(iconAccount()).click();
    }

    @Step
    public boolean validateLoginFormIsApp(){
       return $(loginText()).isDisplayed();
    }

    @Step
    public void inputUsername(String username){
        $(usernameField()).type(username);
    }

    @Step
    public void inputPassword(String password){
        $(passwordField()).type(password);
    }

    @Step
    public void clickLoginButton(){
        $(buttonLogin()).click();
    }

    @Step
    public void errorMessageAlert(String alert){
        if(alert=="Username is required"){
                $(errorMessage()).isDisplayed();
        }
        else if(alert=="The password field is empty."){
                $(errorMessage()).isDisplayed();
        }
        else if(alert=="The password you entered for the email address dummyforta2022@gmail.com is incorrect. Lost your password?"){
            $(errorMessage()).isDisplayed();
        }
        else if(alert=="Unknown email address. Check again or try your username."){
            $(errorMessage()).isDisplayed();
        }
    }


}
