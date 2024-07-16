package reto.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import reto.userinterface.DocumentosDeInteres;

public class IrSeccionDocumentosDeInteres implements Task {
    public static IrSeccionDocumentosDeInteres irSeccionDocumentosDeInteres(){
        return Tasks.instrumented(IrSeccionDocumentosDeInteres.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(DocumentosDeInteres.BTN_INTERES)
        );
    }
}
