package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.SerenityActions;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.actions.Scroll.to;

public class HomePage extends PageObject {

    private By textInHomepage(){
        return By.className("text");
    }

    @Step
    public void scrollToTextHomePage(){
        SerenityActions actions = new SerenityActions(getDriver());
        actions.moveToElement($(textInHomepage())).perform();
    }

    @Step
    public boolean textHomeIsApp(){
      return $(textInHomepage()).getText().equals("Spesial di PSe Gameshop Hari ini");
    }



}
