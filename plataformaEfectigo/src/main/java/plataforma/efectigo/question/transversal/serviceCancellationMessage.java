package plataforma.efectigo.question.transversal;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static plataforma.efectigo.userInterface.cancelarCreditoUserInterface.MESSAGE_REQUEST_CANCEL;

public class serviceCancellationMessage implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the(MESSAGE_REQUEST_CANCEL, isPresent()).forNoMoreThan(60).seconds());
        return Text.of(MESSAGE_REQUEST_CANCEL).viewedBy(actor).asString();
    }

    public static serviceCancellationMessage ofUser() {
        return new serviceCancellationMessage();
    }
}
