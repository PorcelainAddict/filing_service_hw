package com.example.filingsystem.filingservice.controllers;

import com.example.filingsystem.filingservice.models.Folder;
import com.example.filingsystem.filingservice.models.User;
import com.example.filingsystem.filingservice.repositories.FolderRepository;
import com.example.filingsystem.filingservice.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping
    public ResponseEntity<List<User>> getAllUsers() {
        return new ResponseEntity<>(userRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Optional<User>> getUser(@PathVariable Long id) {
        return new ResponseEntity<>(userRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity postUser(@RequestBody User user) {
        userRepository.save(user);
        return new ResponseEntity(user, HttpStatus.CREATED);
    }
}