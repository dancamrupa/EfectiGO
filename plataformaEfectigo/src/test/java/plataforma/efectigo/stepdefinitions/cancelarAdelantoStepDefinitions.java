package plataforma.efectigo.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import plataforma.efectigo.tasks.cancelarCredito;

public class cancelarAdelantoStepDefinitions {
    @Before
    public void iniciarEscenario() {
        OnStage.setTheStage(new OnlineCast());
    }

    @When("^el usuario cancela el adelanto solicitado$")
    public void elUsuarioCancelaElAdelantoSolicitado() {
        OnStage.theActorCalled("UserStandar")
                .wasAbleTo(cancelarCredito.inMyAccount()
                );
    }

}
