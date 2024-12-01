package org.lab.scooters.dao;

import org.lab.scooters.models.User;

import java.util.List;

public interface UserDao {
    void saveUser(User user);
    void updateUser(User user);
    void deleteUser(User user);
    User getUserByID(Long id);
    List<User> getAllUsers();
}
