package com.bank.customer.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CustomerDetails")
public class CustomerDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "partySysId")
    private Long partySysId;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "middleName")
    private String middleName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "dateOfBirth")
    private String dateOfBirth;

    @Column(name = "address")
    private String address;

    @Column(name = "gender")
    private String gender;

    @Column(name = "meritalStatus")
    private String meritalStatus;

    @Column(name = "emailAddress")
    private String emailAddress;

    @Column(name = "nationalInsuranceNumber")
    private String nationalInsuranceNumber;

    public CustomerDetails(Long partySysId, String firstName, String middleName, String lastName,
            String dateOfBirth, String address, String gender, String meritalStatus, String emailAddress,
            String nationalInsuranceNumber) {

        super();
        this.partySysId = partySysId;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.gender = gender;
        this.meritalStatus = meritalStatus;
        this.emailAddress = emailAddress;
        this.nationalInsuranceNumber = nationalInsuranceNumber;
    }

    public Long getPartySysId() {
        return partySysId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public String getGender() {
        return gender;
    }

    public String getMeritalStatus() {
        return meritalStatus;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getNationalInsuranceNumber() {
        return nationalInsuranceNumber;
    }
}
