package co.com.choucair.certification.STARSHARP.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.choucair.certification.STARSHARP.userinterface.PaginaStarSharp.*;

public class IngresarUnidadNegocio implements Task {
    public static IngresarUnidadNegocio seleccionarmenu() {
        return Tasks.instrumented(IngresarUnidadNegocio.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BTN_ORGANIZACION));
        actor.attemptsTo(Click.on(BTN_UNIDADDENEGOCIO));
    }
}
