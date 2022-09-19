package com.example.andriiv.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

/**
 * @author Roman_Andriiv
 */
public class AuthenticationDTO {
    @NotEmpty(message = "The username is required")
    @Size(min = 2, max = 100, message = "The username must be at least 2 characters long")
    private String username;

    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
