package com.xml2j.mongo.sequence;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Counters")
public class Sequence {
  @Id 
  private String id;
  private long sequence;
  
  public Sequence(String id, long sequence) {
	  this.id = id;
	  this.sequence = sequence;
  }
  
  public long getSequence() {
	  return sequence;
  }
  
  public void setSequence(long sequence) {
	  this.sequence = sequence;
  }
}