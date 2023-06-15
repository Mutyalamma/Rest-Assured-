package Boards;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class deleteBoard extends createBoard {
	
	@Test
	
	public void deleteboard()
	{
		Response res = given().queryParam("name", "mutyalamma").spec(requestSpec).expect().spec(responseSpec).when().delete(id);
		System.out.println(res.asString());
		
	}

}
