package plataforma.efectigo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Scroll;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static plataforma.efectigo.userInterface.solicitarCreditoUserInterface.FOLIO_NUMBER_FRONT;
import static plataforma.efectigo.utils.enums.ActorNotepad.FOLIO;

public class creditApplicationValidation implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        String folioNumber = actor.recall(FOLIO.getKey());

        actor.attemptsTo(
                Scroll.to(FOLIO_NUMBER_FRONT.of(folioNumber))
        );
    }

    public static Performable ofTheUser() {
        return instrumented(creditApplicationValidation.class);
    }
}
