package ru.otus.elena.service;

import ru.otus.elena.entity.User;

public interface UserService {
    User createUser(String name);
    User findById(int id);
    void deleteById(int id);
}
