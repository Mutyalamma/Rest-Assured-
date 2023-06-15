package Boards;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
public class getaBoard extends createBoard{
	
	@Test
	public void getboard()
	{
		given().spec(requestSpec).expect().spec(responseSpec).when().get(id);
	}

}
