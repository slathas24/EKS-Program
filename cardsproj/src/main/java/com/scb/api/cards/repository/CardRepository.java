package com.scb.api.cards.repository;

import org.springframework.stereotype.Repository;

import com.scb.api.cards.datas.Cards;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository 
public interface  CardRepository extends CrudRepository<Cards, String>
{
	//@Query
	//public List<Cards> findByCustid(String custid);
}
