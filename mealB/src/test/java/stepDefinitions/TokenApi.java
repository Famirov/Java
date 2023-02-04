package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import requestBuilder.TokenRequestBuilder;
import requestBuilder.TokenRequestBuilder;
import utils.FunctionLibrary;
import static io.restassured.RestAssured.*;

import org.junit.Assert;

import com.jayway.jsonpath.JsonPath;

import gherkin.ast.Scenario;



public class TokenApi extends FunctionLibrary {
	
	//We have to create a instance so that our local requestData would not complain
	String requestData;
	Response response;
	Scenario scenario;
	
	@Before 
	public void setUp(Scenario scenario) {
		this.scenario= scenario;
	}
	
	@Given("User creates request data with {string} and {string}")
	public void user_creates_request_data_with_and(String username, String password) {
		//Create token request data
		TokenRequestBuilder reqBuilder= new TokenRequestBuilder();
		reqBuilder.setUsernameOrEmailAddress(username);
		reqBuilder.setPassword(password);
		//convert request data object to String
		requestData= convertObjectToString(reqBuilder);
		//write request data to report
		scenario.write(requestData);	   
		// attach request data to report
		scenario.embed(requestData.getBytes(), "application/json");
		
	}

	@Given("User submits request to TOKEN api")
	public void user_submits_request_to_TOKEN_api() {
		response= given()
								.contentType(ContentType.JSON)
								.body(requestData)
							.when()
							.post("http://dev-mb.yoll.io/api/tokenauth/authenticate");
		
		response.prettyPrint();
		// write response data to report
		scenario.write(response.asPrettyString());
		//attach response data to report
		scenario.embed(response.asPrettyString().getBytes(), "application/json");
	   
	}

	@Given("User validates if status code is {int}")
	public void user_validates_if_status_code_is(int expectedStatusCode) {
		
	Assert.assertEquals(expectedStatusCode, response.getStatusCode());
	   scenario.write("Status code: "+ response.getStatusCode());
	}

	@Then("User retrieves access token from response.")
	public void user_retrieves_access_token_from_response() {
	  String token=  JsonPath.read(response.asString(), "$.result.accessToken");
	  Assert.assertNotNull(token);
	  scenario.write(token);
	}
	

}
