package com.User_Authentication.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(min = 3, message = "This field has a minimum of {min} characters")
    private String firstName;

    @NotBlank
    @Size(min = 3, message = "This field has a minimum of {min} characters")
    private String lastName;

    @CPF
    @Column(nullable = true, unique = true)
    private String cpf;

    @NotBlank
    @DateTimeFormat(pattern = "dd/mm/aaaa")
    private LocalDateTime birthdate;

    @NotBlank
    private boolean active;

    public void setCpf(String cpf){
        if(cpf != null && cpf.isEmpty()){
            this.cpf = null;
        } else{
            this.cpf = cpf;
        }
    }
}
