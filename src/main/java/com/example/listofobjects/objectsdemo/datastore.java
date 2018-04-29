package com.example.listofobjects.objectsdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import org.springframework.boot.test.autoconfigure.OverrideAutoConfiguration;

@OverrideAutoConfiguration(enabled = false)
public class datastore implements Comparator<pojo> {

	List<pojo> Thak= new ArrayList<>();
	int id;
	String Mname, director;
	int rating;
	public void firstmovie(){
		
		pojo ss = new pojo();
		ss.setId(1);
		ss.setMname("Ajay");
		ss.setDirector("Singh");
		ss.setRating(5);
		Thak.add(ss);
	}

	public List<pojo> getmovie() {
		return Thak;
	}
			/*public void createmovie(int i, String j, String k, int l) {
				pojo a3 = new pojo();
				a3.setId(i);
				a3.setMname(j);
				a3.setDirector(k);
				a3.setRating(l);
				Thak.add(a3);
			}*/
	public void createmovie(pojo a4){
		Thak.add(a4);		
	}

	@Override
	public int compare(pojo a1, pojo a2) {
		return a1.getMname().compareTo(a2.getMname());
	}

	public List<pojo> readmoviebyname() {
		Collections.sort(Thak, new datastore());
				/*for (pojo b : Thak) {
					System.out.println(b.getId() + " " + b.getMname() + " " + b.getDirector() + " " + b.getRating());
				}*/
		return Thak;	
	}

	public List<pojo> readmovie() {
		/*for (pojo b : Thak) {
			System.out.println(b.getId() + " " + b.getMname() + " " + b.getDirector() + " " + b.getRating());
		}*/
		return Thak;
	}

	public List<pojo> readmoviebyid() {
		Collections.sort(Thak, new sortbyid().compare1);
		/*for (pojo b1 : Thak) {
			System.out.println(b1.getId() + " " + b1.getMname() + " " + b1.getDirector() + " " + b1.getRating());
		}*/return Thak;		
	}

	public void deletemovie(int id) {
		for (pojo b : Thak) {
			if (id == b.getId()){
				Thak.remove(b);
				}
		}}}
