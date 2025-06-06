package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

@Test
public class test1 {
	public void test2() {


		Response response =get("https://reqres.in/api/users?page=2");

		System.out.println(response.getTime());

		System.out.println( response.getStatusCode());
		System.out.println(response.getBody().asString());
		System.out.println(response.getStatusLine());
		System.out.println(response.getHeader("content_type"));
		int StatusCode = response.getStatusCode();


        Assert.assertEquals(StatusCode, 201);
}


@Test
public void test3(){
	
	 baseURI = "https://reqres.in/api";
	
	given().
	     get("users?page=2").
	then().
	      statusCode(200).
	      body("data.id[1]",equalTo(12))
	      .log().all();
	      
	
     
	
	
	
}
}

