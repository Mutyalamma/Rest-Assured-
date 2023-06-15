package Boards;
import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class createBoard extends Reqspecbuilder{
	
	@Test
	public void creationofBoard()
	{
		Response res = given().queryParam("name", "muthyam").spec(requestSpec).expect().spec(responseSpec).when().post();
		System.out.println(res.asString());
		JsonPath jp=new JsonPath(res.asString());
		id=jp.get("id");
		System.out.println(id);
	}
	
	

}
