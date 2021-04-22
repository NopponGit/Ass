package com.training.platform.controllers;

import com.training.platform.entities.User;
import com.training.platform.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;


import com.training.platform.entities.User;
import com.training.platform.repositories.UserRepository;
import com.training.platform.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController

public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping(value = "")
    public List<User> index(){
        return userService.findAll();
    }

    @GetMapping(value = "/findByAgeIn")
    public List<User> findByAgeIn(@RequestBody Map<String,Object> inputs){
        return userService.findByAgeIn((List<Integer>) inputs.get("age"));
    }



}
