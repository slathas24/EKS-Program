package com.scb.api.cards.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.scb.api.cards.datas.Cards;
import com.scb.api.cards.datas.CustCards;
import com.scb.api.cards.repository.CardRepository;
import com.scb.api.cards.repository.CustCardRepo;

@Service
public class CardService 
{
	@Autowired
	CardRepository cardrepo;
	@Autowired
	CustCardRepo custcardrepo;
	public List<Cards> getAllCards()
	{
		List <Cards> ls;
		Iterable <Cards> it=cardrepo.findAll();
		 ls = new ArrayList<Cards>();
        it.forEach(e -> ls.add(e));

        return ls;
		
	}
	public List<CustCards> getCards(String custid)
	{
		List <CustCards> ls;
		Iterable <CustCards> it=custcardrepo.findByCustid(custid);
		 ls = new ArrayList<CustCards>();
		 System.out.println(ls.size());
        it.forEach(e -> ls.add(e));

        return ls;
		
	}
}
