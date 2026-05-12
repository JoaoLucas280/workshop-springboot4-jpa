package com.projeto.spring_boot.controller;

import com.projeto.spring_boot.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @GetMapping
    public ResponseEntity<User> findAllUsers() {
        User u = new User(1L, "Maria", "maria@gmail.com", "9999999", "An4567");
        return ResponseEntity.ok().body(u);
    }


}
