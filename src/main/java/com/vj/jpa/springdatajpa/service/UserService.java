package com.vj.jpa.springdatajpa.service;

import com.vj.jpa.springdatajpa.dao.UserRepository;
import com.vj.jpa.springdatajpa.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    List<User> users = Arrays.asList(
            new User(111, "x", "IT", 23),
            new User(222, "y", "HD", 24),
            new User(333, "z", "MI", 25),
            new User(444, "w", "CE", 26),
            new User(555, "p", "SE", 27),
            new User(666, "s", "IT", 28)

    );

    @PostConstruct
    public void initDB() {
        userRepository.saveAll(users);
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public List<User> findByProfession(String profession) {
        return userRepository.findByProfession(profession);
    }

    public List<User> findPeopleWhoseAgeGreaterThen20(int age){
     return userRepository.getAgeGreaterThen20(age);
    }

    public User findOne(Integer id){
        return userRepository.getOne(id);
    }
}
