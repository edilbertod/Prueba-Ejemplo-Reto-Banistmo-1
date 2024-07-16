package reto.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import reto.userinterface.InformacionCorporativa;

public class IrSeccionInformacionCorporativa implements Task {
    public static IrSeccionInformacionCorporativa irSeccionInformacionCorporativa(){
        return Tasks.instrumented(IrSeccionInformacionCorporativa.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(InformacionCorporativa.BTN_CORPORATIVA)
        );
    }
}
