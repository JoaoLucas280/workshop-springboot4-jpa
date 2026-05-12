package com.projeto.spring_boot.services;

import com.projeto.spring_boot.entities.User;
import com.projeto.spring_boot.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }
    public User findById(Long id) {
        Optional<User> user = userRepository.findById(id);
        return user.get();
    }
}
