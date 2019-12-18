package com.bapan.PersonProfile.Model;

import javax.persistence.Entity;

@Entity
public class PersonProfile {
	
	private String firstName;
	private String lastName;
	private String emailId;
	private double yearOfExperience;
	private String location;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public double getYearOfExperience() {
		return yearOfExperience;
	}
	public void setYearOfExperience(double yearOfExperience) {
		this.yearOfExperience = yearOfExperience;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	public String toString() {
		return firstName+ lastName+emailId+location+yearOfExperience;
		
	}

}
