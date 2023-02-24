package plataforma.efectigo.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import plataforma.efectigo.question.transversal.serviceCancellationMessage;
import plataforma.efectigo.tasks.cancelarCredito;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.core.IsEqual.equalTo;
import static plataforma.efectigo.utils.enums.Messages.REQUEST_CANCELED;

public class cancelarCreditoStepDefinitions {

    @Before
    public void iniciarEscenario() {
        OnStage.setTheStage(new OnlineCast());
    }

    @When("^el usuario cancela el credito solicitado$")
    public void elUsuarioCancelaElCreditoSolicitado() {
        OnStage.theActorCalled("UserStandar")
                .wasAbleTo(cancelarCredito.inMyAccount()
                );
    }

    @Then("^podra ver el mensaje de la solicitud cancelada$")
    public void podraVerElMensajeDeLaSolicitadoCancelada() {
        OnStage.theActorInTheSpotlight()
                .should(
                        seeThat(serviceCancellationMessage.ofUser(), equalTo(REQUEST_CANCELED.getMessage()))
                );
    }
}
