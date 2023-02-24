package plataforma.efectigo.tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import plataforma.efectigo.userInterface.loginUserInterface;

public class login implements Task {

    private String usuario;
    private String password;

    public login(String usuario, String password) {
        this.usuario = usuario;
        this.password = password;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                Click.on(loginUserInterface.BOTON_LOGIN),
                Enter.theValue(usuario).into(loginUserInterface.TXT_USERNAME),
                Enter.theValue(password).into(loginUserInterface.TXT_PASSWORD),
                Click.on(loginUserInterface.BOTON_LOGIN_USER)
        );
    }

    public static login onThePage(String usuario, String password) {
        return Instrumented.instanceOf(login.class).withProperties(usuario, password);
    }
}