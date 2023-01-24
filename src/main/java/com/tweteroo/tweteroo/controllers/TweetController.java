package com.tweteroo.tweteroo.controllers;

import com.tweteroo.tweteroo.dtos.TweetDTO;
import com.tweteroo.tweteroo.models.User;
import com.tweteroo.tweteroo.services.TweetService;
import com.tweteroo.tweteroo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/tweets")
public class TweetController {

    @Autowired
    private TweetService tweetService;

    @Autowired
    private UserService userService;

    @GetMapping("health")
    public String health() {
        return "OK";
    }

    @PostMapping
    public void create(@RequestBody TweetDTO req) throws Exception {
        User user = userService.findById(req.userId()).orElseThrow(NotFoundException::new);

        System.out.println(req.text());
        System.out.println(user.getUsername());
        System.out.println(user.getAvatar());

        tweetService.create(req.text(), user);
    }

    @GetMapping
    public List<Map<String, String>> findAll() {
        return tweetService.listAllUserTweets();
    }
}
