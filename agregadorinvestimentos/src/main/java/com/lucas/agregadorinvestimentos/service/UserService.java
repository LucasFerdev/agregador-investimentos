package com.lucas.agregadorinvestimentos.service;

import com.lucas.agregadorinvestimentos.controller.CreateUserDto;
import com.lucas.agregadorinvestimentos.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {


    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void createUser(CreateUserDto createUserDto) {

    }
}
