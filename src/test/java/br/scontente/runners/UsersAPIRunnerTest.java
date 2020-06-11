package br.scontente.runners;

import br.scontente.core.Constants;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import io.restassured.builder.RequestSpecBuilder;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.requestSpecification;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/br/scontente/feature/UsersFeature.feature",
        glue = "br.scontente.feature.steps_definition",
        snippets = SnippetType.CAMELCASE,
        plugin = {"pretty","html:target/report-html-API"}
)
public class UsersAPIRunnerTest implements Constants {

    @BeforeClass
    public static void setupSpecifications() {

        baseURI = API_BASE_URL;

        RequestSpecBuilder requestBuilder = new RequestSpecBuilder();
        requestBuilder.setContentType(API_CONTENT_TYPE);
        requestSpecification = requestBuilder.build();

    }
}
