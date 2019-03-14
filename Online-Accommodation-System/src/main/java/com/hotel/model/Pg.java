package com.hotel.model;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Pg")
public class Pg {
	@Id
	private String pgid;
	@NotNull
	private String pgname;
	@NotNull
	private int nor;
	@NotNull
	boolean parking;
	@NotNull
	private String furnishing;
	@NotNull
	boolean meal;
	public String getPgid() {
		return pgid;
	}
	public void setPgid(String pgid) {
		this.pgid = pgid;
	}
	public String getPgname() {
		return pgname;
	}
	public void setPgname(String pgname) {
		this.pgname = pgname;
	}
	public int getNor() {
		return nor;
	}
	public void setNor(int nor) {
		this.nor = nor;
	}
	public boolean isParking() {
		return parking;
	}
	public void setParking(boolean parking) {
		this.parking = parking;
	}
	public String getFurnishing() {
		return furnishing;
	}
	public void setFurnishing(String furnishing) {
		this.furnishing = furnishing;
	}
	public boolean isMeal() {
		return meal;
	}
	public void setMeal(boolean meal) {
		this.meal = meal;
	}
}
