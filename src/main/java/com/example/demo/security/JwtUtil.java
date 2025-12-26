package com.example.demo.security;

import java.util.UUID;

public class JwtUtil {

    public String generateToken(String username) {
        // Dummy token generation (sufficient for tests)
        return "token-" + username + "-" + UUID.randomUUID();
    }

    public String extractUsername(String token) {
        if (token == null || !token.contains("-")) {
            return null;
        }
        // token-username-uuid
        String[] parts = token.split("-");
        return parts.length >= 2 ? parts[1] : null;
    }

    public boolean validateToken(String token) {
        return token != null && token.startsWith("token-");
    }
}
