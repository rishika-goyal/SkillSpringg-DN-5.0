package com.cognizant.jwt_authentication_service.controller;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.jwt_authentication_service.model.AuthenticationResponse;
import com.cognizant.jwt_authentication_service.util.JwtUtil;

@RestController
public class AuthenticationController {

    @GetMapping("/authenticate")
    public AuthenticationResponse authenticate(
            @RequestHeader("Authorization") String authorizationHeader) {

        String encodedCredentials = authorizationHeader.substring(6);

        byte[] decodedBytes = Base64.getDecoder().decode(encodedCredentials);

        String decodedCredentials = new String(decodedBytes, StandardCharsets.UTF_8);

        String username = decodedCredentials.split(":")[0];

        String token = JwtUtil.generateToken(username);

        return new AuthenticationResponse(token);
    }
}