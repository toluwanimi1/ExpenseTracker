package tolu.expense.tracker.service;

import tolu.expense.tracker.User.User;
import tolu.expense.tracker.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public User getUserById(Long id) {
        return userRepository.findByid(id);
    }

    // Other user-related methods as needed
}
