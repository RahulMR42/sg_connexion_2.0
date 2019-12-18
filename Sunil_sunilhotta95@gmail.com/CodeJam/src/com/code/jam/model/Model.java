package com.code.jam.model;

public class Model {
	private String name;
	private float yoe;
	private String skill;
	public String getName() {
		return name;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getYoe() {
		return yoe;
	}
	public void setYoe(float yoe) {
		this.yoe = yoe;
	}
	public Model(String name, float yoe, String skill) {
		super();
		this.name = name;
		this.yoe = yoe;
		this.skill=skill;
	}
	public Model() {
		super();
	}
	@Override
	public String toString() {
		return "Model [name=" + name + ", yoe=" + yoe + ", skill=" + skill + "]";
	}
}
