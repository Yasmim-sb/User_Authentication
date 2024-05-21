package com.User_Authentication.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Login {

    @Id
    @NotBlank
    @Column(unique = true)
    @Email(message = "invalid format")
    private String Email;

    @NotBlank
    @Size(min = 6, message = "the field must have at least 6 characters")
    private String password;
}
