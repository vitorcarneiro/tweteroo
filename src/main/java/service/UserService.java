package service;

import com.tweteroo.dto.UserDTO;
import com.tweteroo.model.User;
import com.tweteroo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }

    public User save(UserDTO dto) {
        System.out.println("service save");
        return repository.save(new User(dto));
    }
}
