package com.bank.authentication.repository;

public class Queries {

    public static final String LOGON_QUERY = "select c from Login c where c.username= :username and c.password= :password";
}
