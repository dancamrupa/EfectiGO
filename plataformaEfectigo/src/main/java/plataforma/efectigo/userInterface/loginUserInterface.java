package plataforma.efectigo.userInterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.qa.efectigo.com/")
public class loginUserInterface extends PageObject {

    public static final Target BOTON_LOGIN = Target.the("Ya soy un usuario")
            .locatedBy("//button[@class='MuiButton-root MuiButton-outlined MuiButton-outlinedPrimary MuiButton-sizeMedium MuiButton-outlinedSizeMedium MuiButtonBase-root css-1vrw4nl']");
    public static final Target TXT_USERNAME =
            Target.the("email o nombre de usuario").located(By.id(":r6:"));
    public static final Target TXT_PASSWORD =
            Target.the("password").located(By.id(":r7:"));
    public static final Target BOTON_LOGIN_USER = Target.the("password")
            .locatedBy("//button[@class='MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-fullWidth MuiButtonBase-root  css-6k7p4s']");
    public static final Target LOGIN_ICON = Target.the("login icon")
            .locatedBy("//button[@class='MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-disableElevation MuiButtonBase-root css-16nhtjm']");

}