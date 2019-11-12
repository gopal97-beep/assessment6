package repository;

import java.util.List;

import com.example.assessment6.model.Artist;


public interface artistDAL {

	List<Artist> findAll();
	Artist create( Artist e);

	
}
