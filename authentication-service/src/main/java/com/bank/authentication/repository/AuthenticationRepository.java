package com.bank.authentication.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bank.authentication.entity.Login;

/**
 * Authentication repository class.
 * 
 * @author Deepak Bhalla
 *
 */
@Repository
public interface AuthenticationRepository extends JpaRepository<Login, Integer> {

    @Query(Queries.LOGON_QUERY)
    public List<Login> findByLoginDetails(@Param("username") String username, @Param("password") String password);
}
