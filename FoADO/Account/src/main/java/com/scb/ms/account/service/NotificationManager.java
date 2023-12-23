/*package com.scb.ms.Account.service;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.producer.ProducerConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;

import org.springframework.kafka.support.serializer.JsonSerializer;
import org.apache.kafka.common.serialization.StringSerializer;
import com.scb.ms.Account.dao.AccountStatement;
import org.springframework.stereotype.Service;

@Service
public class NotificationManager 
{
	private AccountStatement actStmnt;
	@Value("${spring.kafka.bootstrap-servers}")
	String bootstrapservers;
	
	@Autowired 
	private KafkaTemplate<String,AccountStatement> kafkatemplate; 
	@Value("${mytopic.name}")
	String kafkatopic;
	
   public void setMessage(AccountStatement actStmnt)
   {
	   this.actStmnt=actStmnt;
   }
   
   public void dispatchStatement()
   {
   kafkatemplate.send(kafkatopic,actStmnt);
	  System.out.println("created");
   }
   @Bean
   public ProducerFactory<String, AccountStatement> producerFactory() 
    {
 	  System.out.println(bootstrapservers);
   	      Map<String, Object> configProps = new HashMap<>();
   	      configProps.put(JsonSerializer.ADD_TYPE_INFO_HEADERS,false);
   	      configProps.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG,bootstrapservers);
   	      configProps.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
   	      configProps.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class);
   	      return new DefaultKafkaProducerFactory<>(configProps);
    }
    @Bean
      public KafkaTemplate<String,AccountStatement> kafkaTemplate() {
   	      return new KafkaTemplate<>(producerFactory());
   	   }
}
*/
