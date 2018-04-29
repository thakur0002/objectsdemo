package com.example.listofobjects.objectsdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class sortbyid {
	List<pojo> Thak = new ArrayList<>();

	public static Comparator<pojo> compare1 = new Comparator<pojo>() {

		public int compare(pojo s1, pojo s2) {

			int rollno1 = s1.getId();
			int rollno2 = s2.getId();

			/* For ascending order */
			return rollno1 - rollno2;

			/* For descending order */
			// rollno2-rollno1;
		}
	};
}
