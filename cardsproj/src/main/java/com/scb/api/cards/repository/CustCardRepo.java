package com.scb.api.cards.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.scb.api.cards.datas.CustCards;

@Repository 
public interface CustCardRepo extends CrudRepository<CustCards,String>
{
   @Query
   public List<CustCards> findByCustid(String custid);
}
