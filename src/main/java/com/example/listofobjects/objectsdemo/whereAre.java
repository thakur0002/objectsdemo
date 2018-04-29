package com.example.listofobjects.objectsdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class whereAre {

	pojo aa = new pojo();
	@GetMapping(path="/where")
	public String Where(){
		return"where";
	}
	@GetMapping(path= "/list")
	public pojo listmovie(){
		aa.setId(1);
		aa.setMname("moviee");
		aa.setDirector("rawawr");
		aa.setRating(5);
		
		return aa;
	}
	
}
