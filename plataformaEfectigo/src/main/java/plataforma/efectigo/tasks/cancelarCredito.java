package plataforma.efectigo.tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static plataforma.efectigo.userInterface.cancelarCreditoUserInterface.*;
import static plataforma.efectigo.userInterface.solicitarCreditoUserInterface.*;
import static plataforma.efectigo.utils.enums.ActorNotepad.FOLIO;

public class cancelarCredito implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        String folioNumber = actor.recall(FOLIO.getKey());
        actor.attemptsTo(

                Scroll.to(FOLIO_NUMBER_FRONT.of(folioNumber)),
                Click.on(REQUEST_CANCEL_BUTTON.of(folioNumber)),
                Click.on(CONFIRMATION_BUTTON_CANCELLATION)
        );
    }

    public static cancelarCredito inMyAccount() {
        return Instrumented.instanceOf(cancelarCredito.class).withProperties();
    }
}
