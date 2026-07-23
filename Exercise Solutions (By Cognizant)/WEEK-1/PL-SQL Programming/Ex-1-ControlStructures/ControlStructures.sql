CREATE DATABASE SpringSkillCogzi;
USE SpringSkillCogzi;
CREATE TABLE Customers (
    CustomerID INT PRIMARY KEY,
    Name VARCHAR(100),
    Age INT,
    Balance DECIMAL(12,2),
    IsVIP VARCHAR(5)
);

CREATE TABLE Loans (
    LoanID INT PRIMARY KEY,
    CustomerID INT,
    InterestRate DECIMAL(5,2),
    DueDate DATE,
    FOREIGN KEY (CustomerID) REFERENCES Customers(CustomerID)
);

-- Insert Customers
INSERT INTO Customers VALUES
(101,'Rahul',65,12000.00,'FALSE'),
(102,'Priya',45,8000.00,'FALSE'),
(103,'Amit',72,18000.00,'FALSE'),
(104,'Sneha',29,4000.00,'FALSE'),
(105,'Kiran',61,9500.00,'FALSE');

-- Insert Loans
INSERT INTO Loans VALUES
(1,101,8.50,DATE_ADD(CURDATE(),INTERVAL 15 DAY)),
(2,102,9.00,DATE_ADD(CURDATE(),INTERVAL 40 DAY)),
(3,103,10.00,DATE_ADD(CURDATE(),INTERVAL 20 DAY)),
(4,104,7.50,DATE_ADD(CURDATE(),INTERVAL 90 DAY)),
(5,105,8.80,DATE_ADD(CURDATE(),INTERVAL 10 DAY));


/* ==========================
   Scenario 1
   1% Discount Above 60 Age
   ========================== */

UPDATE Loans l
JOIN Customers c
ON l.CustomerID = c.CustomerID
SET l.InterestRate = l.InterestRate - 1
WHERE c.Age > 60;

SELECT LoanID, CustomerID, InterestRate
FROM Loans
ORDER BY LoanID;

/* ==========================
   Scenario 2
   VIP Customers
   ========================== */

UPDATE Customers
SET IsVIP='TRUE'
WHERE Balance > 10000;

SELECT CustomerID, Name, Balance, IsVIP
FROM Customers
ORDER BY CustomerID;

/* ==========================
   Scenario 3
   Loan Due Reminder
   ========================== */

SELECT
    c.CustomerID,
    c.Name,
    l.LoanID,
    l.DueDate,
    CONCAT(
        'Reminder: Dear ',
        c.Name,
        ' (Customer ID: ',
        c.CustomerID,
        ') Your Loan ID ',
        l.LoanID,
        ' is due on ',
        DATE_FORMAT(l.DueDate,'%d-%m-%Y')
    ) AS Reminder
FROM Customers c
JOIN Loans l
ON c.CustomerID = l.CustomerID
WHERE l.DueDate BETWEEN CURDATE() AND DATE_ADD(CURDATE(), INTERVAL 30 DAY)
ORDER BY l.DueDate;

/* ==========================
   Final Verification
   ========================== */

SELECT * FROM Customers ORDER BY CustomerID;

SELECT * FROM Loans ORDER BY LoanID;