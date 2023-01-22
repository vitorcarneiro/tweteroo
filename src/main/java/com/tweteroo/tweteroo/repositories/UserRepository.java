package com.tweteroo.tweteroo.repositories;

import com.tweteroo.tweteroo.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
