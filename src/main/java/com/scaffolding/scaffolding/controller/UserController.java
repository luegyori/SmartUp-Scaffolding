package com.scaffolding.scaffolding.controller;

import com.scaffolding.scaffolding.entity.User;
import com.scaffolding.scaffolding.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService service;
    public UserController(UserService service){
        this.service = service;
    }

    @GetMapping("/{id}")
    public ResponseEntity<String> getOne(@PathVariable(value = "id") Long id) {
        return new ResponseEntity<>(service.getOne(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<String> create(@RequestBody User user) {
        return new ResponseEntity<>(service.create(user), HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<String> updateFull(@RequestBody User user) {
        return new ResponseEntity<>("Usuario modificado", HttpStatus.OK);
    }

    @PatchMapping
    public ResponseEntity<String> update(@RequestBody User user) {
        return new ResponseEntity<>("Usuario modificado", HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable(value = "id") Long id) {
        return new ResponseEntity<>("Devuelve ID de usuario", HttpStatus.OK);
    }
}
