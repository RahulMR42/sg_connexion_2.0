package com.codejam.recruiterProject;

import java.util.List;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		//Employee e1=new Employee("naveen","developer","xyz","2.5years");
		//Employee e2=new Employee("praveen", "tester", "abc", "3years");
		//Employee e3=new Employee("sameer","developer","xyz","3years");
		
		Scanner sc=new Scanner(System.in);
		DataStore ds=new DataStore();
		System.out.println("how many employee details you want to enter");
		int no=sc.nextInt();
		for (int i = 0; i < no; i++) {
			
		System.err.println("please enter the employee details:");
		System.out.println("-------------------------------------");
		System.out.println("please enter the employee name:");
		String name=sc.next();
		System.out.println("please enter the employee role:");
		String role=sc.next();
		System.out.println("please enter the employee company:");
		String company=sc.next();
		System.out.println("please enter the employee experience years:");
		String years=sc.next();
		Employee e1=new Employee(name,role,company,years);
		System.out.println("enter the key for the employee");
		String n=sc.next();
		ds.store(e1,"1");
		
		}
	
		
		List l=ds.getDetails("1", "dev");
		if(l!=null){
			System.out.println(l);
		}
		else
		{
			System.err.print("there is no as such employee details");
		}
		
	}

}
