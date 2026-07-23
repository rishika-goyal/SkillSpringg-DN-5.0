-- ==========================================================
-- Exercise 3: Stored Procedures (MySQL)
-- ==========================================================

DROP TABLE IF EXISTS Loans;
DROP TABLE IF EXISTS Accounts;
DROP TABLE IF EXISTS Employees;
DROP TABLE IF EXISTS Customers;
-- ==========================================================
-- TABLE CREATION
-- ==========================================================

CREATE TABLE Customers (
    CustomerID INT PRIMARY KEY,
    Name VARCHAR(100),
    Age INT,
    Balance DECIMAL(10,2),
    IsVIP VARCHAR(5)
);

CREATE TABLE Accounts (
    AccountID INT PRIMARY KEY,
    CustomerID INT,
    AccountType VARCHAR(20),
    Balance DECIMAL(10,2),
    FOREIGN KEY (CustomerID) REFERENCES Customers(CustomerID)
);

CREATE TABLE Employees (
    EmployeeID INT PRIMARY KEY,
    Name VARCHAR(100),
    Department VARCHAR(50),
    Salary DECIMAL(10,2),
    PerformanceRating INT
);

-- ==========================================================
-- INSERT SAMPLE DATA
-- ==========================================================

INSERT INTO Customers VALUES
(1,'Rahul Sharma',35,50000,'No'),
(2,'Priya Singh',42,75000,'Yes'),
(3,'Amit Kumar',28,30000,'No'),
(4,'Sneha Reddy',55,90000,'Yes');

INSERT INTO Accounts VALUES
(101,1,'Savings',10000),
(102,2,'Savings',20000),
(103,3,'Current',15000),
(104,4,'Savings',5000);

INSERT INTO Employees VALUES
(1,'Ramesh','IT',50000,5),
(2,'Suresh','HR',45000,4),
(3,'Anita','IT',60000,5),
(4,'Priya','Finance',55000,4),
(5,'Karan','IT',70000,5);

-- ==========================================================
-- SCENARIO 1
-- Process Monthly Interest
-- ==========================================================

DELIMITER $$

CREATE PROCEDURE ProcessMonthlyInterest()
BEGIN
    UPDATE Accounts
    SET Balance = Balance + (Balance * 0.01)
    WHERE AccountType='Savings';

    SELECT 'Monthly interest processed successfully.' AS Message;
END$$

DELIMITER ;

CALL ProcessMonthlyInterest();

SELECT * FROM Accounts;

-- ==========================================================
-- SCENARIO 2
-- Update Employee Bonus
-- ==========================================================

DELIMITER $$

CREATE PROCEDURE UpdateEmployeeBonus(
    IN p_department VARCHAR(50),
    IN p_bonus DECIMAL(5,2)
)
BEGIN
    UPDATE Employees
    SET Salary = Salary + (Salary * p_bonus / 100)
    WHERE Department = p_department;

    SELECT 'Employee bonus updated successfully.' AS Message;
END$$

DELIMITER ;

CALL UpdateEmployeeBonus('IT',10);

SELECT * FROM Employees;

-- ==========================================================
-- SCENARIO 3
-- Transfer Funds
-- ==========================================================

DELIMITER $$

CREATE PROCEDURE TransferFunds(
    IN p_fromAccount INT,
    IN p_toAccount INT,
    IN p_amount DECIMAL(10,2)
)
BEGIN
    DECLARE v_balance DECIMAL(10,2);

    SELECT Balance
    INTO v_balance
    FROM Accounts
    WHERE AccountID = p_fromAccount;

    IF v_balance >= p_amount THEN

        UPDATE Accounts
        SET Balance = Balance - p_amount
        WHERE AccountID = p_fromAccount;

        UPDATE Accounts
        SET Balance = Balance + p_amount
        WHERE AccountID = p_toAccount;

        SELECT 'Transfer Successful.' AS Message;

    ELSE

        SELECT 'Insufficient Balance.' AS Message;

    END IF;

END$$

DELIMITER ;

CALL TransferFunds(101,102,500);

SELECT * FROM Accounts;