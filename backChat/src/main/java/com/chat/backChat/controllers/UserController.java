package com.chat.backChat.controllers;

import com.chat.backChat.entities.User;
import com.chat.backChat.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    private UserRepository repository;

    @GetMapping("/user")
    public List<User> index(){
        return repository.findAll();
    }

    @GetMapping("/user/{userId}")
    public User getUser(@PathVariable Long userId) {
        User user = null;
        Optional<User> optionalUser = repository.findById(userId);
        if(optionalUser.isPresent()){
            user = optionalUser.get();
        }

        return user;
    }

    @PostMapping("/user")
    public User create(@RequestBody User user){
        return repository.save(user);
    }

<<<<<<< HEAD
    @PutMapping("/user/{id}")
=======
    @PutMapping("/book/{id}")
>>>>>>> origin/malik
    public User update(@PathVariable Long id, @RequestBody User user){
        // getting blog
        User userToUpdate = repository.findById(id).get();
        userToUpdate.setUsername(user.getUsername());
        userToUpdate.setEmail(user.getEmail());
        userToUpdate.setPassword(user.getPassword());
        return repository.save(userToUpdate);
    }

<<<<<<< HEAD
    @DeleteMapping("user/{id}")
=======
    @DeleteMapping("book/{id}")
>>>>>>> origin/malik
    public boolean delete(@PathVariable Long id){
        repository.deleteById(id);
        return true;
    }
}
