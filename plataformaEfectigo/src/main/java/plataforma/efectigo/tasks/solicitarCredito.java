package plataforma.efectigo.tasks;

import lombok.SneakyThrows;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;
import static org.openqa.selenium.Keys.ARROW_LEFT;
import static plataforma.efectigo.userInterface.solicitarCreditoUserInterface.*;
import static plataforma.efectigo.utils.enums.ActorNotepad.FOLIO;
import static plataforma.efectigo.utils.enums.Messages.SUCCESSFUL_CREDIT_APPLICATION;
import static plataforma.efectigo.utils.transversal.Utilities.getIndex;

public class solicitarCredito implements Task {

    private String cantidad;
    private String plazo;

    public solicitarCredito(String cantidad, String plazo) {
        this.cantidad = cantidad;
        this.plazo = plazo;
    }

    @SneakyThrows
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                WaitUntil.the(REQUEST_CREDIT_BUTTON,isPresent()),
                Click.on(REQUEST_CREDIT_BUTTON)
        );


        Boolean founded = false;

        WebElement aux;
        String label_monto;
        WebElement sliderButtonAmount = getDriver().findElement(By.xpath(BUTTON_SLIDER1_FROM.getCssOrXPathSelector()));
        WaitUntil.the(LABEL_AMOUNT, isPresent());

        while (!founded) {
            aux = getDriver().findElement(By.xpath(LABEL_AMOUNT.getCssOrXPathSelector()));
            label_monto = aux.getText().replace("$", "").replace(",", "");

            if (!label_monto.equals(String.valueOf(cantidad).replace(".0", ""))) {
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

        WebElement sliderButtonDeadlines = getDriver().findElement(By.xpath(BUTTON_SLIDER2_FROM.getCssOrXPathSelector()));
        WebElement sliderButtonDeadlinesTo = getDriver().findElement(By.xpath(BUTTON_SLIDER2_TO.of(String.valueOf(getIndex(Integer.parseInt(cantidad),plazo)).replace(".0", "")).getCssOrXPathSelector()));

        BrowseTheWeb.as(actor).withAction()
                .clickAndHold(sliderButtonDeadlines).dragAndDrop(sliderButtonDeadlines, sliderButtonDeadlinesTo).build().perform();

        actor.attemptsTo(

                Click.on(REQUEST_BUTTON),
                Ensure.that(SUCCESSFUL_MESSAGE).text().isEqualTo(SUCCESSFUL_CREDIT_APPLICATION.getMessage())
        );

        actor.remember(FOLIO.getKey(), FOLIO_NUMBER.resolveFor(actor).getText());

        actor.attemptsTo(
                Click.on(CHECK_ACTIVITY_BUTTON)
        );

    }

    public static solicitarCredito inMyAccount(String cantidad, String plazo) {
        return Instrumented.instanceOf(solicitarCredito.class).withProperties(cantidad, plazo);
    }
}