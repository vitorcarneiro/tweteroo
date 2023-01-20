package com.tweteroo.controller;

import com.tweteroo.dto.UserDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.UserService;

@RestController
@RequestMapping("/auth/signup")
public class UserController {

    private UserService service;

    @PostMapping
    public void createUser(@RequestBody UserDTO req) {
        service.save(req);
    }
}
