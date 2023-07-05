package co.com.choucair.certification.STARSHARP.tasks;

import co.com.choucair.certification.STARSHARP.models.ReunionModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static co.com.choucair.certification.STARSHARP.userinterface.PaginaStarSharp.*;

public class CrearUnidadNegocio implements Task {

    private List<ReunionModel> datos;
    public CrearUnidadNegocio(List<ReunionModel> datos){
        this.datos = datos;
    }
    public static CrearUnidadNegocio registarnuevaunidad(List<ReunionModel> datos) {
        return Tasks.instrumented(CrearUnidadNegocio.class,datos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BTN_NUEVAUNIDADNEGOCIO));
        actor.attemptsTo(Enter.theValue(datos.get(0).getUnidadReunion()).into(TXT_NUEVAUNIDANEGOCIO));
        actor.attemptsTo(Click.on(BTN_UNIDADPARIENTE));
        actor.attemptsTo(Enter.theValue(datos.get(0).getUnidadReunion()).into(TXT_UNIDADPARIENTE));
        actor.attemptsTo(Click.on(SELECT_UNIDADPARIENTE));
        actor.attemptsTo(Click.on(BTN_GUARDARUNIDAD));
    }
}
