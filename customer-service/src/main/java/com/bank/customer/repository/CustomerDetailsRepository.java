package com.bank.customer.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bank.customer.model.CustomerDetails;

/**
 * Customer Deails repository class.
 * 
 * @author Deepak Bhalla
 *
 */
@Repository
public interface CustomerDetailsRepository extends JpaRepository<CustomerDetails, Integer> {

    public List<CustomerDetails> findByPartysysid(Long party_sys_id);
}
