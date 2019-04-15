package com.bank.authentication.model;

/**
 * Model class to represent customer details.
 * 
 * @author Deepak Bhalla
 *
 */
public class CustomerDetails {

    private Long id;
    private Long partySysId;
    private String firstName;
    private String middleName;
    private String lastName;
    private String dateOfBirth;
    private String address;
    private String gender;
    private String meritalStatus;
    private String emailAddress;
    private String nationalInsuranceNumber;

    public CustomerDetails(Long id, Long partySysId, String firstName, String middleName, String lastName,
            String dateOfBirth, String address, String gender, String meritalStatus, String emailAddress,
            String nationalInsuranceNumber) {

        super();
        this.id = id;
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

    public CustomerDetails() {
    }

    public Long getId() {
        return id;
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
