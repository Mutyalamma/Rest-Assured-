package Boards;

import org.testng.annotations.BeforeClass;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class Reqspecbuilder {
	String id="";
	String uri = "https://api.trello.com/1/boards/"+id;
	
	RequestSpecification requestSpec;
	ResponseSpecification responseSpec;
	@BeforeClass
	public void ReqSpecandResSpec()
	{
		RequestSpecBuilder requestBuilder = new RequestSpecBuilder();
		requestBuilder.setBaseUri(uri);
		requestBuilder.addQueryParam("key", "d2389b3960e148a615bbbcd65c0cc5f1");
		requestBuilder.addQueryParam("token", "ATTA4a326018869c2f7695aa4995349e67f691a2898e7f4173bdf145ba0c9562ec7c6E697594");
		requestBuilder.addHeader("Content-Type","application/json");
		requestBuilder.setContentType("application/json");
		
		requestSpec = requestBuilder.build();
		
		ResponseSpecBuilder responseBuilder = new ResponseSpecBuilder();
		responseBuilder.expectStatusCode(200);
		
		responseSpec = responseBuilder.build();
		
	}

}
