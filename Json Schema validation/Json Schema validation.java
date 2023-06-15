package ResponseValidtaion;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.module.jsv.JsonSchemaValidator;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class reqres {
	
	@Test
	public void getusers() throws FileNotFoundException
	{
		 RestAssured.baseURI  = "https://reqres.in/api";
		 FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//target//class//getschema.json");
		 given().get("users?page=2").then().assertThat()
		 .body(JsonSchemaValidator.matchesJsonSchema(fis));
	}
	

}

