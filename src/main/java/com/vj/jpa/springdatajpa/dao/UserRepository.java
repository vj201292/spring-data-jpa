package com.vj.jpa.springdatajpa.dao;

import com.vj.jpa.springdatajpa.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;


public interface UserRepository extends JpaRepository<User, Integer> {

    List<User> findByProfession(String profession);

    @Query("select u from User u where u.age>?1")
    List<User> getAgeGreaterThen20(int age);




}
