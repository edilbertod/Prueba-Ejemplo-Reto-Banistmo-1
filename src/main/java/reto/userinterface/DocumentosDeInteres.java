package reto.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DocumentosDeInteres extends PageObject {
    public static final Target BTN_INTERES = Target.the("Boton Documentos de Interes").located(By.xpath("(//a[@href='/corporativo/gobierno-corporativo/documentos-de-interes' and contains(text(),'Documentos de Interés')])[1]"));

}
