package restassured;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class TC1 {
	
	@Test
	public String getweatherdetails()
	{
		//Specify base URI
		RestAssured.baseURI="http://restapi.demoqa.com/utilities/weather/city";
		//Request object
		RequestSpecification httprequest=RestAssured.given();
		
		//Response Object
		Response response=httprequest.request(Method.GET,"Hubli");
		//Print response in console window
		String responseBody=response.getBody().asString();
		System.out.println("Response Body is:"+responseBody);
		
		//status code validation
		int statusCode= response.getStatusCode();
		System.out.println("Status Code is: " +statusCode);
		Assert.assertEquals (statusCode,200);
		
		//status line verification
		String statusLine=response.getStatusLine();
		System.out.println(statusLine);
		Assert.assertEquals(statusLine,"HTTP/1.1 200 OK");
		
		return responseBody;
		
	
		
		
	}

}
