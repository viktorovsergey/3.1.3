package ru.kata.spring.boot_security.demo.daoService;


import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    public User show (long id);
    public void create  (User user);
    public void update (long id, User user);
    public void delUser(long id);
}
