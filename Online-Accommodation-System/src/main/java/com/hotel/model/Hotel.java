package com.hotel.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "HOTEL")
public class Hotel {

	@Id
	@Column(columnDefinition="varchar(10)")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String hid;
	@NotNull
	@Column(columnDefinition="varchar(10)")
	private String hname;
	@NotNull
	@Column(columnDefinition="varchar(10)")
	private String rating;
	@NotNull
	private double dfcc;
	@NotNull
	private boolean gym;
	@NotNull
	private boolean Sp;
	@NotNull
	private boolean Spa;
	@NotNull
	private boolean lounge;
	@NotNull
	private boolean restaurant;
	@NotNull
	private boolean WiFi;
	@OneToOne
	@JoinColumn(name = "aid")
	private Address add;
	
	public String getHid() {
		return hid;
	}
	public void setHid(String hid) {
		this.hid = hid;
	}
	public String getHname() {
		return hname;
	}
	public void setHname(String hname) {
		this.hname = hname;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public double getDfcc() {
		return dfcc;
	}
	public void setDfcc(double dfcc) {
		this.dfcc = dfcc;
	}
	public boolean isGym() {
		return gym;
	}
	public void setGym(boolean gym) {
		this.gym = gym;
	}
	public boolean isSp() {
		return Sp;
	}
	public void setSp(boolean sp) {
		Sp = sp;
	}
	public boolean isSpa() {
		return Spa;
	}
	public void setSpa(boolean spa) {
		Spa = spa;
	}
	public boolean isLounge() {
		return lounge;
	}
	public void setLounge(boolean lounge) {
		this.lounge = lounge;
	}
	public boolean isRestaurant() {
		return restaurant;
	}
	public void setRestaurant(boolean restaurant) {
		this.restaurant = restaurant;
	}
	public boolean isWiFi() {
		return WiFi;
	}
	public void setWiFi(boolean wiFi) {
		WiFi = wiFi;
	}
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		this.add = add;
	}

}
