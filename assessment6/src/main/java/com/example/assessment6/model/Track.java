package com.example.assessment6.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value="tracks")
public class Track {

	@Id
	private String id;
	private String trackname;
 
	@DBRef
 List<Artist> artists;
	
	
	
	
	



	public Track(String id, String trackname,List<Artist> artists) {
		super();
		this.id = id;
		this.trackname = trackname;
		this.artists = artists;
	}







	public List<Artist> getArtists() {
		return artists;
	}







	public void setArtists(List<Artist> artists) {
		this.artists = artists;
	}







	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getTrackname() {
		return trackname;
	}



	public void setTrackname(String trackname) {
		this.trackname = trackname;
	}



	public Track() {
		// TODO Auto-generated constructor stub
	}

}
