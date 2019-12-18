package com.codejam.recruiterProject;

public class Employee {
	private String name;
	private String role;
	private String curEmployer;
	private String experience;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getCurEmployer() {
		return curEmployer;
	}
	public void setCurEmployer(String curEmployer) {
		this.curEmployer = curEmployer;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	
	
	
	public Employee(String name, String role, String curEmployer, String experience) {
		super();
		this.name = name;
		this.role = role;
		this.curEmployer = curEmployer;
		this.experience = experience;
	}
	@Override
	public String toString() {
		return "Employee Details is "+ "name=" + name + ", role=" + role + ", curEmployer=" + curEmployer + ", experience="
				+ experience ;
	}
	
	

}
