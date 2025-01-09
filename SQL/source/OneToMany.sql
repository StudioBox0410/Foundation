CREATE TABLE Vendor(
    VendorNumber number(4) PRIMARY KEY,
    Name varchar2(20),
    Address varchar2(20),
    City varchar2(15),
    Street varchar2(2),
    ZipCode varchar2(10),
    Contact varchar2(16),
    PhoneNumber varchar2(12),
    Status varchar2(8),
    StampDate date
);

CREATE TABLE Inventory(
    Item varchar2(6) PRIMARY KEY,
    Description varchar2(30),
    CurrentQuantity number(4) NOT NULL,
    VendorNumber number(2) REFERENCES Vendor(VendorNumber),
    ReorderQuantity number(3) NOT NULL
);