package com.codigo.examen.service;

import org.springframework.security.core.userdetails.UserDetails;

public interface JWTService {
    String generateToken(String username, String role, String email);
    boolean validateToken(String token, UserDetails userDetails);
    String extractUserName(String token);
}
