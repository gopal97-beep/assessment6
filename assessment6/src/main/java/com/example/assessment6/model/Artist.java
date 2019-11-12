package com.example.assessment6.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(value="artists")
public class Artist {
   @Id 
   private String id;
   private String name;
  
   
   
   


	public Artist(String id, String name) {
	super();
	this.id = id;
	this.name = name;
	
}










	public String getId() {
	return id;
}


public void setId(String id) {
	this.id = id;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


	@Override
public String toString() {
	return "Artist [id=" + id + ", name=" + name + "]";
}


	public Artist() {
		// TODO Auto-generated constructor stub
	}

}
