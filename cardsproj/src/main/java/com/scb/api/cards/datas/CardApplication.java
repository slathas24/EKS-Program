package com.scb.api.cards.datas;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CardsApp")
public class CardApplication 
{
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
  String appid;
  String dateofappln;
  String custid;
  String mobile;
  String prooftype;
  String proofidNo;
  String url;
  String status;
public CardApplication() {
	super();
	// TODO Auto-generated constructor stub
}
public CardApplication(String appid, String dateofappln, String custid, String mobile, String prooftype,
		String proofidNo, String url, String status) {
	super();
	this.appid = appid;
	this.dateofappln = dateofappln;
	this.custid = custid;
	this.mobile = mobile;
	this.prooftype = prooftype;
	this.proofidNo = proofidNo;
	this.url = url;
	this.status = status;
}
public String getAppid() {
	return appid;
}
public void setAppid(String appid) {
	this.appid = appid;
}
public String getDateofappln() {
	return dateofappln;
}
public void setDateofappln(String dateofappln) {
	this.dateofappln = dateofappln;
}
public String getCustid() {
	return custid;
}
public void setCustid(String custid) {
	this.custid = custid;
}
public String getMobile() {
	return mobile;
}
public void setMobile(String mobile) {
	this.mobile = mobile;
}
public String getProoftype() {
	return prooftype;
}
public void setProoftype(String prooftype) {
	this.prooftype = prooftype;
}
public String getProofidNo() {
	return proofidNo;
}
public void setProofidNo(String proofidNo) {
	this.proofidNo = proofidNo;
}
public String getUrl() {
	return url;
}
public void setUrl(String url) {
	this.url = url;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((appid == null) ? 0 : appid.hashCode());
	result = prime * result + ((custid == null) ? 0 : custid.hashCode());
	result = prime * result + ((dateofappln == null) ? 0 : dateofappln.hashCode());
	result = prime * result + ((mobile == null) ? 0 : mobile.hashCode());
	result = prime * result + ((proofidNo == null) ? 0 : proofidNo.hashCode());
	result = prime * result + ((prooftype == null) ? 0 : prooftype.hashCode());
	result = prime * result + ((status == null) ? 0 : status.hashCode());
	result = prime * result + ((url == null) ? 0 : url.hashCode());
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
	CardApplication other = (CardApplication) obj;
	if (appid == null) {
		if (other.appid != null)
			return false;
	} else if (!appid.equals(other.appid))
		return false;
	if (custid == null) {
		if (other.custid != null)
			return false;
	} else if (!custid.equals(other.custid))
		return false;
	if (dateofappln == null) {
		if (other.dateofappln != null)
			return false;
	} else if (!dateofappln.equals(other.dateofappln))
		return false;
	if (mobile == null) {
		if (other.mobile != null)
			return false;
	} else if (!mobile.equals(other.mobile))
		return false;
	if (proofidNo == null) {
		if (other.proofidNo != null)
			return false;
	} else if (!proofidNo.equals(other.proofidNo))
		return false;
	if (prooftype == null) {
		if (other.prooftype != null)
			return false;
	} else if (!prooftype.equals(other.prooftype))
		return false;
	if (status == null) {
		if (other.status != null)
			return false;
	} else if (!status.equals(other.status))
		return false;
	if (url == null) {
		if (other.url != null)
			return false;
	} else if (!url.equals(other.url))
		return false;
	return true;
}
@Override
public String toString() {
	return "CardApplication [appid=" + appid + ", dateofappln=" + dateofappln + ", custid=" + custid + ", mobile="
			+ mobile + ", prooftype=" + prooftype + ", proofidNo=" + proofidNo + ", url=" + url + ", status=" + status
			+ "]";
}



}
