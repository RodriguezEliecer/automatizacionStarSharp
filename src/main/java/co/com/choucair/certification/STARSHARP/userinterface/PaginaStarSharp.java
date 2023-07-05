package co.com.choucair.certification.STARSHARP.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

import java.util.Random;

@DefaultUrl("https://serenity.is/demo/")
public class PaginaStarSharp extends PageObject {
    Random rand = new Random();
    public static final Target TXT_LOGINUSUARIO = Target.the("TXTLOGINUSUARIO").located(By.id("LoginPanel0_Username"));
    public static final Target TXT_LOGINCLAVE = Target.the("TXTLOGINCLAVE").located(By.id("LoginPanel0_Password"));
    public static final Target BTN_INICIARSESION = Target.the("BTNINICIARSESION").located(By.id("LoginPanel0_LoginButton"));
    public static final Target BTN_ORGANIZACION = Target.the("BTN_ORGANIZACION").located(By.xpath("//ul[@id='nav_menu1_3']//a[@href='#nav_menu1_3_1']"));
    public static final Target BTN_UNIDADDENEGOCIO = Target.the("BTN_UNIDADDENEGOCIO").located(By.xpath("//ul[@id='nav_menu1_3_1']/li/a[@href='/Organization/BusinessUnit']"));//ejemplo
    public static final Target BTN_NUEVAUNIDADNEGOCIO = Target.the("BTN_NUEVAUNIDADNEGOCIO").located(By.xpath("//div[@class='buttons-inner']//div[@data-action='add']"));
    public static final Target TXT_NUEVAUNIDANEGOCIO = Target.the("TXT_NUEVAUNIDADNEGOCIO").located(By.name("Name"));
    public static final Target BTN_UNIDAD = Target.the("BTN_UNIDAD").located((By.id("s2id_Serenity_Pro_Organization_BusinessUnitDialog3_ParentUnitId")));
    public static final Target SELECT_UNIDADPARIENTE = Target.the("SELECT_UNIDADPARIENTE").located(By.xpath(String.format("//div[@role='option' and text()='%s']", "Technology » Design")));
    public static final Target BTN_GUARDARUNIDAD = Target.the("BTN_GUARDARUNIDAD").located(By.xpath("//div[@class='buttons-inner']//div[@data-action='save-and-close']"));
    public static final Target BTN_MENUREUNION = Target.the("BTN_MENUREUNION").located(By.xpath("//ul[@id='nav_menu1_3']//a[@href='#nav_menu1_3_2']"));
    public static final Target BTN_SUBMENUREUNION = Target.the("BTN_SUBMENUREUNION").located(By.xpath("//ul[@id='nav_menu1_3_2']//a[@href='/Meeting/Meeting']"));
    public static final Target BTN_NUEVAREUNION = Target.the("BTN_NUEVAREUNION").located(By.xpath("//div[@class='buttons-inner']//div[@data-action='add']"));
    public static final Target TXT_NOMBREREUNION = Target.the("TXT_NOMBREREUNION").located(By.id("Serenity_Pro_Meeting_MeetingDialog10_MeetingName"));
    public static final Target TXT_NUMEROREUNION = Target.the("TXT_NUMEROREUNION").located(By.id("Serenity_Pro_Meeting_MeetingDialog10_MeetingNumber"));
    public static final Target BTN_TIPOREUNION = Target.the("TXT_NUMEROREUNION").located(By.xpath("//div[@id='s2id_Serenity_Pro_Meeting_MeetingDialog10_MeetingTypeId']"));
    public static final Target TXT_BUSCARTIPOREUNION = Target.the("TXT_NUMEROREUNION").located(By.id("s2id_autogen6_search"));
    public static final Target SELECT_TIPOREUNION = Target.the("TXT_NUMEROREUNION").located(By.xpath("//div[@id='select2-drop']//ul[@id='select2-results-6']/child::li[1]"));
    public static final Target TXT_FECHAINICIOREUNION = Target.the("TXT_FECHAINICIOREUNION").located(By.id("Serenity_Pro_Meeting_MeetingDialog10_StartDate"));
    public static final Target SELECT_HORAINICIOREUNION = Target.the("SELECT_HORAINICIOREUNION").located(By.xpath("//div[@class='field StartDate col-sm-6']//option[@value='03:35'][1]"));
    public static final Target TXT_FECHAFINREUNION = Target.the("TXT_FECHAFINREUNION").located(By.id("Serenity_Pro_Meeting_MeetingDialog10_EndDate"));
    public static final Target SELECT_HORAFINREUNION = Target.the("SELECT_HORAFINREUNION").located(By.xpath("//div[@class='field EndDate col-sm-6']//option[@value='05:25'][1]"));
    public static final Target BTN_LOCALIZACION = Target.the("BTN_LOCALIZACION").located(By.id("s2id_Serenity_Pro_Meeting_MeetingDialog10_LocationId"));
    public static final Target TXT_LOCALIZACION = Target.the("TXT_LOCALIZACION").located(By.id("s2id_autogen7_search"));
    public static final Target SELECT_LOCALIZACION = Target.the("SELECT_LOCALIZACION").located(By.xpath("//ul[@id='select2-results-7']/child::li[1]"));
    public static final Target BTN_UNIDADREUNION = Target.the("BTN_UNIDADREUNION").located(By.id("s2id_Serenity_Pro_Meeting_MeetingDialog10_UnitId"));
    public static final Target TXT_UNIDADREUNION = Target.the("TXT_UNIDADREUNION").located(By.id("s2id_autogen8_search"));
    public static final Target SELECT_UNIDADREUNION = Target.the("SELECT_UNIDADREUNION").located(By.xpath("//ul[@id='select2-results-8']/child::li[1]"));
    public static final Target BTN_ORGANIZADOR = Target.the("BTN_ORGANIZADOR ").located(By.id("s2id_Serenity_Pro_Meeting_MeetingDialog10_OrganizerContactId"));
    public static final Target TXT_ORGANIZADOR  = Target.the("TXT_ORGANIZADOR ").located(By.id("s2id_autogen9_search"));
    public static final Target SELECT_ORGANIZADOR = Target.the("SELECT_ORGANIZADOR ").located(By.xpath("//ul[@id='select2-results-9']/child::li[1]"));
    public static final Target BTN_REPORTERO = Target.the("BTN_REPORTERO ").located(By.id("s2id_Serenity_Pro_Meeting_MeetingDialog10_ReporterContactId"));
    public static final Target TXT_REPORTERO  = Target.the("TXT_REPORTERO ").located(By.id("s2id_autogen10_search"));
    public static final Target SELECT_REPORTERO = Target.the("SELECT_REPORTERO ").located(By.xpath("//ul[@id='select2-results-10']/child::li[1]"));
    public static final Target BTN_ASISTENTES = Target.the("BTN_ASISTENTES ").located(By.id("select2-chosen-12"));
    public static final Target SELECT_ASISTENTES = Target.the("BTN_ASISTENTES ").located(By.xpath("//div[@id='select2-drop']//ul[@id='select2-results-12']/child::li[40]"));
    public static final Target BTN_GUARDARREUNION  = Target.the("BTH_GUARDARREUNION ").located(By.xpath("//div[@data-action='save-and-close']"));
    public static final Target LABEL_REUNIONCREADA  = Target.the("LABEL_REUNIONCREADA ").located(By.xpath("//div[@class='slick-viewport']/div[@class='grid-canvas']/child::div[1]/div[@class='slick-cell l1 r1']"));
}
