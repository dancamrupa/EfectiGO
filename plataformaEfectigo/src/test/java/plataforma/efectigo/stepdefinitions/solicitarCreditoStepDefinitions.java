package plataforma.efectigo.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import plataforma.efectigo.tasks.creditApplicationValidation;
import plataforma.efectigo.tasks.solicitarCredito;

public class solicitarCreditoStepDefinitions {

    @Before
    public void iniciarEscenario() {
        OnStage.setTheStage(new OnlineCast());
    }
    @When("el usuario selecciona la opcion de solicitar credito y selecciona la {string} y el {string}")
    public void elUsuarioSeleccionaLaOpcionDeSolicitarCreditoYSeleccionaLaYEl(String cantidad, String plazo) {
        OnStage.theActorCalled("UserStandar").wasAbleTo(
                solicitarCredito.inMyAccount(cantidad, plazo)
        );
    }
    @Then("^podra ver el numero de folio de la solicitud del credito$")
    public void podraVerElNumeroDeFolioDeLaSolicitudDelCredito() {
        OnStage.theActorInTheSpotlight().attemptsTo(creditApplicationValidation.ofTheUser());
    }
}
