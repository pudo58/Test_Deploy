package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {
    @Autowired
    UserService userService;
    @GetMapping
    String test() {
        return "Hello World";
    }
    @PostMapping
    public User createUser(@RequestBody String username){
        return userService.creatUser(username);
    }

    @GetMapping("all")
    public List<User> allUser(){
        return userService.getAllUsers();
    }

}
