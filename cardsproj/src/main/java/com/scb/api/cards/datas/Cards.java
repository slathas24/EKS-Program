package com.scb.api.cards.datas;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Cards")
public class Cards 
{
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	String cardsid;
	String cardname;
	
	String annualfee;
	String eligibility;
	String cardtype;
 
	public Cards() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cards(String cardsid, String cardname, String annualfee, String eligibility, String cardtype) {
		super();
		this.cardsid = cardsid;
		this.cardname = cardname;
		this.annualfee = annualfee;
		this.eligibility = eligibility;
		this.cardtype = cardtype;
	}

	public String getCardsid() {
		return cardsid;
	}

	public void setCardsid(String cardsid) {
		this.cardsid = cardsid;
	}

	public String getCardname() {
		return cardname;
	}

	public void setCardname(String cardname) {
		this.cardname = cardname;
	}

	public String getAnnualfee() {
		return annualfee;
	}

	public void setAnnualfee(String annualfee) {
		this.annualfee = annualfee;
	}

	public String getEligibility() {
		return eligibility;
	}

	public void setEligibility(String eligibility) {
		this.eligibility = eligibility;
	}

	public String getCardtype() {
		return cardtype;
	}

	public void setCardtype(String cardtype) {
		this.cardtype = cardtype;
	}

	@Override
	public String toString() {
		return "Cards [cardsid=" + cardsid + ", cardname=" + cardname + ", annualfee=" + annualfee + ", eligibility="
				+ eligibility + ", cardtype=" + cardtype + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((annualfee == null) ? 0 : annualfee.hashCode());
		result = prime * result + ((cardname == null) ? 0 : cardname.hashCode());
		result = prime * result + ((cardsid == null) ? 0 : cardsid.hashCode());
		result = prime * result + ((cardtype == null) ? 0 : cardtype.hashCode());
		result = prime * result + ((eligibility == null) ? 0 : eligibility.hashCode());
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
		Cards other = (Cards) obj;
		if (annualfee == null) {
			if (other.annualfee != null)
				return false;
		} else if (!annualfee.equals(other.annualfee))
			return false;
		if (cardname == null) {
			if (other.cardname != null)
				return false;
		} else if (!cardname.equals(other.cardname))
			return false;
		if (cardsid == null) {
			if (other.cardsid != null)
				return false;
		} else if (!cardsid.equals(other.cardsid))
			return false;
		if (cardtype == null) {
			if (other.cardtype != null)
				return false;
		} else if (!cardtype.equals(other.cardtype))
			return false;
		if (eligibility == null) {
			if (other.eligibility != null)
				return false;
		} else if (!eligibility.equals(other.eligibility))
			return false;
		return true;
	}
	
}