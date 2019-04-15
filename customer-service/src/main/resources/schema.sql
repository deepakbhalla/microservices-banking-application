create table customer_details
(
	id NUMBER(10) NOT NULL AUTO_INCREMENT,
	partysysid NUMBER(10) NOT NULL,
	first_name VARCHAR(50) NOT NULL,
	middle_name VARCHAR(50),
	last_name VARCHAR(50),
	date_of_birth VARCHAR(50) NOT NULL,
	address VARCHAR(200) NOT NULL,
	gender VARCHAR(10) NOT NULL,
	merital_status VARCHAR(20) NOT NULL,
	email_address VARCHAR(50) NOT NULL,
	national_insurance_number VARCHAR(50) NOT NULL,
	primary key(id)
);