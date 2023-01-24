package com.tweteroo.tweteroo.repositories;

import com.tweteroo.tweteroo.models.Tweet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TweetRepository extends JpaRepository<Tweet, Long> {
}
