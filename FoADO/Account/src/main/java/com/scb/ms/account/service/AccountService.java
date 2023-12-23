package com.scb.ms.account.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
//import org.springframework.cloud.client.loadbalancer.LoadBalanced;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.scb.ms.account.dao.AccountStatement;
import com.scb.ms.account.dao.BankAccount;
//import com.scb.ms.account.dao.BankCustomer;
import com.scb.ms.account.repository.AcctRepository;
//import com.scb.ms.Account.service.NotificationManager;

@Service 
//@EnableEurekaClient
public class AccountService 
{
//	@Value("${customer_url}")
	//String customer_url;

	//@Value("${customer_port}")
	//String customer_port;
	//private Map<String,List<BankAccount>> acctmap=new HashMap<>();
	@Autowired
	AcctRepository acctrepository;
	
	List <BankAccount> ba;
	//BankCustomer cust;
	AccountStatement acctStmnt;
//	@Autowired
//	RestTemplate restTemplate;
	
	@Autowired 
	//NotificationManager notificationmgr;
	//RestTemplate restTemplate=new RestTemplate();
    public AccountService()
     {

     }
    public AccountStatement getAccountStatement(String custid)
    {

    	ba=acctrepository.findByCustid(custid);
    	
    	// use the restTemplate method to call the customer Microservice 
   // 	Map<String,String>params=new HashMap<>();
 	//	params.put("custid", custid);
 	//	//String uri="http://Customer/customer/details/{custid}";
	//	String uri=customer_url+":"+customer_port+"/customer/details/{custid}";
//		System.out.println(uri);
 //		cust=restTemplate.getForObject(uri,BankCustomer.class,params);
 	    
 		// Create the Statement object and send it
 		acctStmnt=new AccountStatement();
 		acctStmnt.setCustid(custid);
 		acctStmnt.setAccountList(ba);
 		// Publishing the Statement to Notification Microservice 
 		//notificationmgr.setMessage(acctStmnt);
 		//notificationmgr.dispatchStatement();
 		
 		return acctStmnt;
 		 		
    }
    
     //@LoadBalanced
    @Bean
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
	public Optional<BankAccount> getAccount(String acctid) {
		{	// TODO Auto-generated method stub
		 
		   Optional<BankAccount> a;
			   a=acctrepository.findById(acctid);
			   return a;
		  }         

	}
}
    	/*
       List<BankAccount> l1=new ArrayList<>();
       l1.add(new BankAccount("A001","C001","Savings",1000));
       l1.add(new BankAccount("A002","C001","Savings",10020));
       l1.add(new BankAccount("A003","C001","Savings",100040));
       l1.add(new BankAccount("A004","C001","Savings",200040));
       
       List<BankAccount> l2=new ArrayList<>();
       l2.add(new BankAccount("A010","C002","Savings",1000));
       l2.add(new BankAccount("A011","C002","Savings",10020));
       l2.add(new BankAccount("A012","C002","Savings",100040));
	   acctmap.put("C001", l1);
	   acctmap.put("C002", l2);
	   
    }
    public List<BankAccount> getDetails(String custid)
    {
    	List<BankAccount> list=acctmap.get(custid);
    	return list;
    	 
    	}
    	*/
  
 
