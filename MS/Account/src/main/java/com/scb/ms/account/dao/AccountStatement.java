package com.scb.ms.account.dao;

import java.util.List;

public class AccountStatement 
{
    String custid;
    String custfullname;
    String address;
    String phone;
    public AccountStatement(String custid, String custfullname, String address, String phone, String email,
			List<BankAccount> accountList) {
		super();
		this.custid = custid;
		this.custfullname = custfullname;
		this.address = address;
		this.phone = phone;
		this.email = email;
		this.accountList = accountList;
	}
	public AccountStatement() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getCustid() {
		return custid;
	}
	public void setCustid(String custid) {
		this.custid = custid;
	}
	public String getCustfullname() {
		return custfullname;
	}
	public void setCustfullname(String custfullname) {
		this.custfullname = custfullname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<BankAccount> getAccountList() {
		return accountList;
	}
	public void setAccountList(List<BankAccount> accountList) {
		this.accountList = accountList;
	}
	String email;
    List<BankAccount> accountList;
}
