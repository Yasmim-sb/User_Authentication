package com.User_Authentication.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Size(min = 3, message = "This field has a minimum of {min} characters")
    private String firstName;
    @Size(min = 3, message = "This field has a minimum of {min} characters")
    private String lastName;
    private String cpf;
    private Date birthdate;
}
