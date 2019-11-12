package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.assessment6.model.Artist;
import com.example.assessment6.model.Track;

import repository.trackDAL;

@RestController
public class trackcontroller {

	@Autowired
	private trackDAL trarepo;
	
	
	@PostMapping("/tracks")
	public Track create(@RequestBody Track a) {
	trarepo.create(a);
	 System.out.println(a + " insert");
	return a;
	}
	@GetMapping("/tracks")
	public List<Track> find(){
		return trarepo.findAll();
	}
	public trackcontroller() {
		// TODO Auto-generated constructor stub
	}

}
