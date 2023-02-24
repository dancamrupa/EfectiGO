package plataforma.efectigo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import plataforma.efectigo.userInterface.loginUserInterface;

public class openPlatform implements Task {
    private loginUserInterface loginPage;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(loginPage));
    }
    public static openPlatform thePage(){
        return Tasks.instrumented(openPlatform.class);
    }
}
