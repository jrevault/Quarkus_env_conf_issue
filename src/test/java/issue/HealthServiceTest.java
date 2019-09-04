package fr.quidquid.houlela;

import fr.quidquid.houlela.services.HealthService;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class HealthServiceTest {

//    @Inject
//    HealthService health_service;
//
//    @Test
//    public void health() {
//        Assertions.assertTrue(health_service.alive());
//    }

}