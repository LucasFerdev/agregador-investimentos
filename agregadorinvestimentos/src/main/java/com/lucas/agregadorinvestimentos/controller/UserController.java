package com.lucas.agregadorinvestimentos.controller;

import com.lucas.agregadorinvestimentos.entity.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/users")
public class UserController {

    @PostMapping
    public ResponseEntity<User> createUsers(@RequestBody CreateUserDto createUserDto) {
        //
        return null:
    }

    @GetMapping("/{UserId}")
    public ResponseEntity<User> GetUserById(@PathVariable("userId") String userId) {
        //
        return null:
    }

}
