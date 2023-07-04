package co.com.choucair.certification.STARSHARP.tasks;

import co.com.choucair.certification.STARSHARP.models.ReunionModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static co.com.choucair.certification.STARSHARP.userinterface.PaginaStarSharp.*;

public class IniciarSesion implements Task {
    private List<ReunionModel> datosReunion;

    public IniciarSesion(List<ReunionModel> datosReunion) {
        super();
        this.datosReunion = datosReunion;
    }
    public static IniciarSesion credenciales(List<ReunionModel> datosReunion) {

        return Tasks.instrumented(IniciarSesion.class,datosReunion);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(datosReunion.get(0).getLoginUsuario()).into(TXT_LOGINUSUARIO));
        actor.attemptsTo(Enter.theValue(datosReunion.get(0).getLoginClave()).into(TXT_LOGINCLAVE));
        actor.attemptsTo(Click.on(BTN_INICIARSESION));
    }
}
