package plataforma.efectigo.question.transversal;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static plataforma.efectigo.userInterface.loginUserInterface.LOGIN_ICON;

public class loginMessage implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the(LOGIN_ICON, isPresent()));
        return Text.of(LOGIN_ICON).viewedBy(actor).asString();
    }

    public static loginMessage ofUserLogin() {
        return new loginMessage();
    }

}
