package co.com.choucair.certification.STARSHARP.tasks;

import co.com.choucair.certification.STARSHARP.models.ReunionModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static co.com.choucair.certification.STARSHARP.userinterface.PaginaStarSharp.*;

public class DiligenciarFormularioReunion implements Task {
    private List<ReunionModel> datosReunion;

    public DiligenciarFormularioReunion(List<ReunionModel> datosReunion) {
        super();
        this.datosReunion = datosReunion;
    }
    public static DiligenciarFormularioReunion registrarreunion(List<ReunionModel>datos) {
        return Tasks.instrumented(DiligenciarFormularioReunion.class,datos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(datosReunion.get(0).getNombreReunion()).into(TXT_NOMBREREUNION));
        actor.attemptsTo(Enter.theValue(datosReunion.get(0).getNumeroReunion()).into(TXT_NUMEROREUNION));
        actor.attemptsTo(
                Click.on(BTN_TIPOREUNION),
                Enter.theValue(datosReunion.get(0).getTipoReunion()).into(TXT_BUSCARTIPOREUNION),
                Click.on(SELECT_TIPOREUNION)
        );
        actor.attemptsTo(Enter.theValue(datosReunion.get(0).getFechaInicio()).into(TXT_FECHAINICIOREUNION));
        actor.attemptsTo(Click.on(SELECT_HORAINICIOREUNION));
        actor.attemptsTo(Enter.theValue(datosReunion.get(0).getFechaFinalizacion()).into(TXT_FECHAFINREUNION));
        actor.attemptsTo(Click.on(SELECT_HORAFINREUNION));
        actor.attemptsTo(
                Click.on(BTN_LOCALIZACION),
                Enter.theValue(datosReunion.get(0).getUbicacionReunion()).into(TXT_LOCALIZACION),
                Click.on(SELECT_LOCALIZACION)
        );
        actor.attemptsTo(
                Click.on(BTN_UNIDADREUNION),
                Enter.theValue(datosReunion.get(0).getUnidadReunion()).into(TXT_UNIDADREUNION),
                Click.on(SELECT_UNIDADREUNION)
        );
        actor.attemptsTo(
                Click.on(BTN_ORGANIZADOR),
                Enter.theValue(datosReunion.get(0).getOrganizadorReunion()).into(TXT_ORGANIZADOR),
                Click.on(SELECT_ORGANIZADOR)
        );
        actor.attemptsTo(
                Click.on(BTN_REPORTERO),
                Enter.theValue(datosReunion.get(0).getReporteroReunion()).into(TXT_REPORTERO),
                Click.on(SELECT_REPORTERO)
        );
        actor.attemptsTo(
                Click.on(BTN_ASISTENTES),
                Click.on(SELECT_ASISTENTES),
                Click.on(BTN_GUARDARREUNION)
        );
    }
}

