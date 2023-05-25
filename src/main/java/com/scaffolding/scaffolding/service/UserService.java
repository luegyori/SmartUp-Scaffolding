package com.scaffolding.scaffolding.service;

import com.scaffolding.scaffolding.entity.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    /*private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }*/

    public UserService() { }

    public String getOne(Long id) {
        //return repository.findById(id);
        return "Found user with id " + id;
    }

    public String create(User user) {
        //return repository.save(user);
        return "Created user " + user.getName() + " " + user.getSurname();
    }

    public String update(User user) {
        //return repository.save(user);
        return "Updated user with id " + user.getId();
    }

}
