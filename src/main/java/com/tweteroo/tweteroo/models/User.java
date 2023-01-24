package com.tweteroo.tweteroo.models;

import com.tweteroo.tweteroo.dtos.UserDTO;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "Users")
@NoArgsConstructor
public class User {
    public User(UserDTO dto) {
        this.username = dto.username();
        this.avatar = dto.avatar();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 50, nullable = false)
    private String username;

    @Column(length = 2000, nullable = false)
    private String avatar;
}
