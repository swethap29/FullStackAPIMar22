package chainingConcept;

import org.testng.annotations.BeforeMethod;

import io.restassured.RestAssured;

public class Base {

	public static String sys_id;
	
	@BeforeMethod
	public void base() {
	RestAssured.baseURI= "https://dev70954.service-now.com/api/now/table/";
	
	RestAssured.authentication=RestAssured.basic("admin", "mo5sSSBv7bTG");
	}
	
}
