package repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import com.example.assessment6.model.Track;

@Repository
public class trackDALImpl implements trackDAL {

	
	@Autowired
	private MongoTemplate mongo;
	
	
	@Override
	public List<Track> findAll() {
		return mongo.findAll(Track.class);
	}

	@Override
	public Track create(Track e) {
		return mongo.save(e);
	}
	public trackDALImpl() {
		// TODO Auto-generated constructor stub
	}

}
