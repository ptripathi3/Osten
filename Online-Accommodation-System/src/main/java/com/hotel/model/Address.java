package com.hotel.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="Address")
public class Address {

	@Id
	@Column(columnDefinition="varchar(10)")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int aid;
	@NotNull
	@Column(columnDefinition="varchar(10)")
	private String address1;
	@NotNull
	@Column(columnDefinition="varchar(10)")
	private String landmark;
	@NotNull
	private int zipcode;
	@NotNull
	@Column(columnDefinition="varchar(10)")
	private String city;
	@NotNull
	@Column(columnDefinition="varchar(10)")
	private String state;
	
	
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	
	public String getLandmark() {
		return landmark;
	}
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	public int getZipcode() {
		return zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
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
	
	@Override
	public String toString() {
		return "Address [aid=" + aid + ", address1=" + address1 + ", landmark=" + landmark + ", zipcode=" + zipcode
				+ ", city=" + city + ", state=" + state + "]";
	}
	
}
