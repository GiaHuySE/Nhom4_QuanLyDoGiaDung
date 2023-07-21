package com.example.user_services.service;

import com.example.user_services.model.User;
import com.example.user_services.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServices {
    @Autowired
    private UserRepository userRepository;

    public List<User> listUsers() {
        return userRepository.findAll();
    }

    public User findUserById(int idUser) {
        return userRepository.findUserById(idUser);
    }

    public User addUser(User user) {
        return userRepository.save(user);
    }

    public void deleteUser (User user) {
        userRepository.delete(user);
    }

    public User updateUser (User user) {
        return userRepository.save(user);
    }
}
