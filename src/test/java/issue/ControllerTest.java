package fr.quidquid.houlela;

import fr.quidquid.houlela.services.HealthService;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class ControllerTest {

//    @Test
//    public void ping() {
//        given()
//          .when().get("/ping")
//          .then()
//             .statusCode(200)
//             .body(is("pong"));
//    }
//
//    @Test
//    public void testHelloEndpoint() {
//        given()
//          .when().get("/tests/hello")
//          .then()
//             .statusCode(200)
//             .body(is("Hello"));
//    }

}