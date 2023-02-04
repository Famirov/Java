package utils;

import static io.restassured.RestAssured.given;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jayway.jsonpath.JsonPath;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import requestBuilder.TokenRequestBuilder;

public class FunctionLibrary extends Base {

	private final String userName = "mealbemp1";
	private final String password = "Test123!";
	
	private final String tokenURL = "http://dev-mb.yoll.io/api/tokenauth/authenticate";

	/**
	 * This method creates request data for Token API request and converts it to String.
	 * @return request data
	 */
	
	public String createTokenRequestData() {
		// Create Token request payload
		TokenRequestBuilder tokenObj = new TokenRequestBuilder();
		tokenObj.setUsernameOrEmailAddress(userName);
		tokenObj.setPassword(password);
		// convert request object to String
		String payload = convertObjectToString(tokenObj);
		// print in console
		System.out.println(payload);
		return payload;

	}

	/**
	 * This method submits POST request
	 * 
	 * @return generate Token
	 */

	public String generateToken() {
		String reqData = createTokenRequestData();
		Response response = given().body(reqData).contentType(ContentType.JSON).when().post(tokenURL);

		return response.prettyPrint();

	}

	/**
	 * This method retrieve token from Token API response
	 * 
	 * @return token
	 */

	public String getToken() {
		String token = JsonPath.read(generateToken(), "$.result.accessToken");
		return token;
	}

	public String convertObjectToString(Object reqObject) {
		String strReqData = null;
		try {
			ObjectMapper objMap = new ObjectMapper();
			strReqData = objMap.writerWithDefaultPrettyPrinter().writeValueAsString(reqObject);
		} catch (JsonProcessingException e) {

			e.printStackTrace();
		}

		return strReqData;
	}
}