package com.scb.ms.customer.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.scb.ms.customer.dao.BankCustomer;
import com.scb.ms.customer.service.CustomerService;

@RestController
public class CustomerController {

  @Autowired
  CustomerService custservice;
	    
 @GetMapping("/customer/details/{custid}")
  public ResponseEntity<BankCustomer> getCustomerDetails(@PathVariable String custid)
  {
     Optional<BankCustomer> cust= custservice.getAddress(custid);
     return new ResponseEntity(cust,HttpStatus.OK);
	   }
	   

//@PostMapping("/customer/")
//@PutMapping("/customer/address/{custid}")
//
//@PostMapping("/customer/kyc")
}
