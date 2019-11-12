package repository;

import java.util.List;

import com.example.assessment6.model.Album;

public interface albumDAL {
	List<Album> findAll();
	Album create(Album  e);


}
