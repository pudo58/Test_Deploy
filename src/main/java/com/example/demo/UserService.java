package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepo userRepo;
    public User creatUser(String  username){
        User user = new User();
        user.setName(username);
        return  userRepo.save(user);
    }

    public List<User> getAllUsers(){
        return userRepo.findAll();
    }

}

