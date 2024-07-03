package com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	private int id;
	private String name;
	private String profile;
	private String email;
	private double salary;
	private int age;
	private int experience;
	private String branch_location;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public Employee(int id, String name, String profile, String email, double salary, int age, int experience,
			String branch_location) {
		super();
		this.id = id;
		this.name = name;
		this.profile = profile;
		this.email = email;
		this.salary = salary;
		this.age = age;
		this.experience = experience;
		this.branch_location = branch_location;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public String getBranch_location() {
		return branch_location;
	}

	public void setBranch_location(String branch_location) {
		this.branch_location = branch_location;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", profile=" + profile + ", email=" + email + ", salary="
				+ salary + ", age=" + age + ", experience=" + experience + ", branch_location=" + branch_location + "]";
	}
	
	
	
}
