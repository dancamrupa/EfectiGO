package plataforma.efectigo.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import plataforma.efectigo.tasks.creditApplicationValidation;
import plataforma.efectigo.tasks.solicitarAdelanto;

public class solicitudAdelantoStepDefinitions {

    @Before
    public void iniciarEscenario() {
        OnStage.setTheStage(new OnlineCast());
    }
    @When("el usuario selecciona la opcion de solicitar adelanto y selecciona el {string}")
    public void elUsuarioSeleccionaLaOpcionDeSolicitarAdelantoYSeleccionaEl(String monto) {
        OnStage.theActorCalled("UserStandar").wasAbleTo(
                solicitarAdelanto.inMyAccount(monto)
        );
    }
    @Then("^podra ver el numero de folio de la solicitud del adelanto$")
    public void podraVerElNumeroDeFolioDeLaSolicitudDelAdelanto() {
        OnStage.theActorInTheSpotlight().attemptsTo(creditApplicationValidation.ofTheUser());
    }
}
