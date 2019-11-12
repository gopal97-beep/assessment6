package controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.assessment6.model.Album;

import repository.albumDAL;
import repository.trackDAL;


@RestController
public class albumcontroller {

	

	@Autowired
	private albumDAL alrepo;
	
	
	@PostMapping("/albums")
	public Album create(@RequestBody Album a) {
	alrepo.create(a);
	 System.out.println(a + " insert");
	return a;
	}
	@GetMapping("/albums")
	public List<Album> find(){
		return alrepo.findAll();
	}
	public albumcontroller() {
		// TODO Auto-generated constructor stub
	}

}
