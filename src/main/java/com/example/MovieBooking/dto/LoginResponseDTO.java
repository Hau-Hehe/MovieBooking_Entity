package com.example.MovieBooking.dto;

import lombok.Builder;
import lombok.Data;

import java.util.Set;

@Data
@Builder
public class LoginResponseDTO {
    private String jwtToken;
    private String userName;
    private Set<String> roles;
}
