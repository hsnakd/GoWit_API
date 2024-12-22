Feature: Petstore API Testing
  As a QA Engineer
  I want to test the Petstore API functionality
  So that I can ensure it meets the requirements

  @CreatePet
  Scenario: Create a new pet
    Given a pet with ID 123 and name "Bulldog"
    When I create the pet
    Then the response status code should be 200
    And the response body should contain the pet with name "Bulldog"

  @GetPet
  Scenario: Get details of the pet
    Given the pet ID 123
    When I fetch the pet details
    Then the response status code should be 200
    And the response body should have name "Bulldog"

  @UpdatePet
  Scenario: Update the pet's name
    Given a pet with ID 123 and new name "GoldenRetriever"
    When I update the pet
    Then the response status code should be 200
    And the response body should have name "GoldenRetriever"

  @DeletePet
  Scenario: Delete the pet
    Given the pet ID 123
    When I delete the pet
    Then the response status code should be 200
    And the pet should no longer exist
