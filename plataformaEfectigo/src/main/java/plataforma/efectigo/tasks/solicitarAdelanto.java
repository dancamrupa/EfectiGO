package plataforma.efectigo.tasks;

import lombok.SneakyThrows;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;
import static org.openqa.selenium.Keys.ARROW_LEFT;
import static plataforma.efectigo.userInterface.solicitarAdelantoUserInterface.*;
import static plataforma.efectigo.userInterface.solicitarCreditoUserInterface.*;
import static plataforma.efectigo.userInterface.solicitarCreditoUserInterface.CHECK_ACTIVITY_BUTTON;
import static plataforma.efectigo.utils.enums.ActorNotepad.FOLIO;
import static plataforma.efectigo.utils.enums.Messages.SUCCESSFUL_CREDIT_APPLICATION;

public class solicitarAdelanto implements Task {

    private String monto;
    public solicitarAdelanto(String monto) {
        this.monto = monto;
    }
    @SneakyThrows
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(REQUEST_ADVANCE_BUTTON,isPresent()),
                Click.on(REQUEST_ADVANCE_BUTTON)
        );

        Boolean founded = false;

        WebElement aux;
        String label_monto;
        WebElement sliderButtonAmount = getDriver().findElement(By.xpath(BUTTON_ADVANCE_SLIDER.getCssOrXPathSelector()));
        WaitUntil.the(ADVANCE_AMOUNT_LABEL, isPresent());

        while (!founded) {

            aux = getDriver().findElement(By.xpath(ADVANCE_AMOUNT_LABEL.getCssOrXPathSelector()));
            label_monto = aux.getText().replace("$", "").replace(",", "");


            if (!label_monto.equals(String.valueOf(monto).replace(".0", ""))) {
                try {
                    sliderButtonAmount.sendKeys(ARROW_LEFT);
                    Thread.sleep(200);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }

            } else {
                founded = true;
            }
        }

        actor.attemptsTo(

                Click.on(REQUEST_BUTTON_AMOUNT),
                Ensure.that(SUCCESSFUL_MESSAGE).text().isEqualTo(SUCCESSFUL_CREDIT_APPLICATION.getMessage())
        );

        actor.remember(FOLIO.getKey(), FOLIO_NUMBER.resolveFor(actor).getText());

        actor.attemptsTo(
                Click.on(CHECK_ACTIVITY_BUTTON)
        );

    }
    public static solicitarAdelanto inMyAccount(String monto) {
        return Instrumented.instanceOf(solicitarAdelanto.class).withProperties(monto);
    }
}