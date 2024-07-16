package reto.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import reto.interactions.CambiarVentana;
import reto.userinterface.Reporte;

public class SeleccionarReporte implements Task {
    public static SeleccionarReporte seleccionarReporte(){
        return Tasks.instrumented(SeleccionarReporte.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(Reporte.BTN_REPORTE),
                CambiarVentana.ventana()
        );
    }
}
