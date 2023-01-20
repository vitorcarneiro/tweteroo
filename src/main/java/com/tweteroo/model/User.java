package com.tweteroo.model;

import com.tweteroo.dto.UserDTO;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NonNull;

@Data
@Entity
@Table(name = "Users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(length = 20, nullable = false)
    private String name;
    @Column(nullable = false)
    private String avatar;

    public User(@NonNull UserDTO data) {
        this.name = data.name();
        this.avatar = data.avatar();
    }

    public User() {
    }
}
