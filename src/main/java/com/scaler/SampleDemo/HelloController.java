package com.scaler.SampleDemo;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public ResponseEntity helloWorld(){
        String hello = "Hello World";
        return ResponseEntity.ok(hello);
    }
}