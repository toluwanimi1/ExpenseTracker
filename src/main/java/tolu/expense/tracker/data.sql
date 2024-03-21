- Drop table if exists (for testing purpose)
DROP TABLE IF EXISTS Expense;

-- Create Expense table
CREATE TABLE Expense (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    description VARCHAR(255),
    amount DECIMAL(10, 2),
    date DATE
);

-- Insert sample expenses
INSERT INTO Expense (description, amount, date) VALUES ('Groceries', 50.00, '2024-02-15');
INSERT INTO Expense (description, amount, date) VALUES ('Gas', 30.00, '2024-02-20');
INSERT INTO Expense (description, amount, date) VALUES ('Dinner with friends', 80.00, '2024-02-22');