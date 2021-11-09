package se.simonsoft.experiment;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class MockResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/named")
          .then()
             .statusCode(200)
             .body(is("cat - done"));
    }

}