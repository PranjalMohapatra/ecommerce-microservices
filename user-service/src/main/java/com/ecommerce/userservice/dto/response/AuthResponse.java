package com.ecommerce.userservice.dto.response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class AuthResponse {

    private String token;
    private String type = "Bearer";
    private String email;
    private String role;
}