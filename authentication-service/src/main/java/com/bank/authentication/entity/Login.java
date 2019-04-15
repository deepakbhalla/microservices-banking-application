package com.bank.authentication.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Entity class for login operation.
 * 
 * @author Deepak Bhalla
 *
 */
@Entity
@Table(name = "Login")
public class Login {

    @Column(name = "party_sys_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long party_sys_id;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    public Long getPartySysId() {
        return party_sys_id;
    }

    public Login(Long partySysId, String username, String password) {
        this.party_sys_id = partySysId;
        this.username = username;
        this.password = password;
    }

    public Login() {

    }

    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void setPartySysId(Long partySysId) {
        this.party_sys_id = partySysId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
