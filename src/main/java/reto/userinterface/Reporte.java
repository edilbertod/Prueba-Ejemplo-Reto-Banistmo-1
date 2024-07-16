package reto.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Reporte extends PageObject {
    public static final Target BTN_REPORTE = Target.the("Boton para descargar Reporte").located(By.xpath("//a[@href='/wcm/connect/www.grupobancolombia.com15880/44349919-2d9d-4b5a-b153-9740ac95e42b/C%C3%B3digo_de_Buen_Gobierno_-_17_de_marzo_2023_%28cambios+aceptados%29.pdf?MOD=AJPERES&CVID=ov3fJZX']"));
}
