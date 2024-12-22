package stepDefinitions;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import io.cucumber.java.en.*;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;
import org.testng.Assert;

public class PetstoreStepDefinitions {
    private RequestSpecification request;
    private Response response;

    // Helper method to create pet payload
    private JSONObject createPetPayload(int id, String name, String status) {
        JSONObject payload = new JSONObject();
        payload.put("id", id);
        payload.put("name", name);
        payload.put("status", status);
        return payload;
    }

    @Given("a pet with ID {int} and name {string}")
    public void aPetWithIDAndName(Integer id, String name) {
        JSONObject payload = createPetPayload(id, name, "available");

        request = given()
                .header("Content-Type", "application/json")
                .body(payload.toString());
    }

    @When("I create the pet")
    public void createPet() {
        response = request.when().post("/pet");
    }

    @Then("the response status code should be {int}")
    public void validateStatusCode(int statusCode) {
        response.then().statusCode(statusCode);
    }

    @Then("the response body should contain the pet with name {string}")
    public void theResponseBodyShouldContainThePetWithName(String name) {
        response.then().body("name", equalTo(name));
    }

    @Given("the pet ID {int}")
    public void thePetID(int id) {
        request = given().pathParam("petId", id);
    }

    @When("I fetch the pet details")
    public void fetchPetDetails() {
        response = request.when().get("/pet/{petId}");
    }

    @Then("the response body should have name {string}")
    public void theResponseBodyShouldHaveName(String name) {
        response.then().body("name", equalTo(name));
    }

    @Given("a pet with ID {int} and new name {string}")
    public void aPetWithIDAndNewName(Integer id, String newName) {
        JSONObject payload = createPetPayload(id, newName, "available");

        request = given()
                .header("Content-Type", "application/json")
                .body(payload.toString());
    }

    @When("I update the pet")
    public void updatePet() {
        response = request.when().put("/pet");
    }

    @When("I delete the pet")
    public void deletePet() {
        response = request.when().delete("/pet/{petId}");
    }

    @Then("the pet should no longer exist")
    public void validatePetDoesNotExist() {
        response = given().pathParam("petId", 123)
                .when().get("/pet/{petId}");
        Assert.assertEquals(response.statusCode(), 404, "Pet still exists!");
    }
}
