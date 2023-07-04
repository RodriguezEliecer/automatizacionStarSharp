package co.com.choucair.certification.STARSHARP.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.choucair.certification.STARSHARP.userinterface.PaginaStarSharp.*;

public class IngresarModuloReunion implements Task {
    public static IngresarModuloReunion seleccionarreunion() {
        return Tasks.instrumented(IngresarModuloReunion.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BTN_MENUREUNION));
        actor.attemptsTo(Click.on(BTN_SUBMENUREUNION));
    }
}
