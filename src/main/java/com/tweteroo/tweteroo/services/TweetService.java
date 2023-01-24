package com.tweteroo.tweteroo.services;

import com.tweteroo.tweteroo.models.Tweet;
import com.tweteroo.tweteroo.models.User;
import com.tweteroo.tweteroo.repositories.TweetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class TweetService {
    @Autowired
    private TweetRepository repository;

    public List<Map<String, String>> listAllUserTweets() {
        List<Map<String, String>> tweets = new ArrayList<Map<String, String>>();
        repository.findAll().forEach(tweet -> {
            Map<String, String> newTweet = new HashMap<>();
            newTweet.put("id", tweet.getId().toString());
            newTweet.put("text", tweet.getText());
            newTweet.put("userId", tweet.getUser().getId().toString());
            newTweet.put("username", tweet.getUser().getUsername());
            newTweet.put("avatar", tweet.getUser().getAvatar());

            tweets.add(newTweet);
        });

        return tweets;
    }

    public void create(String text, User user) {
        repository.save(new Tweet(text, user));
    }
}
