package com.example.demo.UIController;

import com.example.demo.Service.UserService;
import com.example.demo.SharedDto.UserDto;
import com.example.demo.UIModelRequest.UserDetailsRequestModel;
import com.example.demo.UIModelResponse.UserRest;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users") // http://lcoalhost:8080/users
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping
    public String getUser(){
        return "get user was called";
    }

    @PostMapping
    public UserRest createUser(@RequestBody UserDetailsRequestModel UserDetails){
        UserRest returnValue=  new UserRest();

        UserDto userDto = new UserDto();
        BeanUtils.copyProperties(UserDetails, userDto);

        UserDto createdUser = userService.createUser(userDto);
        BeanUtils.copyProperties(createdUser, returnValue);

        return returnValue;
    }

    @PutMapping
    public String updateUser(){
        return "Update User";
    }

    @DeleteMapping
    public String deleteUser(){
        return "Deleted the user";
    }
}
