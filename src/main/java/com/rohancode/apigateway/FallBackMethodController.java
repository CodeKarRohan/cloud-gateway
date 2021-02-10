package com.rohancode.apigateway;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {

    @GetMapping("/gymServiceFallback")
    public String gymServiceFallBackMethod(){
        return "Gym service is down!!!. Try again later.";
    }


    @GetMapping("/userServiceFallback")
    public String userServiceFallBackMethod(){
        return "User service is down!!!. Try again later.";
    }
}

