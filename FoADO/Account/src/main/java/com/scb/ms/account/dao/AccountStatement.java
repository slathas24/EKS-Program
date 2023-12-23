package com.scb.ms.account.dao;

import java.util.List;

public class AccountStatement 
{
    String custid;
	List<BankAccount> accountList;

	public AccountStatement() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AccountStatement(String custid, List<BankAccount> accountList) {
		this.custid = custid;
		this.accountList = accountList;
	}

	public String getCustid() {
		return custid;
	}
	public void setCustid(String custid) {
		this.custid = custid;
	}
	public List<BankAccount> getAccountList() {
		return accountList;
	}
	public void setAccountList(List<BankAccount> accountList) {
		this.accountList = accountList;
	}


}
