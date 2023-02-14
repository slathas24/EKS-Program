package com.scb.ms.account.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import  com.scb.ms.account.dao.BankAccount;


@Repository
public interface AcctRepository extends CrudRepository<BankAccount,String> 
{
	@Query
	public List<BankAccount> findByCustid(String custid);
}


