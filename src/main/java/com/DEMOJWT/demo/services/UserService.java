package com.DEMOJWT.demo.services;

import com.DEMOJWT.demo.model.UserModel;
import com.DEMOJWT.demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void save(UserModel user) {
        userRepository.save(user);
    }

    public UserModel findByUser(String user) {
        return userRepository.findByUser(user);
    }
}
