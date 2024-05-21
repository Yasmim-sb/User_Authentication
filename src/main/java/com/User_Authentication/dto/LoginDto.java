package com.User_Authentication.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class LoginDto {


    @NotBlank
    private String Email;

    @NotBlank
    @Size(min = 6, message = "the field must have at least 6 characters")
    private String password;
}
