package co.com.choucair.certification.STARSHARP.runners;

import cucumber.api.SnippetType;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.thucydides.core.util.SystemEnvironmentVariables;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/nuevareunionstarsharp.feature",
        tags = "@CasoNuevaReunion",
        glue = "co.com.choucair.certification.STARSHARP.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)
public class RunnerTags {
    @Before
    public void test() {
        String webdriverDriver = SystemEnvironmentVariables.createEnvironmentVariables().getProperty("webdriver.driver");
        if (webdriverDriver != null) {
            switch (webdriverDriver) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    break;
                case "ie":
                case "iexplorer":
                    WebDriverManager.iedriver().setup();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    break;
                default:
                    System.out.println("Unsupported webdriver.driver property: " + webdriverDriver);
                    break;
            }
        } else {
            WebDriverManager.chromedriver().setup(); // Configura ChromeDriver por defecto si no se especifica webdriver.driver
        }
    }

    @Test
    public void testRunner() {
        JUnitCore.runClasses(RunnerTags.class);
    }

}