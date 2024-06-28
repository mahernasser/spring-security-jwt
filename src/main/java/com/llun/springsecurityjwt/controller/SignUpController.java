package com.llun.springsecurityjwt.controller;

import com.llun.springsecurityjwt.payload.request.SignupRequest;
import com.llun.springsecurityjwt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/signup")
public class SignUpController {

    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<?> registerUser(@RequestBody SignupRequest signUpRequest) {
        userService.registerUser(signUpRequest);
        return ResponseEntity.ok("User registered successfully");
    }
}