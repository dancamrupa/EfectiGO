package plataforma.efectigo.userInterface;

import net.serenitybdd.screenplay.targets.Target;
public class solicitarAdelantoUserInterface {
    public static final Target REQUEST_ADVANCE_BUTTON = Target.the("request advance button")
            .locatedBy("(//button[@class='MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButtonBase-root  css-foq3i5'])[2]");
    public static final Target BUTTON_ADVANCE_SLIDER = Target.the("button advance slider")
            .locatedBy("(//span/input)");
    public static final Target ADVANCE_AMOUNT_LABEL = Target.the("label amount")
            .locatedBy("//h5[@class='MuiTypography-root MuiTypography-h5 css-12qvcho']");
    public static final Target REQUEST_BUTTON_AMOUNT = Target.the("request button")
            .locatedBy("//button[@class='MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-fullWidth MuiButtonBase-root  css-kf0jor']");

}
