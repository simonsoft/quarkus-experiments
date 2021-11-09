package se.simonsoft.experiment;

import io.quarkus.test.junit.QuarkusTest;
import io.quarkus.test.junit.mockito.InjectMock;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

import javax.inject.Named;


@QuarkusTest
public class MockResourceTest {

	
	@InjectMock(convertScopes=true)
	@Named("cat")
	ServiceAnimal service;
	
	
	@BeforeEach
    public void setup() {
		Mockito.when(service.getName()).thenReturn("unicorn");
		Mockito.when(service.doSomething()).thenReturn("done");
	}
	
	
    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/named")
          .then()
             .statusCode(200)
             .body(is("unicorn - done"));
    }

}