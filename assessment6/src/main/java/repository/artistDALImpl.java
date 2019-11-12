package repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import com.example.assessment6.model.Artist;



@Repository
public class artistDALImpl implements artistDAL {
	@Autowired 
	 private MongoTemplate mongo;
	
	@Override
	public List<Artist> findAll() {
		return mongo.findAll(Artist.class);
	}

	@Override
	public Artist create(Artist e) {
		return mongo.save(e);
	}
	public artistDALImpl() {
		// TODO Auto-generated constructor stub
	}

}
