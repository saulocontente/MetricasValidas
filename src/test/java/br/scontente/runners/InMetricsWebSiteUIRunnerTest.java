package br.scontente.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import static core.DriverFactory.encerrarDriver;
import static core.DriverFactory.iniciarDriver;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/feature/InMetricsWebSiteFeature.feature",
        glue = "feature.steps_definition",
        plugin = "pretty",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class InMetricsWebSiteUIRunnerTest {

    @BeforeClass
    public static void iniciarSessao() {

        iniciarDriver().manage().window().maximize();

    }

    @AfterClass
    public static void finalizarSessao() {

        encerrarDriver();

    }

}
