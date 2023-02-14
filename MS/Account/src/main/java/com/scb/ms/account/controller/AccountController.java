package com.scb.ms.account.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.scb.ms.account.dao.AccountStatement;
import com.scb.ms.account.dao.BankAccount;
import com.scb.ms.account.service.AccountService;

@RestController
public class AccountController {
	@Autowired
    AccountService acctservice ;
    @GetMapping("/accounts/statement/{custid}")
    public ResponseEntity<AccountStatement> getAccountStatement(@PathVariable String custid)
    {
 	  //List<BankAccount> acctlist = acctservice.getDetails(custid);
 	  return new ResponseEntity(acctservice.getAccountStatement(custid),HttpStatus.OK);
    	
    }
    
    @GetMapping("/accounts/account/{acctid}")
    public ResponseEntity<BankAccount> getAccount(@PathVariable String acctid)
    {
    	return new ResponseEntity(acctservice.getAccount(acctid),HttpStatus.OK);
    }
    //@PostMapping("/accounts/new");
    //@DeleteMapping("/accounts/{accountid}");
}
