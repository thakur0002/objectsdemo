package com.example.listofobjects.objectsdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Helloworld {

	@GetMapping(path="/Hello")
	public String Hellow(){
		return "Hello";
	}
}
