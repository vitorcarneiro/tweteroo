package com.tweteroo.tweteroo.services;

import com.tweteroo.tweteroo.models.Tweet;
import com.tweteroo.tweteroo.models.User;
import com.tweteroo.tweteroo.repositories.TweetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TweetService {
    @Autowired
    private TweetRepository repository;

    public List<Tweet> listAll() {
        return repository.findAll();
    }

    public void create(String text, User user) {
        repository.save(new Tweet(text, user));

    }
}
