package co.com.choucair.certification.STARSHARP.questions;

import co.com.choucair.certification.STARSHARP.models.ReunionModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

import static co.com.choucair.certification.STARSHARP.userinterface.PaginaStarSharp.LABEL_REUNIONCREADA;


public class Verificacion implements Question<Boolean> {
    private List<ReunionModel> nombreReunion;
    public Verificacion(List<ReunionModel>nombreReunion){
        this.nombreReunion = nombreReunion;
    }

    public static Verificacion verificarreunion(List<ReunionModel>nombreReunion){
        return new Verificacion(nombreReunion);
    }


    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        result=Text.of(LABEL_REUNIONCREADA).viewedBy(actor).asString().equals(nombreReunion.get(0).getNombreReunion());
        return result;
    }
}
