package tolu.expense.tracker.controller;

import tolu.expense.tracker.service.UserService;
import tolu.expense.tracker.User.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class Usercontroller {
    public class UserController {

        @Autowired
        private UserService userService;

        @PostMapping
        public User createUser(@RequestBody User user) {
            return userService.createUser(user);
        }

        @GetMapping("/{username}")
        public User getUserByUsername(@PathVariable String username) {
            return userService.getUserByUsername(username);
        }

        // Other user-related endpoints as needed
    }

}
