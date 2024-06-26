package tolu.expense.tracker.repository;

import tolu.expense.tracker.User.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByid(Long idLong);
}