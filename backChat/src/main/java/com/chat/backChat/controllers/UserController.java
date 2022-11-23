package com.chat.backChat.controllers;


import com.chat.backChat.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class UserController {

    @Autowired
    private UserRepository repository;






}
