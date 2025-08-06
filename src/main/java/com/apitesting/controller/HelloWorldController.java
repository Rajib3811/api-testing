package com.apitesting.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloWorldController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello World!";
    }

    @GetMapping("/hello-json")
    public HelloResponse helloJson() {
        return new HelloResponse("Hello World!", "Welcome to the API Testing application");
    }

    // Simple response class
    public static class HelloResponse {
        private String message;
        private String description;

        public HelloResponse(String message, String description) {
            this.message = message;
            this.description = description;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    }
}