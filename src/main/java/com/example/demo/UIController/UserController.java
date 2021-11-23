package com.example.demo.UIController;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users") // http://lcoalhost:8080/users
public class UserController {

    @GetMapping
    public String getUser(){
        return "get user was called";
    }

    @PostMapping
    public String createUser(){
        return "User was created";
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
