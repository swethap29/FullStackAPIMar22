package chainingConcept;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PatchChangeRequest extends Base {
@Test(dependsOnMethods = "chainingConcept.updateChangeRequest.update_CR")
	public void patch_CR() {
		Response putResponse = RestAssured.given().log().all().contentType(ContentType.JSON).body("{\r\n"
				+ "    \"description\": \"CR updated patch from rest assured\",\r\n"
				+ "    \"short_description\": \"CR from Eclipse\"\r\n"
				+ "}").patch("change_request/"+sys_id);
		
		System.out.println(putResponse.getStatusCode());
	}
}
