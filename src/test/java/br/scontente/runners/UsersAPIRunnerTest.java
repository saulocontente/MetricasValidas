package br.scontente.runners;

import core.Constants;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.restassured.builder.RequestSpecBuilder;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.requestSpecification;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/feature/UsersFeature.feature",
        glue = "feature.steps_definition",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        plugin = "pretty"
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
