package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.assessment6.model.Artist;

import repository.artistDAL;

@RestController
public class artistcontroller {

	
	@Autowired
	private artistDAL artrepo;
	
	@PostMapping("/artists")
	public Artist create(@RequestBody Artist a) {
	artrepo.create(a);
	 System.out.println(a + " insert");
	return a;
	}
	@GetMapping("/artists")
	public List<Artist> find(){
		return artrepo.findAll();
	}
	
	public artistcontroller() {
		// TODO Auto-generated constructor stub
	}

}
