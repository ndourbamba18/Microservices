package com.ndourcodeur.apigatewayservice;

import org.springframework.web.bind.annotation.*;

@RestController
public class FallBackMethodController {

    // User Service
    @GetMapping("/userServiceFallBack")
    public String getUserServiceFallBackMethod() {
        return "User Service is taking longer than Expected." +
                " Please try again later";
    }

    @PostMapping(path = "/userServiceFallBack")
    public String postUserServiceFallBackMethod() {
        return "User Service is taking longer than Expected." +
                " Please try again later";
    }

    @PutMapping(path = "/userServiceFallBack")
    public String editUserServiceFallBackMethod() {
        return "User Service is taking longer than Expected." +
                " Please try again later";
    }

    @DeleteMapping(path = "/userServiceFallBack")
    public String deleteUserServiceFallBackMethod() {
        return "User Service is taking longer than Expected." +
                " Please try again later";
    }

    // Car Service
    @GetMapping("/carServiceFallBack")
    public String getCarServiceFallBackMethod() {
        return "Car Service is taking longer than Expected." +
                " Please try again later";
    }

    @PostMapping(path = "/carServiceFallBack")
    public String postCarServiceFallBackMethod() {
        return "Car Service is taking longer than Expected." +
                " Please try again later";
    }

    @PutMapping(path = "/carServiceFallBack")
    public String editCarServiceFallBackMethod() {
        return "Car Service is taking longer than Expected." +
                " Please try again later";
    }

    @DeleteMapping(path = "/carServiceFallBack")
    public String deleteCarServiceFallBackMethod() {
        return "Car Service is taking longer than Expected." +
                " Please try again later";
    }

    // LapTop Service
    @GetMapping("/lapTopServiceFallBack")
    public String getLapTopServiceFallBackMethod() {
        return "LapTop Service is taking longer than Expected." +
                " Please try again later";
    }

    @PostMapping(path = "/lapTopServiceFallBack")
    public String postLapTopServiceFallBackMethod() {
        return "LapTop Service is taking longer than Expected." +
                " Please try again later";
    }

    @PutMapping(path = "/lapTopServiceFallBack")
    public String editLapTopServiceFallBackMethod() {
        return "LapTop Service is taking longer than Expected." +
                " Please try again later";
    }

    @DeleteMapping(path = "/lapTopServiceFallBack")
    public String deleteLapTopServiceFallBackMethod() {
        return "LapTop Service is taking longer than Expected." +
                " Please try again later";
    }

}
