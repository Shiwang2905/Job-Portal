package com.shiwang.jobportal.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="education")
public class Education {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="university")
	private String universityName;
	
	@Column(name="stream")
	private String stream;
	
	@Column(name="score")
	private int scoreInPercentage;
	
	@Column(name="year")
	private int passingYear;
	
	public Education() {
		
	}
	
	public Education(String universityName, String stream, int scoreInPercentage, int passingYear) {
		super();
		this.universityName = universityName;
		this.stream = stream;
		this.scoreInPercentage = scoreInPercentage;
		this.passingYear = passingYear;
	}
	
	public String getUniversityName() {
		return universityName;
	}
	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}
	public String getStream() {
		return stream;
	}
	public void setStream(String stream) {
		this.stream = stream;
	}
	public int getScoreInPercentage() {
		return scoreInPercentage;
	}
	public void setScoreInPercentage(int scoreInPercentage) {
		this.scoreInPercentage = scoreInPercentage;
	}
	public int getPassingYear() {
		return passingYear;
	}
	public void setPassingYear(int passingYear) {
		this.passingYear = passingYear;
	}
}
