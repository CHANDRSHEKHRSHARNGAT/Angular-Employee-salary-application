package com.user.service;

import com.user.entities.User;

import java.util.List;

public interface UserService {

    //user operation

    User saveUser(User user);

    //get all user
    List<User> getAllUser();

    //get single user

    User getUser(String userId);

    //delete
    //update
}
