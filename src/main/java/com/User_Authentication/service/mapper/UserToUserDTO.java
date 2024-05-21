package com.User_Authentication.service.mapper;

import com.User_Authentication.dto.UserDto;
import com.User_Authentication.entity.User;

public class UserToUserDTO {
    public UserDto CreateUserDto(User user){

        var userDto = new UserDto();
        userDto.setId(user.getId());
        userDto.setFirstName(user.getFirstName());
        userDto.setLastName(user.getLastName());
        userDto.setBirthdate(user.getBirthdate());
        userDto.setCpf(user.getCpf());
        userDto.setActive(user.isActive());

        return userDto;
    }
}
