package com.scb.ms.customer.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.scb.ms.customer.customerrepository.CustRepository;
import com.scb.ms.customer.dao.BankCustomer;



@Service
@EnableEurekaClient
public class CustomerService 
{
	@Autowired
	CustRepository custrepository;
	//RestTemplate restTemplate;
   private List<BankCustomer> custlist=new ArrayList<BankCustomer>();
   
   public CustomerService()
   {
	   //custlist.add(new BankCustomer("C001","CUSTOMER 1","961107600",null));
	   //custlist.add(new BankCustomer("C002","CUSTOMER 2","9444080294",null));
	   
   }
   
   public Optional<BankCustomer> getAddress(String custid)
   {
	   Optional<BankCustomer> c;
	   System.out.println(custid);
	   c=custrepository.findById(custid);
	   System.out.println(c.get().getCustfullname());
	   return c;
   }  
	   /*BankCustomer c=null;
	   Iterator iter = custlist.iterator();
	   System.out.println("ddd");
	   while(iter.hasNext())
	   {
		  
	       c=(BankCustomer)iter.next();
	        if (c.getCustid().equals(custid))
	        	break;
	   }
	   //return c;
	  // Lab 1
	   //This part of the code will use RestTemplate to call the account class to get the account details 
	   /*
	    Map<String,String>params=new HashMap<>();
		params.put("custid", custid);
		String uri="http://127.0.0.1:8091/accounts/{custid}";
		BankAccount [] ba=restTemplate.getForObject(uri,BankAccount[].class ,params);
	    List<BankAccount> l1=Arrays.asList(ba);
	    c.setAccountList(l1);
	   return c;
	   
	   //Lab 2
	   //Using discovery server
	  
	   Map<String,String>params=new HashMap<>();
		params.put("custid", custid);
		String uri="http://Account/accounts/{custid}";
		BankAccount [] ba=restTemplate.getForObject(uri,BankAccount[].class ,params);
	    List<BankAccount> l1=Arrays.asList(ba);
	    c.setAccountList(l1);
	   return c;
	   
	   }
   */

/*
@Bean
@LoadBalanced

public RestTemplate getRestTemplate()
{
     return new RestTemplate();
}
*/
}




