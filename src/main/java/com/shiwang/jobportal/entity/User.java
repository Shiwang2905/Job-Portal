package com.shiwang.jobportal.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;



@Entity
@Table(name="user")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Pattern(regexp="^[a-zA-Z]*$", message="only alphabets")
	@NotNull(message = "atleast one character")
	@Size(min = 1, message = "atleast one character")
	@Column(name="first_name")
	private String firstName;
	
	@Pattern(regexp="^[a-zA-Z]*$", message="Only alphabets")
	@Column(name="last_name")
	private String lastName;
	

	@Pattern(regexp="^[0-9]*$", message="only numbers")
	@NotNull(message = "only numbers")
	@Size(min = 10, message = "10 digits")
	@Column(name="contact")
	private String contactNumber;
	
	private String gender;
	
	@Pattern(regexp="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@])(?=*\\S+$)$", message="only numbers")
	@NotNull(message = "Enter your email")
	@Size(min = 6, message = "invalid email")
	@Column(name="email")
	private String email;
	
//	@Pattern(regexp="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\\\S+$).{8, 20}$")
//	@NotNull(message = "enter your email")
//	@Size(min = 8, message = "Must contain one lowercase, one uppercase and a special character character")
//	@Column(name="password")
//	private String password;
	
	@Column(name="skills")
	private String skills;
	
	@Column(name="current_employer")
	private String currentEmployer;
	
	@Column(name="experience")
	private String workexperience;
	
	@Column(name="current_ctc")
	private String currentCTC;
	
	@Column(name="epxpected_ctc")
	private String expectedCTC;
	
	
	public User() {
		
	}
	
	
	
	public User(String firstName, String lastName, String contactNumber, String gender, String email, String skills,
			String currentEmployer, String workexperience, String currentCTC, String expectedCTC) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.contactNumber = contactNumber;
		this.gender = gender;
		this.email = email;
		this.skills = skills;
		this.currentEmployer = currentEmployer;
		this.workexperience = workexperience;
		this.currentCTC = currentCTC;
		this.expectedCTC = expectedCTC;
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	public String getCurrentEmployer() {
		return currentEmployer;
	}

	public void setCurrentEmployer(String currentEmployer) {
		this.currentEmployer = currentEmployer;
	}

	public String getWorkexperience() {
		return workexperience;
	}

	public void setWorkexperience(String workexperience) {
		this.workexperience = workexperience;
	}

	public String getCurrentCTC() {
		return currentCTC;
	}

	public void setCurrentCTC(String currentCTC) {
		this.currentCTC = currentCTC;
	}

	public String getExpectedCTC() {
		return expectedCTC;
	}

	public void setExpectedCTC(String expectedCTC) {
		this.expectedCTC = expectedCTC;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

}
