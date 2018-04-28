package com.example.sprintbootqi;

public interface UserService {
    User findByNameAndPassword(User user);

    User getByUsername(String username);
}
