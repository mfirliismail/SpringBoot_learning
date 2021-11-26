package com.example.demo.Impl;

import com.example.demo.Service.UserService;
import com.example.demo.SharedDto.UserDto;

import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService{

    @Override
    public UserDto createUser(UserDto user){
        // write the logic
        return null;
    }
    
}
