package br.scontente.feature.steps_definition;

import io.cucumber.java8.Pt;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class UsersSteps implements Pt {

    private String api_endpoint_users_list;
    private String api_endpoint_user;
    private String bodyRequest;
    private Response response;

    public UsersSteps() {

        Dado("que eu quero o JSON da lista de usuarios", () -> {

            api_endpoint_users_list = "users?page=2";

        });

        Quando("eu pego a Lista de usuarios para a API", () -> {
            response =
                given()
                .when()
                        .get(api_endpoint_users_list)
            ;

        });

        Entao("eu recebo status code {int}", (Integer statusCode) -> {
            response
            .then()
                    .statusCode(statusCode)
            ;
        });

        Dado("que eu quero registrar um novo usuario", () -> {

            bodyRequest = "{   \"name\": \"morpheus\",\"job\": \"leader\"  }";
            api_endpoint_user = "users/";

        });

        Quando("eu envio o usuario para a API", () -> {

            response =
                    given()
                            .body(bodyRequest)
                    .when()
                            .post(api_endpoint_user)
                    ;

        });

        Entao("com o usuario Criado recebo status code {int}", (Integer statusCode) -> {

            response
            .then()
                    .statusCode(statusCode)
            ;

        });

    }
}

