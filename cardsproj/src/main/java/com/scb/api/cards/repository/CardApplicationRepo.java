package com.scb.api.cards.repository;
import org.springframework.stereotype.Repository;

import com.scb.api.cards.datas.CardApplication;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository 
public interface CardApplicationRepo extends CrudRepository<CardApplication,String>
{
	
}



 
