package co.cicd.app.controller.dto.res;

public class HelloResponse {
    private String message;

    public HelloResponse() {}

    public HelloResponse(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
