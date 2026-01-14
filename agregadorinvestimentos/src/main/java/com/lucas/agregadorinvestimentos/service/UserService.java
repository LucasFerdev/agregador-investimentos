package com.lucas.agregadorinvestimentos.service;

import com.lucas.agregadorinvestimentos.controller.CreateUserDto;
import com.lucas.agregadorinvestimentos.entity.User;
import com.lucas.agregadorinvestimentos.repository.UserRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.net.URI;
import java.time.Instant;
import java.util.UUID;

@Service
public class UserService {


    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UUID createUser(CreateUserDto createUserDto) {

        // DTO -> ENTITY
        var ententy = new User(
                null,
                createUserDto.username(),
                createUserDto.email(),
                createUserDto.password(),
                Instant.now(),
                null);


        var userSaved = userRepository.save(ententy);

        return userSaved.getUserID();

    }
}
