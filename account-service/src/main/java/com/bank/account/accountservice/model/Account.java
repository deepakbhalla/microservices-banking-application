package com.bank.account.accountservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "account_details")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long account_id;

    @Column(name = "partysysid")
    private Long partysysid;

    @Column(name = "account_number")
    private Long account_number;

    @Column(name = "currency")
    private String currency;

    @Column(name = "account_holder_name")
    private String account_holder_name;

    @Column(name = "balance")
    private Long balance;

    @Column(name = "date_of_opening")
    private String date_of_opening;

    @Column(name = "date_of_closure")
    private String date_of_closure;

    @Column(name = "account_type")
    private String account_type;

    @Column(name = "status")
    private String status;

    public Account(Long account_id, Long partysysid, Long account_number, String currency, String account_holder_name,
            Long balance, String date_of_opening, String date_of_closure, String account_type, String status) {
        super();
        this.account_id = account_id;
        this.partysysid = partysysid;
        this.account_number = account_number;
        this.currency = currency;
        this.account_holder_name = account_holder_name;
        this.balance = balance;
        this.date_of_opening = date_of_opening;
        this.date_of_closure = date_of_closure;
        this.account_type = account_type;
        this.status = status;
    }

    public Account() {
    }

    public Long getAccount_id() {
        return account_id;
    }

    public Long getPartysysid() {
        return partysysid;
    }

    public Long getAccount_number() {
        return account_number;
    }

    public String getCurrency() {
        return currency;
    }

    public String getAccount_holder_name() {
        return account_holder_name;
    }

    public Long getBalance() {
        return balance;
    }

    public String getDate_of_opening() {
        return date_of_opening;
    }

    public String getDate_of_closure() {
        return date_of_closure;
    }

    public String getAccount_type() {
        return account_type;
    }

    public String getStatus() {
        return status;
    }
}
