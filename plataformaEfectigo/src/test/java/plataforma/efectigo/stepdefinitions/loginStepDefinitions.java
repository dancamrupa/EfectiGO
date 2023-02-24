package plataforma.efectigo.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import plataforma.efectigo.question.transversal.loginMessage;
import plataforma.efectigo.tasks.login;
import plataforma.efectigo.tasks.openPlatform;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class loginStepDefinitions {

    @Before
    public void iniciarEscenario() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^el usuario quiere ingresar a la plataforma de gestion efectigo$")
    public void elUsuarioQuiereIngresarALaPlataformaDeGestionEfectigo() {
        OnStage.theActorCalled("UserStandar").wasAbleTo(
                openPlatform.thePage()
        );
    }

    @When("el usuario ingresa el {string} y {string} en la plataforma de gestion efectigo")
    public void elUsuarioIngresaElyEnLaPlataformaDeGestionEfectigo(String usuario, String password) {
        OnStage.theActorCalled("UserStandar").attemptsTo(
                login.onThePage(usuario, password)
        );
    }

    @Then("^podra ingresar a la plataforma de gestion Efectigo$")
    public void podraIngresarALaPlataformaYDeGestionEfectigo() {
        theActorInTheSpotlight()
                .should(
                        seeThat(loginMessage.ofUserLogin())
                );
    }

}