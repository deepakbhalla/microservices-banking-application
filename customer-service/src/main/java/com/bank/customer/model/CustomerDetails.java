package com.bank.customer.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Entity class for Customer Details.
 * 
 * @author Deepak Bhalla
 *
 */
@Entity
@Table(name = "customer_details")
public class CustomerDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "partysysid")
    private Long partysysid;

    @Column(name = "first_name")
    private String first_name;

    @Column(name = "middle_name")
    private String middle_name;

    @Column(name = "last_name")
    private String last_name;

    @Column(name = "date_of_birth")
    private String date_of_birth;

    @Column(name = "address")
    private String address;

    @Column(name = "gender")
    private String gender;

    @Column(name = "merital_status")
    private String merital_status;

    @Column(name = "email_address")
    private String email_address;

    @Column(name = "national_insurance_number")
    private String national_insurance_number;

    public CustomerDetails(Long id, Long partysysid, String first_name, String middle_name, String last_name,
            String date_of_birth, String address, String gender, String merital_status, String email_address,
            String national_insurance_number) {

        super();
        this.id = id;
        this.partysysid = partysysid;
        this.first_name = first_name;
        this.middle_name = middle_name;
        this.last_name = last_name;
        this.date_of_birth = date_of_birth;
        this.address = address;
        this.gender = gender;
        this.merital_status = merital_status;
        this.email_address = email_address;
        this.national_insurance_number = national_insurance_number;
    }

    public CustomerDetails() {
    }

    public Long getId() {
        return id;
    }

    public Long getPartySysId() {
        return partysysid;
    }

    public String getFirstName() {
        return first_name;
    }

    public String getMiddleName() {
        return middle_name;
    }

    public String getLastName() {
        return last_name;
    }

    public String getDateOfBirth() {
        return date_of_birth;
    }

    public String getAddress() {
        return address;
    }

    public String getGender() {
        return gender;
    }

    public String getMeritalStatus() {
        return merital_status;
    }

    public String getEmailAddress() {
        return email_address;
    }

    public String getNationalInsuranceNumber() {
        return national_insurance_number;
    }
}
