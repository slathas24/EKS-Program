/*package com.scb.ms.account.dao;


import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Bank_Customer")
	public class BankCustomer
	{
	   @Id
       @GeneratedValue(strategy = GenerationType.IDENTITY)
		String custid;
	    String custfullname;
	    String bankid;
	    String address;
	    String phone;
	    String email;
		public BankCustomer(String custid, String custfullname, String bankid, String address, String phone,
				String email) {
			super();
			this.custid = custid;
			this.custfullname = custfullname;
			this.bankid = bankid;
			this.address = address;
			this.phone = phone;
			this.email = email;
		}
		public BankCustomer() {
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
		public String getBankid() {
			return bankid;
		}
		public void setBankid(String bankid) {
			this.bankid = bankid;
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
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((address == null) ? 0 : address.hashCode());
			result = prime * result + ((bankid == null) ? 0 : bankid.hashCode());
			result = prime * result + ((custfullname == null) ? 0 : custfullname.hashCode());
			result = prime * result + ((custid == null) ? 0 : custid.hashCode());
			result = prime * result + ((email == null) ? 0 : email.hashCode());
			result = prime * result + ((phone == null) ? 0 : phone.hashCode());
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
			BankCustomer other = (BankCustomer) obj;
			if (address == null) {
				if (other.address != null)
					return false;
			} else if (!address.equals(other.address))
				return false;
			if (bankid == null) {
				if (other.bankid != null)
					return false;
			} else if (!bankid.equals(other.bankid))
				return false;
			if (custfullname == null) {
				if (other.custfullname != null)
					return false;
			} else if (!custfullname.equals(other.custfullname))
				return false;
			if (custid == null) {
				if (other.custid != null)
					return false;
			} else if (!custid.equals(other.custid))
				return false;
			if (email == null) {
				if (other.email != null)
					return false;
			} else if (!email.equals(other.email))
				return false;
			if (phone == null) {
				if (other.phone != null)
					return false;
			} else if (!phone.equals(other.phone))
				return false;
			return true;
		}
	    
	   
	}
*/

