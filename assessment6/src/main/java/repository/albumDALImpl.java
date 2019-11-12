package repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import com.example.assessment6.model.Album;
import com.example.assessment6.model.Track;

@Repository
public class albumDALImpl implements albumDAL {

	@Autowired
	private MongoTemplate mongo;
	
	
	@Override
	public List<Album> findAll() {
		return mongo.findAll(Album.class);
	}

	@Override
	public Album create(Album e) {
		return mongo.save(e);
	}
	
	public albumDALImpl() {
		// TODO Auto-generated constructor stub
	}

}
