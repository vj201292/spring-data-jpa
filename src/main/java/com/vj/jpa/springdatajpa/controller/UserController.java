package com.vj.jpa.springdatajpa.controller;

import com.vj.jpa.springdatajpa.model.User;
import com.vj.jpa.springdatajpa.service.UserService;
import org.apache.catalina.LifecycleState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/all")
    public List<User> getAllUsers(){
        return userService.findAll();
    }

    @GetMapping("/getUserByProfession/{profession}")
    public List<User> findByProfession(@PathVariable String profession){
     return userService.findByProfession(profession);
    }

    @GetMapping("/getUserByAge/{age}")
    public List<User> findByAge(@PathVariable int age){
        return userService.findPeopleWhoseAgeGreaterThen20(age);
    }
}
