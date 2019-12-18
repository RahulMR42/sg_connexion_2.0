package com.codejam.recruiterProject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataStore {
	
	HashMap<Employee,String> emplist1 = new HashMap<Employee,String>();
	
	public void store(Employee e,String s){
	emplist1.put(e, s);
	}
	
	public List getDetails(String s,String r){
		List<Employee> list=new ArrayList<Employee>();
		if(emplist1.containsValue(s)){
			for (Employee e : emplist1.keySet()) {
				if(e.getRole().equals(r)){
					list.add(e);
					
				}
				
			}
			return list;
		}
		return null;
		
	}
}
