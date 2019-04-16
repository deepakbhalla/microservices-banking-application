package com.bank.account.accountservice.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.bank.account.accountservice.model.Account;

@Repository
public interface AccountDetailsRepository extends JpaRepository<Account, Integer> {

    public List<Account> findByPartysysid(Long party_sys_id);
}
