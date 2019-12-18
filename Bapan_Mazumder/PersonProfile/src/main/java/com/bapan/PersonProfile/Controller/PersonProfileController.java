package com.bapan.PersonProfile.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bapan.PersonProfile.Model.PersonProfile;

@RestController
public class PersonProfileController {
	
	@Autowired
	PersonProfile personProfile;
	
	@GetMapping(value="/personProfile", produces = "application/json")
	public void getPersonProfiles(){
		
 //to call the persistance method - FindAll()
		
	}
	
	@PostMapping(value="/insert/{}",consumes = "application/json")
	public List<String> insertPersonProfiles(){
		
		return null;
		
	}

}
