package stepDefs;

import com.aventstack.extentreports.append.JsonDeserializer;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import org.openqa.selenium.json.Json;

import static io.restassured.RestAssured.given;

public class EbebekApi {
    Response response;
    @When("user get a clients information with {string}")
    public void user_get_a_clients_information_with(String apiUrl) {
        response = given().when().get(apiUrl);
        response.prettyPrint();
    }
    @Then("assert that status code is  {string}")
    public void assert_that_status_code_is(String string) {
        Assert.assertEquals(200,response.getStatusCode());
        System.out.println(response.getStatusCode());
    }

}
