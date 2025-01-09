-- Ex1
CREATE TABLE User (
    UserID INT PRIMARY KEY,
    UserName VARCHAR(50),
    Email VARCHAR(50)
);

CREATE TABLE UserProfile (
    ProfileID INT PRIMARY KEY,
    UserID INT UNIQUE,
    Bio VARCHAR(255),
    FOREIGN KEY (UserID) REFERENCES User(UserID)
);

-- Insert data
INSERT INTO User (UserID, UserName, Email) 
VALUES (1, 'Alice', 'alice@example.com'), 
       (2, 'Bob', 'bob@example.com'), 
       (3, 'Charlie', 'charlie@example.com');

INSERT INTO UserProfile (ProfileID, UserID, Bio) 
VALUES (101, 1, 'Loves programming'), 
       (102, 2, 'Data scientist'), 
       (103, 3, 'AI enthusiast');


-- Ex2
CREATE TABLE User (
    UserID INT PRIMARY KEY,
    UserName VARCHAR(50),
    Email VARCHAR(50)
);

CREATE TABLE UserProfile (
    ProfileID INT PRIMARY KEY,
    UserID INT UNIQUE,
    Bio VARCHAR(255),
    FOREIGN KEY (UserID) REFERENCES User(UserID)
);

-- Insert data
INSERT INTO User (UserID, UserName, Email) 
VALUES (1, 'Alice', 'alice@example.com'), 
       (2, 'Bob', 'bob@example.com'), 
       (3, 'Charlie', 'charlie@example.com');

INSERT INTO UserProfile (ProfileID, UserID, Bio) 
VALUES (101, 1, 'Loves programming'), 
       (102, 2, 'Data scientist'), 
       (103, 3, 'AI enthusiast');