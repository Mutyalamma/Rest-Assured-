package ResponseValidtaion;

	import io.restassured.RestAssured;
	import io.restassured.module.jsv.JsonSchemaValidator;
	import org.testng.annotations.Test;
	import static io.restassured.RestAssured.given;

	public class JsonSchemaValidationTest {
		String id;
	   
		@Test
	    public void validateJsonSchema() {
			
		RestAssured.baseURI  = "https://developer.atlassian.com/cloud/trello/api";

	
            given().contentType("application/json").when()
                .post("1/boards/").then()
                .assertThat().body(JsonSchemaValidator.matchesJsonSchema("C:\\Users\\NAGAR\\Documents\\workspace-spring-tool-suite-4-4.17.1.RELEASE\\Restassured\\target\\class\\PostSchema.json"));
         ;
	    }
	}



