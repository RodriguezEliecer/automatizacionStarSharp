package co.com.choucair.certification.STARSHARP.stepdefinitions;

import co.com.choucair.certification.STARSHARP.questions.Verificacion;
import co.com.choucair.certification.STARSHARP.tasks.*;
import co.com.choucair.certification.STARSHARP.models.ReunionModel;
import cucumber.api.java.Before;
import cucumber.api.java.es.*;
import jxl.common.Logger;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class Mydefinition {
    private static final Logger LOGGER = Logger.getLogger(Mydefinition.class);
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
        LOGGER.info("Prueba2: {}");
    }


    @Cuando("^realizo la autenticación con las credenciales$")
    public void realizoLaAutenticaciónConLasCredenciales(List<ReunionModel> datosReunion) {
        LOGGER.info("Prueba3: {}");
        OnStage.theActorInTheSpotlight().attemptsTo(IniciarSesion.credenciales(datosReunion));
        LOGGER.info("Prueba4: {}");
    }

    

    @Y("^accedo al menú ORGANIZACION-UNIDADES DE NEGOCIO$")
    public void accedoAlMenúORGANIZACIONUNIDADESDENEGOCIO() {
        LOGGER.info("Prueba5: {}");
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarUnidadNegocio.seleccionarmenu());
        LOGGER.info("Prueba6: {}");
    }

    @Y("^creo una nueva Unidad de Negocio$")
    public void creoUnaNuevaUnidadDeNegocio(List<ReunionModel>datos) {
        LOGGER.info("Prueba7: {}");
        OnStage.theActorInTheSpotlight().attemptsTo(CrearUnidadNegocio.registarnuevaunidad(datos));
        LOGGER.info("Prueba8: {}");
    }

    @Y("^accedo al menú REUNION>REUNIONES$")
    public void accedoAlMenúREUNIONREUNIONES() {
        LOGGER.info("Prueba9: {}");
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarModuloReunion.seleccionarreunion());
        LOGGER.info("Prueba10: {}");
    }

    @Y("^programo una nueva reunión seleccionando la Unidad de Negocio recién creada$")
    public void programoUnaNuevaReuniónSeleccionandoLaUnidadDeNegocioReciénCreada() {
        LOGGER.info("Prueba11: {}");
        OnStage.theActorInTheSpotlight().attemptsTo(NuevaReunion.crearnuevareunion());
        LOGGER.info("Prueba12: {}");
    }

    @Y("^diligencio todos los campos del formulario de la reunión$")
    public void diligencioTodosLosCamposDelFormularioDeLaReunión(List<ReunionModel>datos) {
        LOGGER.info("Prueba13: {}");
        OnStage.theActorInTheSpotlight().attemptsTo(DiligenciarFormularioReunion.registrarreunion(datos));
        LOGGER.info("Prueba14: {}");
    }

    @Entonces("^verifico que la reunión se haya creado satisfactoriamente$")
    public void verificoQueLaReuniónSeHayaCreadoSatisfactoriamente(List<ReunionModel>datos) {
        LOGGER.info("Prueba15: {}");
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Verificacion.verificarreunion(datos)));
    }
}
