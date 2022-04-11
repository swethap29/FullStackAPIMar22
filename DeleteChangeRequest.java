package chainingConcept;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DeleteChangeRequest extends Base {
@Test(dependsOnMethods = "chainingConcept.PatchChangeRequest.patch_CR")
	public void delete_CR() {
		Response delete = RestAssured.given().delete("change_request/"+sys_id);
		
		delete.prettyPrint();
		System.out.println(delete.getStatusCode());
		//System.out.println(delete);
		
	}
}
