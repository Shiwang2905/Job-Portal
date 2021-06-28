package com.shiwang.jobportal.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="experience")
public class ProfessionalExperience {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="current_employer")
	private String currentEmployer;
	
	@Column(name="total_work_exp")
	private double totalworkexperience;
	
	@Column(name="role")
	private String role;
	
	public ProfessionalExperience() {
		
	}
	
	public ProfessionalExperience(String currentEmployer, double totalworkexperience, String role) {
		super();
		this.currentEmployer = currentEmployer;
		this.totalworkexperience = totalworkexperience;
		this.role = role;
	}
	
	public String getCurrentEmployer() {
		return currentEmployer;
	}

	public void setCurrentEmployer(String currentEmployer) {
		this.currentEmployer = currentEmployer;
	}

	public double getTotalworkexperience() {
		return totalworkexperience;
	}

	public void setTotalworkexperience(double totalworkexperience) {
		this.totalworkexperience = totalworkexperience;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

}
