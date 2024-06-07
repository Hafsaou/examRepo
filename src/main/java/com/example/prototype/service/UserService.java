package com.example.prototype.service;

import com.example.prototype.model.UserModel;
import com.example.prototype.model.UserRole;
import com.example.prototype.repository.UserRepository;
import jakarta.annotation.PostConstruct;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UserService {

    @Autowired
    UserRepository userRepository;

    private final PasswordEncoder passwordEncoder;

    @PostConstruct
    public void postConstruct() {
      /*  UserModel user = new UserModel();
        user.setRole(UserRole.ADMIN);
        user.setUsername("admin");
        user.setPassword(passwordEncoder.encode("abc"));
        users.add(user);*/
    }

    public void register(UserModel user) {
        user.setRole(UserRole.USER);
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepository.save(user);
    }

    public UserModel findByLogin(String login) {
        UserModel user = userRepository.findByUsername(login);
        if(user!=null) return user;
        else {
            throw new RuntimeException("User not found");
        }
    }
}
