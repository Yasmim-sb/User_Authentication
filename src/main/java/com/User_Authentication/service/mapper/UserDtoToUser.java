package com.User_Authentication.service.mapper;

import com.User_Authentication.dto.UserDto;
import com.User_Authentication.entity.User;

public class UserDtoToUser {
    public User CreateUserDto(UserDto userDto){

        var user = new User();
        user.setId(userDto.getId());
        user.setFirstName(userDto.getFirstName());
        user.setLastName(userDto.getLastName());
        user.setBirthdate(userDto.getBirthdate());
        user.setCpf(userDto.getCpf());
        user.setActive(userDto.isActive());

        return user;
    }
}
