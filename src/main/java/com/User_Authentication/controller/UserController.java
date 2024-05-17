package com.User_Authentication.controller;

import com.User_Authentication.repository.UserRepository;
import com.User_Authentication.service.UserServive;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping()
public class UserController {
    private UserServive userService;
    private UserRepository userRepository;

}
