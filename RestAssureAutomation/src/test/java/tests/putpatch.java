package tests;

import static io.restassured.RestAssured.*;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class putpatch {

//@Test
	
//	public void get() {
		
		//baseURI="https://reqres.in/api";
		//given().get("/users?page=2").then().statusCode(200).
		//body("data[4].first_name",equalTo("George")).
		//body("data.first_name",hasItems("George","Rachel"));
	//}
	
	@Test
	
	public void testput() {
		
		
		
		JSONObject request = new JSONObject();
		
		request.put("name","Raghav");
		request.put("job","Teacher");
		System.out.println(request.toJSONString());
		
		
		baseURI="https://reqres.in/api";
		
		given().
		    header("Content-Type","application/json").
		    contentType(ContentType.JSON).
		    accept(ContentType.JSON).
	        body(request.toJSONString()).
		when().
		    put("/users/2").
		then().
		    statusCode(401)
		    .log().all();
		

	
	}
@Test
	
	public void testpatch() {
		
		
		
		JSONObject request = new JSONObject();
		
		request.put("name","Raghav");
		request.put("job","Teacher");
		System.out.println(request.toJSONString());
		
		
		baseURI="https://reqres.in";
		
		given().
		    header("Content-Type","application/json").
		    contentType(ContentType.JSON).
		    accept(ContentType.JSON).
	        body(request.toJSONString()).
		when().
		    patch("/api/users/2").
		then().
		    statusCode(401)
		    .log().all();
		

	
	}
@Test

public void testDelete() {
	
	

	
	
	baseURI="https://reqres.in";
	
	
	when().
	    patch("/api/users/2").
	then().
	    statusCode(401)
	    .log().all();
	


}


}




