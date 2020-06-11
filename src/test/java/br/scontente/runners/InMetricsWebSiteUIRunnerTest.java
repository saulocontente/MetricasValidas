package br.scontente.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import static br.scontente.core.DriverFactory.*;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/br/scontente/feature/InMetricsWebSiteFeature.feature",
        glue = "br.scontente.feature.steps_definition",
        plugin = {"pretty","html:target/report-html-UI"},
        snippets = SnippetType.CAMELCASE
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
