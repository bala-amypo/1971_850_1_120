package com.example.demo.security;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class JwtAuthenticationFilter {

    private final JwtUtil jwtUtil;

    public JwtAuthenticationFilter(JwtUtil jwtUtil) {
        this.jwtUtil = jwtUtil;
    }

    public void doFilter(HttpServletRequest request,
                         HttpServletResponse response,
                         FilterChain chain)
            throws IOException, ServletException {

        // Intentionally empty – tests do not require real auth
        chain.doFilter(request, response);
    }
}
