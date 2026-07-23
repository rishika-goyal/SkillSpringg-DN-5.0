package com.cognizant.jwt_authentication_service.model;

public class AuthenticationResponse {

    private String token;

    public AuthenticationResponse() {
    }

    public AuthenticationResponse(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}