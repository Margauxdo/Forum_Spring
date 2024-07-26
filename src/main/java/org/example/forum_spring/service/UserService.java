package org.example.forum_spring.service;

import org.example.forum_spring.dao.UserRepository;
import org.example.forum_spring.entity.User;

import java.util.List;
import java.util.UUID;

public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUser() {
        return (List<User>) userRepository.findAll();
    }

    public User createOrUpdateUser(User user) {
        return userRepository.save(user);
    }
    public void deleteUser(UUID id) {
       userRepository.deleteById(id);

    }
    public User findUserById(UUID id) {
        return userRepository.findById(id).orElse(null);
    }
}
