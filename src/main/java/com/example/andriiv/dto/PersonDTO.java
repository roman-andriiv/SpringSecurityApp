package com.example.andriiv.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * A DTO for the {@link com.example.andriiv.models.Person} entity
 */
public class PersonDTO {

    @NotEmpty(message = "The username is required")
    @Size(min = 2, max = 100, message = "The username must be at least 2 characters long")
    private String username;

    @Min(value = 1900, message = "The year of birth must be greater or equal to 1900")
    private int yearOfBirth;

    private String password;



    public String getUsername() {
        return username;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}