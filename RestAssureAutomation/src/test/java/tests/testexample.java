package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class testexample {
    @Test  // ✅ Place it here


	public void test1() {


		Response response = RestAssured.get("https://reqres.in/api/users?page=2");

		System.out.println(response.getTime());

		System.out.println( response.getStatusCode());
		System.out.println(response.getBody().asString());
		System.out.println(response.getStatusLine());
		System.out.println(response.getHeader("content_type"));
		int StatusCode = response.getStatusCode();


        Assert.assertEquals(StatusCode, 201);
}

}