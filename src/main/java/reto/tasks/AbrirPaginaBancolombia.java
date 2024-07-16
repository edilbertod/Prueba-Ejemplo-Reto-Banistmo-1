package reto.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import reto.userinterface.UrlBancolombia;

public class AbrirPaginaBancolombia implements Task {
    private UrlBancolombia urlBancolombia;
    public static AbrirPaginaBancolombia urlBancolombia(){
        return Tasks.instrumented(AbrirPaginaBancolombia.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn(urlBancolombia)
        );
    }
}
