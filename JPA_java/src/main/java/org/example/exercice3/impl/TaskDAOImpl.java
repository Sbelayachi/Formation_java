package org.example.exercice3.impl;

import org.example.exercice3.dao.UserDAO;
import org.example.exercice3.model.User;

import java.util.List;

public class TaskDAOImpl {
    public boolean saveUser(String userName) {
        User user = new User(userName);
        return UserDAO.add(user);
    }

    public List<User> getAllUsers() {
        return UserDAO.get();
    }

    public boolean deleteUser(int id) {
        return UserDAO.delete(id);
    }

    public User getUser(int id) {
        return UserDAO.get(id);
    }
}
