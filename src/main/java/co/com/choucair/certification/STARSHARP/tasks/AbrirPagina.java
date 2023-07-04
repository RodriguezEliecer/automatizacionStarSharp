package co.com.choucair.certification.STARSHARP.tasks;

import co.com.choucair.certification.STARSHARP.userinterface.PaginaStarSharp;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirPagina implements Task {
    private PaginaStarSharp paginaStarSharp;
    public static AbrirPagina urlStarSharp() {
        return Tasks.instrumented(AbrirPagina.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(paginaStarSharp));
    }
}
