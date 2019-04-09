create table CustomerDetails
(
	id NUMBER(10) NOT NULL AUTO_INCREMENT,
	partySysId NUMBER(10) NOT NULL,
	firstName VARCHAR(50) NOT NULL,
	middleName VARCHAR(50),
	lastName VARCHAR(50),
	dateOfBirth VARCHAR(50) NOT NULL,
	address VARCHAR(200) NOT NULL,
	gender VARCHAR(10) NOT NULL,
	meritalStatus VARCHAR(20) NOT NULL,
	emailAddress VARCHAR(50) NOT NULL,
	nationalInsuranceNumber VARCHAR(50) NOT NULL,
	primary key(id)
);