package co.com.choucair.certification.STARSHARP.stepdefinitions;

import co.com.choucair.certification.STARSHARP.questions.Verificacion;
import co.com.choucair.certification.STARSHARP.tasks.*;
import co.com.choucair.certification.STARSHARP.models.ReunionModel;
import cucumber.api.java.Before;
import cucumber.api.java.es.*;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;


public class Mydefinition {
    @Managed
    private WebDriver driver;
    @Before
    public void iniciarEscenario(){
        OnStage.setTheStage(new Cast());
        OnStage.theActorCalled("Felipe").whoCan(BrowseTheWeb.with(driver));
    }

    @Dado("^que estoy en la página de inicio de StarSharp$")
    public void queEstoyEnLaPáginaDeInicioDeStarSharp() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                AbrirPagina.urlStarSharp()
        );
        System.out.println("Paso 1");
    }


    @Cuando("^realizo la autenticación con las credenciales$")
    public void realizoLaAutenticaciónConLasCredenciales(List<ReunionModel> datosReunion) {
        OnStage.theActorInTheSpotlight().attemptsTo(IniciarSesion.credenciales(datosReunion));
        System.out.println("Paso 2");
    }

    

    @Y("^accedo al menú ORGANIZACION-UNIDADES DE NEGOCIO$")
    public void accedoAlMenúORGANIZACIONUNIDADESDENEGOCIO() {
        //OnStage.theActorInTheSpotlight().attemptsTo(IngresarUnidadNegocio.seleccionarmenu());
        System.out.println("Paso 3");
    }

    @Y("^creo una nueva Unidad de Negocio$")
    public void creoUnaNuevaUnidadDeNegocio(List<ReunionModel>datos) {
        //OnStage.theActorInTheSpotlight().attemptsTo(CrearUnidadNegocio.registarnuevaunidad(datos));
        System.out.println("Paso 4");
    }

    @Y("^accedo al menú REUNION>REUNIONES$")
    public void accedoAlMenúREUNIONREUNIONES() {
        //OnStage.theActorInTheSpotlight().attemptsTo(IngresarModuloReunion.seleccionarreunion());
        System.out.println("Paso 5");
    }

    @Y("^programo una nueva reunión seleccionando la Unidad de Negocio recién creada$")
    public void programoUnaNuevaReuniónSeleccionandoLaUnidadDeNegocioReciénCreada() {
        //OnStage.theActorInTheSpotlight().attemptsTo(NuevaReunion.crearnuevareunion());
        System.out.println("Paso 6");
    }

    @Y("^diligencio todos los campos del formulario de la reunión$")
    public void diligencioTodosLosCamposDelFormularioDeLaReunión(List<ReunionModel>datos) {
        //OnStage.theActorInTheSpotlight().attemptsTo(DiligenciarFormularioReunion.registrarreunion(datos));
        System.out.println("Paso 7");
    }

    @Entonces("^verifico que la reunión se haya creado satisfactoriamente$")
    public void verificoQueLaReuniónSeHayaCreadoSatisfactoriamente(List<ReunionModel>datos) {
        //OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Verificacion.verificarreunion(datos)));
        System.out.println("Paso 8");
    }
}
