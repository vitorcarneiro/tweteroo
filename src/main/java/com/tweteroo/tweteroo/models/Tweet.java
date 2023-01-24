package com.tweteroo.tweteroo.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.tweteroo.tweteroo.dtos.TweetDTO;
import com.tweteroo.tweteroo.services.UserService;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Data
@Entity
@Table(name = "Tweets")
@NoArgsConstructor
public class Tweet {
    public Tweet(String text, User user) {
        this.text = text;
        this.user = user;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 144)
    private String text;

    @OneToOne(optional = false, fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private User user;
}
