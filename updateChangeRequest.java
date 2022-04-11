package chainingConcept;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class updateChangeRequest extends Base{
	@Test(dependsOnMethods = "chainingConcept.createChangeRequest.createChange_Request" )
	public void update_CR() {
		Response putResponse = RestAssured.given().log().all().contentType(ContentType.JSON).body("{\r\n"
				+ "    \"description\": \"CR updated put from rest assured\",\r\n"
				+ "    \"short_description\": \"CR from Eclipse\"\r\n"
				+ "}").put("change_request/"+sys_id);
		
		System.out.println(putResponse);
	}
	
}
