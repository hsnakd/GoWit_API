package utils;

import io.restassured.response.Response;

public class APIUtils {

    public static boolean isValidResponse(Response response, int expectedStatusCode) {
        return response != null && response.getStatusCode() == expectedStatusCode;
    }
}