package com.example.filingsystem.filingservice.controllers;

import com.example.filingsystem.filingservice.models.File;
import com.example.filingsystem.filingservice.repositories.FileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/files")
public class FileController {

    @Autowired
    FileRepository fileRepository;

    @GetMapping
    public ResponseEntity<List<File>> getAllFiles(){
        return new ResponseEntity<>(fileRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Optional<File>> getFile(@PathVariable Long id){
        return new ResponseEntity<>(fileRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity postFile(@RequestBody File file){
        fileRepository.save(file);
        return new ResponseEntity(file, HttpStatus.CREATED);
    }
}
