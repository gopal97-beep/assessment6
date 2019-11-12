package repository;

import java.util.List;

import com.example.assessment6.model.Track;

public interface trackDAL {

	List<Track> findAll();
	Track create( Track e);
}
