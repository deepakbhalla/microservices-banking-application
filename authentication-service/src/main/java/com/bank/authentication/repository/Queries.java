package com.bank.authentication.repository;

/**
 * Queries.
 * 
 * @author Deepak Bhalla
 *
 */
public class Queries {

    public static final String LOGON_QUERY = "select c from Login c where c.username= :username and c.password= :password";
}
