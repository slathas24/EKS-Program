package com.scb.ms.customer.customerrepository;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;
import com.scb.ms.customer.dao.BankCustomer;

@Repository
public interface CustRepository extends CrudRepository<BankCustomer, String> 
{
}

