package reto.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InformacionCorporativa extends PageObject {
    public static final Target BTN_CORPORATIVA = Target.the("Boton Informacion Corporativa").located(By.xpath("//a[@Class='items-level-two' and contains(text(),'Información Corporativa')]"));

}
