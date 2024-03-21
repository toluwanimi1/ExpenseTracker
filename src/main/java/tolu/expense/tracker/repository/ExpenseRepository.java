package tolu.expense.tracker.repository;

import tolu.expense.tracker.model.Expense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Long> {
    // You can add custom query methods here if needed
}