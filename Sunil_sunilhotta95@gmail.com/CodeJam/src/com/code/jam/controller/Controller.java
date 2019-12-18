package com.code.jam.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import com.code.jam.model.Model;

public class Controller{
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static List<Model> list=new ArrayList<Model>();


	public static void main(String[] args) throws IOException {
		int key=0;
		do{
		System.out.println("1. Add \n2. Search \n3. exit");
		key=Integer.parseInt(br.readLine());
		switch(key){
		case 1: Controller.add();
				break;
		case 2: Controller.search();
				break;
		case 3:	System.out.println("Thank you");
		 		break;
		default: System.out.println("Sorry, please enter valid choice");
		}
		}while(key!=3);
		
		
	}

	private static void search() throws IOException {
		System.out.println("Enter Skill set");
		String s=br.readLine();
		for (Model model : list) {
			if(s.equalsIgnoreCase(model.getSkill())){
				System.out.println(model);
			}
		}
		
	}

	private static void add() throws IOException {
		Model m=new Model();
		System.out.println("Enter name: ");
		m.setName(br.readLine());
		System.out.println("Enter Skill: ");
		m.setSkill(br.readLine());
		System.out.println("Enter YOE: ");
		m.setYoe(Float.parseFloat(br.readLine()));
		list.add(m);
		
	}
}
