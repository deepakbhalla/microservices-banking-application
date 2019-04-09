package com.bank.authentication.model;

import java.util.Date;

public class CustomerDetails {

    private Long partySysId;
    private String username;
    private String password;
    private String firstName;
    private String middleName;
    private String lastName;
    private Date dateOfBirth;
    private String address;
    private String gender;
    private String meritalStatus;
    private String emailAddress;
    private String nationalInsuranceNumber;

    public CustomerDetails(Long partySysId, String username, String password, String firstName, String middleName,
            String lastName, Date dateOfBirth, String address, String gender, String meritalStatus, String emailAddress,
            String nationalInsuranceNumber) {

        super();
        this.partySysId = partySysId;
        this.username = username;
        this.password = password;
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

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
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

    public Date getDateOfBirth() {
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
