package co.cicd.app.controller;

import co.cicd.app.controller.dto.res.HelloResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api")
@RestController
public class HelloWorld {

    @GetMapping("/hello")
    public ResponseEntity<HelloResponse> hello() {
        HelloResponse res = new HelloResponse("Hello World -2");
        return ResponseEntity.ok(res);
    }

}
