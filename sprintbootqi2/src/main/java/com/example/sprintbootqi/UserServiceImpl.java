package com.example.sprintbootqi;

import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepositpry userRepositpry;

    @Override
    public User findByNameAndPassword(User user) {
        return userRepositpry.findByNameAndPassword(user.getName(),user.getPassword());
    }

    @Override
    public User getByUsername(String username) {
        return userRepositpry.getByUsername(username);
    }
}
