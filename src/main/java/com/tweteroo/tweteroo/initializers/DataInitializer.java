package com.tweteroo.tweteroo.initializers;

import com.tweteroo.tweteroo.dtos.UserDTO;
import com.tweteroo.tweteroo.models.User;
import com.tweteroo.tweteroo.repositories.UserRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class DataInitializer {
    private final UserRepository userRepository;

    @PostConstruct
    public void initialize() {
        int usersAmount = 5;

        for (int i = 0; i < usersAmount; i++) {
            User user = new User(new UserDTO("user" + i,"https://picsum.photos/id/" + i + "/200/200"));
            userRepository.save(user);
        }
    }
}
