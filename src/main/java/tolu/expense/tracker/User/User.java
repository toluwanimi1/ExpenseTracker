package tolu.expense.tracker.User;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    // Add more user fields as needed (password, email, etc.)

    // Getters and Setters
}