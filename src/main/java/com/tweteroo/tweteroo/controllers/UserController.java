package com.tweteroo.tweteroo.controllers;

import com.tweteroo.tweteroo.dtos.UserDTO;
import com.tweteroo.tweteroo.models.User;
import com.tweteroo.tweteroo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/auth/sign-up")
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping("/health")
    public String health() {
        return "OK";
    }

    @PostMapping
    public void create(@RequestBody UserDTO req) {
        service.create(req);
    }

    @GetMapping
    public List<User> findAll() {
        return service.listAll();
    }
}
