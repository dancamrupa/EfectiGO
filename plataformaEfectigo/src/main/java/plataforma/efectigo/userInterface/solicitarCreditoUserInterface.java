package plataforma.efectigo.userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class solicitarCreditoUserInterface {

    public static final Target REQUEST_CREDIT_BUTTON = Target.the("request credit button")
            .locatedBy("(//button[@class='MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButtonBase-root  css-foq3i5'])[1]");
    public static final Target REQUEST_BUTTON = Target.the("request button")
            .locatedBy("//button[@class='MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-fullWidth MuiButtonBase-root  css-1nxm28y']");
    public static final Target LABEL_AMOUNT = Target.the("label amount")
            .locatedBy("(//h5[@class='MuiTypography-root MuiTypography-h5 css-12qvcho'])[1]");
    public static final Target BUTTON_SLIDER1_FROM = Target.the("button slider1 from")
            .locatedBy("(//span/input)[1]");
    public static final Target BUTTON_SLIDER2_FROM = Target.the("slider button")
            .locatedBy("(//span/input)[2]");
    public static final Target BUTTON_SLIDER2_TO = Target.the("slider button")
            .locatedBy("(//span[@data-index='{0}'])[2]");
    public static final Target CHECK_ACTIVITY_BUTTON = Target.the("check activity button")
            .locatedBy("//button[@class='MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButtonBase-root  css-1a1uhsh']");
    public static final Target SUCCESSFUL_MESSAGE = Target.the("succesful message")
            .locatedBy("//h3[@class='MuiTypography-root MuiTypography-h3 css-1m3vqzw']");
    public static final Target FOLIO_NUMBER = Target.the("folio number")
            .locatedBy("//h6[@class='MuiTypography-root MuiTypography-h6 css-gmglu4']");
    public static final Target FOLIO_NUMBER_FRONT = Target.the("credit request message")
            .locatedBy("//h6[contains(text()[2], '{0}')]");

}
