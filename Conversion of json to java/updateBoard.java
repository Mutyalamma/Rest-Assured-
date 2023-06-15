package Boards;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class updateBoard extends createBoard{
	
	@Test
	public void updateboard()
	{
		Response res = given().queryParam("name", "mutyalamma").spec(requestSpec).expect().spec(responseSpec).when().put(id);
		System.out.println(res.asString());
		
	}

}
