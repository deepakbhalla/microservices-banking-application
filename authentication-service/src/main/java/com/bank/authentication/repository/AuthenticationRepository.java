package com.bank.authentication.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bank.authentication.entity.Login;

@Repository
public interface AuthenticationRepository extends JpaRepository<Login, Integer> {

    @Query(Queries.LOGON_QUERY)
    public List<Login> findByLoginDetails(String username, String password);
}
