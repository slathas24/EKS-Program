package com.scb.api.cards.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.scb.api.cards.datas.CardApplication;
import com.scb.api.cards.datas.Cards;
import com.scb.api.cards.datas.CustCards;
import com.scb.api.cards.service.CardService;


@RestController
public class CardsController {

	@Autowired
	CardService cardservice;
    // To List al cards available in Bank
    @GetMapping("")
    
	 public ResponseEntity<List<Cards>> getAllCards()
	 {
		 return new ResponseEntity<>(cardservice.getAllCards(),HttpStatus.OK);
	 }
    // To List all cards for customer id 
   @GetMapping(" ")
   public ResponseEntity<List<CustCards>> getCards(@PathVariable String custid)
   {
	   return new ResponseEntity<>(cardservice.getCards(custid),HttpStatus.OK);
   }
}
/*
 
    @PostMapping(path = "/cards/application") //, consumes = "application/json", produces = "application/json")
	public ResponseEntity<Object> addCardApplicationr(@RequestBody CardApplication cardapplication)
	   {
	  // return new ResponseEntity<>(cardservice.addCardApplication(cardapplication),HttpStatus.CREATED);
	   }
   }
	
*/
