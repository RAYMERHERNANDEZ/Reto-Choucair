package co.com.choucair.reto.pruebaraymer.stepdefinitions;

import co.com.choucair.reto.pruebaraymer.tasks.RegisterUserUtest;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RegisterUserStepDefinitions {

    @Managed(driver = "chrome")
    WebDriver driver;

    @Before
    public void setThestage(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("raymer");
    }

    @Given("^user in the home page$")
    public void userInTheHomePage() {
        theActorInTheSpotlight().wasAbleTo(Open.url( "https://www.utest.com/"));
    }

    @When("^he user create an account filling all fields$")
    public void heUserCreateAnAccountFillingAllFields() {
        theActorInTheSpotlight().attemptsTo(RegisterUserUtest.makeinformation());
    }

    @Then("^he user sees its username$")
    public void heUserSeesItsUsername() {
    }
}
