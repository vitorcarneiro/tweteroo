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
        this.name = dto.name();
        this.avatar = dto.avatar();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 50, nullable = false)
    private String name;

    @Column(nullable = false)
    private String avatar;
}
