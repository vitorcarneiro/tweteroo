package com.tweteroo.tweteroo.services;

import com.tweteroo.tweteroo.dtos.UserDTO;
import com.tweteroo.tweteroo.models.User;
import com.tweteroo.tweteroo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> listAll() {
        return repository.findAll();
    }

    public Optional<User> findById(Long id) {
       return repository.findById(id);
    }

    public void create(UserDTO dto) {
        repository.save(new User(dto));
    }
}
