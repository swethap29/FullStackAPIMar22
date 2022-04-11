package chainingConcept;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

import static org.hamcrest.Matchers.*;

public class createChangeRequest extends Base{
@Test
	public void createChange_Request() {
		
		ValidatableResponse postResponse = RestAssured.given()
				.log()
				.all()
				.contentType(ContentType.JSON).body("{\r\n"
				+ "    \"category\": \"Network\",\r\n"
				+ "    \"short_description\": \"add access rights to user\"\r\n"
				+ "}").post("change_request").then().body(containsString("sys_id"));
	
		//System.out.println(postResponse);
	}
}
