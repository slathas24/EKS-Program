package com.scb.ms.account.dao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Bank_Account")
public class BankAccount 
{
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   String accountid;
   String custid;
   String accounttype;
   Long balance;
  String currency;
public String getAccountid() {
	return accountid;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((accountid == null) ? 0 : accountid.hashCode());
	result = prime * result + ((accounttype == null) ? 0 : accounttype.hashCode());
	result = prime * result + ((balance == null) ? 0 : balance.hashCode());
	result = prime * result + ((currency == null) ? 0 : currency.hashCode());
	result = prime * result + ((custid == null) ? 0 : custid.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	BankAccount other = (BankAccount) obj;
	if (accountid == null) {
		if (other.accountid != null)
			return false;
	} else if (!accountid.equals(other.accountid))
		return false;
	if (accounttype == null) {
		if (other.accounttype != null)
			return false;
	} else if (!accounttype.equals(other.accounttype))
		return false;
	if (balance == null) {
		if (other.balance != null)
			return false;
	} else if (!balance.equals(other.balance))
		return false;
	if (currency == null) {
		if (other.currency != null)
			return false;
	} else if (!currency.equals(other.currency))
		return false;
	if (custid == null) {
		if (other.custid != null)
			return false;
	} else if (!custid.equals(other.custid))
		return false;
	return true;
}
public void setAccountid(String accountid) {
	this.accountid = accountid;
}
public String getCustid() {
	return custid;
}
public void setCustid(String custid) {
	this.custid = custid;
}
public String getAccounttype() {
	return accounttype;
}
public void setAccounttype(String accounttype) {
	this.accounttype = accounttype;
}
public Long getBalance() {
	return balance;
}
public void setBalance(Long balance) {
	this.balance = balance;
}
public String getCurrency() {
	return currency;
}
public void setCurrency(String currency) {
	this.currency = currency;
}
public BankAccount() {
	super();
	// TODO Auto-generated constructor stub
}
public BankAccount(String accountid, String custid, String accounttype, Long balance, String currency) {
	super();
	this.accountid = accountid;
	this.custid = custid;
	this.accounttype = accounttype;
	this.balance = balance;
	this.currency = currency;
}
@Override
public String toString() {
	return "BankAccount [accountid=" + accountid + ", custid=" + custid + ", accounttype=" + accounttype + ", balance="
			+ balance + ", currency=" + currency + "]";
}
}


