package com.User_Authentication.controller;

import com.User_Authentication.dto.UserDto;
import com.User_Authentication.repository.UserRepository;
import com.User_Authentication.service.UserServive;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/userAuthentication ")
public class UserController {
    private UserServive userService;
    private UserRepository userRepository;

    public ResponseEntity<UserDto> createUser(@RequestBody @Validated UserDto user){
        UserDto create = userService.createUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(create);
    }

}
