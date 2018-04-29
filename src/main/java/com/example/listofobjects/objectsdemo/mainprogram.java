package com.example.listofobjects.objectsdemo;
import java.util.List;

import javax.websocket.server.PathParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
 class mainprogram {

	pojo aa = new pojo();
	datastore ds = new datastore();
	@GetMapping(path = "/read2")
	public String read2(){
		
		return "Ajay";
	}
	@GetMapping(path = "/read")
	public List<pojo> read(){
		aa.setId(1);
		aa.setMname("avva");
		aa.setDirector("sdv");
		aa.setRating(5);
		ds.createmovie(aa);
		ds.firstmovie();
		return ds.getmovie();
	}
	
	@GetMapping(path="/delete/{id}")
	public List<pojo> remveajay(@PathVariable("id") int id) { 
		
		ds.deletemovie(id);
		return ds.getmovie();
		}
	
	@GetMapping( path ="/readAsEntered")
//	@Path("/readAsEntered")
	public List<pojo> getAjay() {
		//ds.readmovie();
		return ds.getmovie();
		}
	@GetMapping(path="/readbyname")
	public List<pojo> getmoviebyname() {
		return ds.readmoviebyname();
		}
	@GetMapping(path="/readbyId")
	public List<pojo> getmoviebyid() {
		return ds.readmoviebyid();
		}
	@PostMapping(path="/update")
	
	public pojo cteAjay(pojo aa) {
			/*	int i,l;
				String j,k;
				i = aa.getId();
				j = aa.getMname();
				k = aa.getDirector();
				l = aa.getRating();*/		
		ds.createmovie(aa);
		return aa;
	}
		}
