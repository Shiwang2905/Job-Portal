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
@Table(name="address")
public class Address {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Pattern(regexp="^[a-zA-Z0-9]*$", message="only alphabets")
	@NotNull(message = "only aplphabets")
	@Column(name="street_name")
	private String streetName;
	
	@Pattern(regexp="^[a-zA-Z]*$", message="only alphabets")
	@NotNull(message = "enter city")
	@Column(name="city")
	private String city;
	
	@Pattern(regexp="^[a-zA-Z]*$", message="only alphabets")
	@NotNull(message = "enter state")
	@Column(name="state")
	private String state;
	
	@Pattern(regexp="^[a-zA-Z]*$", message="only alphabets")
	@NotNull(message = "enter country")
	@Column(name="country")
	private String country;
	
	@Pattern(regexp="^[0-9]*$", message="only numbers")
	@NotNull(message = "enter pincode")
	@Size(min=6, message="only 6 digits")
	@Column(name="pincode")
	private String pincode;
	
	public Address() {
		
	}
	
	public Address(String streetName, String city, String state, String country, String pincode) {
		super();
		this.streetName = streetName;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
	}


	public String getStreetName() {
		return streetName;
	}


	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
}
