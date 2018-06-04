package com.suman.endless.service;

import com.suman.endless.model.User;

import java.util.List;

public interface UserService {
    User findUserByEmail(String email);

    void saveUser(User user);

    List<User> getAllUser();
}
