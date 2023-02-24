package plataforma.efectigo.userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class cancelarCreditoUserInterface {

    public static final Target REQUEST_CANCEL_BUTTON = Target.the("request cancel button")
            .locatedBy("//h6[contains(text()[2], '{0}')]//following::button[contains(text(), 'Cancelar solicitud')]");

    public static final Target CONFIRMATION_BUTTON_CANCELLATION = Target.the("confirmation button cancela")
            .locatedBy("//button[@class='MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButtonBase-root css-1sefaev']");

    public static final Target MESSAGE_REQUEST_CANCEL = Target.the("cancel request")
            .locatedBy("//h5[contains(text(),'Solicitud cancelada')]");

}
