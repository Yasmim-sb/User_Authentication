package com.User_Authentication.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    private Long id;
    @Size(min = 3, message = "This field has a minimum of {min} characters")
    private String firstName;

    @Size(min = 3, message = "This field has a minimum of {min} characters")
    private String lastName;

    @CPF
    @Column(nullable = true, unique = true)
    private String cpf;

    @DateTimeFormat(pattern = "dd/mm/aaaa")
    private LocalDateTime birthdate;

    private boolean active;

    public void setCpf(String cpf){
        if(cpf != null && cpf.isEmpty()){
            this.cpf = null;
        } else{
            this.cpf = cpf;
        }
    }
}
