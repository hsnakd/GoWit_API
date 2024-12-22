# Petstore API Testing Project

This project is a Cucumber-based test automation framework designed for testing the Petstore API endpoints. The framework uses RestAssured for API interaction and TestNG for test execution.

## Project Structure

```
src
├── main
│   └── java
│
├── test
    ├── java
    │   ├── features
    │   │   └── PetstoreAPI.feature
    │   ├── hooks
    │   │   └── Hooks.java
    │   ├── stepDefinitions
    │   │   └── PetstoreStepDefinitions.java
    │   └── runner
    │       └── TestRunner.java
```

### Key Components

1. **`features/PetstoreAPI.feature`**
    - Contains Gherkin scenarios for testing various Petstore API functionalities.

2. **`hooks/Hooks.java`**
    - Includes setup logic for the test environment, such as setting the base URI for RestAssured.

3. **`stepDefinitions/PetstoreStepDefinitions.java`**
    - Implements the step definitions for the scenarios defined in the feature file.

4. **`runner/TestRunner.java`**
    - Configures and executes the tests using Cucumber and TestNG.

## Prerequisites

1. **Java Development Kit (JDK)**
    - Ensure JDK 8 or higher is installed.

2. **Maven**
    - Build and dependency management tool.

3. **IDE**
    - Use an IDE like IntelliJ IDEA or Eclipse.

## Setup Instructions

1. Clone the repository:
   ```
   git clone <repository-url>
   ```

2. Navigate to the project directory:
   ```
   cd petstore-api-testing
   ```

3. Add dependencies to `pom.xml`:
   ```xml
   <dependencies>
       <!-- Cucumber -->
       <dependency>
           <groupId>io.cucumber</groupId>
           <artifactId>cucumber-java</artifactId>
           <version>7.14.0</version>
       </dependency>
       <dependency>
           <groupId>io.cucumber</groupId>
           <artifactId>cucumber-testng</artifactId>
           <version>7.14.0</version>
       </dependency>

       <!-- TestNG -->
       <dependency>
           <groupId>org.testng</groupId>
           <artifactId>testng</artifactId>
           <version>7.8.0</version>
           <scope>test</scope>
       </dependency>

       <!-- RestAssured -->
       <dependency>
           <groupId>io.rest-assured</groupId>
           <artifactId>rest-assured</artifactId>
           <version>5.3.0</version>
       </dependency>

       <!-- JSON -->
       <dependency>
           <groupId>org.json</groupId>
           <artifactId>json</artifactId>
           <version>20230227</version>
       </dependency>
   </dependencies>
   ```

4. Build the project:
   ```
   mvn clean install
   ```

## Running the Tests

1. Execute tests using the `TestRunner` file:
   ```
   mvn test
   ```

2. Alternatively, run the `TestRunner` directly from your IDE.

## Reports

- After executing the tests, a detailed HTML report will be generated at:
  ```
  target/cucumber-reports.html
  ```

## Scenarios Covered

### Create a Pet
- Add a new pet to the store.
- Validate the response status code and pet details.

### Get Pet Details
- Retrieve details of a pet by ID.
- Validate the response status code and pet details.

### Update a Pet
- Update the name of an existing pet.
- Validate the response status code and updated details.

### Delete a Pet
- Delete a pet by ID.
- Verify the pet no longer exists.

## Technologies Used

- **Java**: Programming language.
- **Cucumber**: BDD framework for writing Gherkin scenarios.
- **RestAssured**: For API testing.
- **TestNG**: Test execution framework.
- **Maven**: Build and dependency management.

## Contributing

1. Fork the repository.
2. Create a feature branch:
   ```
   git checkout -b feature-branch
   ```
3. Commit your changes:
   ```
   git commit -m "Add feature"
   ```
4. Push to the branch:
   ```
   git push origin feature-branch
   ```
5. Open a pull request.

## License

This project is licensed under the MIT License. See the `LICENSE` file for details.

