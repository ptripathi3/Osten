package com.hotel.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="HOTEL_ROOM")
public class HotelRoom {
	
	@Id
	private int roomId;
	@Column
	private int hotid;
	@Column
	private String roomType;
	@Column
	private int number;
	@Column
	private float price;
	
	
	

	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	public int getRoomId() {
		return roomId;
	}
	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}
	public int getHotid() {
		return hotid;
	}
	public void setHotid(int hotid) {
		this.hotid = hotid;
	}

	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	
}
