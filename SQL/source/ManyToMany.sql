CREATE TABLE Class(
    ClassID varchar2(10) PRIMARY KEY, 
    Title varchar2(30),
    Instructor varchar2(30), 
    Day varchar2(15), 
    Time varchar2(10)
);

CREATE TABLE Student(
    StudentID varchar2(15) PRIMARY KEY, 
    Name varchar2(35),
    Major varchar2(35), 
    ClassYear varchar2(10), 
    Status varchar2(10)
);  

CREATE TABLE ClassStudentRelation(
    StudentID varchar2(15) NOT NULL,
    ClassID varchar2(14) NOT NULL,
    FOREIGN KEY (StudentID) REFERENCES Student(StudentID), 
    FOREIGN KEY (ClassID) REFERENCES Class(ClassID),
    UNIQUE (StudentID, ClassID)
);