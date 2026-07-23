package com.cognizant.jwt_authentication_service.util;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Date;

import javax.crypto.SecretKey;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;

public class JwtUtil {

    private static final SecretKey KEY =
            Keys.hmacShaKeyFor("secretkeysecretkeysecretkeysecret".getBytes(StandardCharsets.UTF_8));

    public static String generateToken(String username) {

        return Jwts.builder()
                .subject(username)
                .issuedAt(new Date())
                .expiration(new Date(System.currentTimeMillis() + 20 * 60 * 1000))
                .signWith(KEY)
                .compact();
    }
}