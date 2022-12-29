package com.scb.api.cards.datas;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Cust_Cards")
public class CustCards 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	String cardid;
    String custid;
    String issuedate;
    String expirydate;
    String nameoncard;
    int maxcashlimit;
    int maxcreditlimit;
    int outstanding;
    int  lastpayment;
    int cvv;
    String mobile;
	public CustCards() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CustCards(String cardid, String custid, String issuedate, String expirydate, String nameoncard,
			int maxcashlimit, int creditlimit, int outstanding, int lastpayment, int cvv, String mobile) {
		super();
		this.cardid = cardid;
		this.custid = custid;
		this.issuedate = issuedate;
		this.expirydate = expirydate;
		this.nameoncard = nameoncard;
		this.maxcashlimit = maxcashlimit;
		this.maxcreditlimit = creditlimit;
		this.outstanding = outstanding;
		this.lastpayment = lastpayment;
		this.cvv = cvv;
		this.mobile = mobile;
	}
	public String getCardid() {
		return cardid;
	}
	public void setCardid(String cardid) {
		this.cardid = cardid;
	}
	public String getCustid() {
		return custid;
	}
	public void setCustid(String custid) {
		this.custid = custid;
	}
	public String getIssuedate() {
		return issuedate;
	}
	public void setIssuedate(String issuedate) {
		this.issuedate = issuedate;
	}
	public String getExpirydate() {
		return expirydate;
	}
	public void setExpirydate(String expirydate) {
		this.expirydate = expirydate;
	}
	public String getNameoncard() {
		return nameoncard;
	}
	public void setNameoncard(String nameoncard) {
		this.nameoncard = nameoncard;
	}
	public int getMaxcashlimit() {
		return maxcashlimit;
	}
	public void setMaxcashlimit(int maxcashlimit) {
		this.maxcashlimit = maxcashlimit;
	}
	public int getCreditlimit() {
		return maxcreditlimit;
	}
	public void setCreditlimit(int creditlimit) {
		this.maxcreditlimit = creditlimit;
	}
	public int getOutstanding() {
		return outstanding;
	}
	public void setOutstanding(int outstanding) {
		this.outstanding = outstanding;
	}
	public int getLastpayment() {
		return lastpayment;
	}
	public void setLastpayment(int lastpayment) {
		this.lastpayment = lastpayment;
	}
	public int getCvv() {
		return cvv;
	}
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cardid == null) ? 0 : cardid.hashCode());
		result = prime * result + maxcreditlimit;
		result = prime * result + ((custid == null) ? 0 : custid.hashCode());
		result = prime * result + cvv;
		result = prime * result + ((expirydate == null) ? 0 : expirydate.hashCode());
		result = prime * result + ((issuedate == null) ? 0 : issuedate.hashCode());
		result = prime * result + lastpayment;
		result = prime * result + maxcashlimit;
		result = prime * result + ((mobile == null) ? 0 : mobile.hashCode());
		result = prime * result + ((nameoncard == null) ? 0 : nameoncard.hashCode());
		result = prime * result + outstanding;
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
		CustCards other = (CustCards) obj;
		if (cardid == null) {
			if (other.cardid != null)
				return false;
		} else if (!cardid.equals(other.cardid))
			return false;
		if (maxcreditlimit != other.maxcreditlimit)
			return false;
		if (custid == null) {
			if (other.custid != null)
				return false;
		} else if (!custid.equals(other.custid))
			return false;
		if (cvv != other.cvv)
			return false;
		if (expirydate == null) {
			if (other.expirydate != null)
				return false;
		} else if (!expirydate.equals(other.expirydate))
			return false;
		if (issuedate == null) {
			if (other.issuedate != null)
				return false;
		} else if (!issuedate.equals(other.issuedate))
			return false;
		if (lastpayment != other.lastpayment)
			return false;
		if (maxcashlimit != other.maxcashlimit)
			return false;
		if (mobile == null) {
			if (other.mobile != null)
				return false;
		} else if (!mobile.equals(other.mobile))
			return false;
		if (nameoncard == null) {
			if (other.nameoncard != null)
				return false;
		} else if (!nameoncard.equals(other.nameoncard))
			return false;
		if (outstanding != other.outstanding)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "CustCards [cardid=" + cardid + ", custid=" + custid + ", issuedate=" + issuedate + ", expirydate="
				+ expirydate + ", nameoncard=" + nameoncard + ", maxcashlimit=" + maxcashlimit + ", creditlimit="
				+ maxcreditlimit + ", outstanding=" + outstanding + ", lastpayment=" + lastpayment + ", cvv=" + cvv
				+ ", mobile=" + mobile + "]";
	}
    
}
    
