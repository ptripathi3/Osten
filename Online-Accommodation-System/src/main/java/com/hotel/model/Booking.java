package com.hotel.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.joda.time.LocalDate;

enum RoomType {
	SAC, SNAC, DAC, DNAC
}

@Entity
@Table(name = "Booking")
public class Booking {

	@Id
	@Column(columnDefinition = "varchar(10)")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String bookingId;
	@Column(columnDefinition = "varchar(10)")
	private String hhpId;
	@Column(columnDefinition = "varchar(10)")
	private int userid;
	@Column(columnDefinition = "varchar(10)")
	private int no_of_adults;
	@Column(columnDefinition = "varchar(30)")
	private LocalDate CIND;
	@Column(columnDefinition = "varchar(30)")
	private LocalDate COTD;
	@Column(columnDefinition = "varchar(10)")
	private int no_Of_Rooms;
	@Column(columnDefinition = "varchar(10)")
	private RoomType roomType;

	public int getNo_of_adults() {
		return no_of_adults;
	}

	public void setNo_of_adults(int no_of_adults) {
		this.no_of_adults = no_of_adults;
	}

	public int getNo_Of_Rooms() {
		return no_Of_Rooms;
	}

	public void setNo_Of_Rooms(int no_Of_Rooms) {
		this.no_Of_Rooms = no_Of_Rooms;
	}

	public RoomType getRoomType() {
		return roomType;
	}

	public void setRoomType(RoomType roomType) {
		this.roomType = roomType;
	}

	public String getBookingId() {
		return bookingId;
	}

	public void setBookingId(String bookingId) {
		this.bookingId = bookingId;
	}

	public String getHhpId() {
		return hhpId;
	}

	public void setHhpId(String hhpId) {
		this.hhpId = hhpId;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public LocalDate getCIND() {
		return CIND;
	}

	public void setCIND(LocalDate cIND) {
		CIND = cIND;
	}

	public LocalDate getCOTD() {
		return COTD;
	}

	public void setCOTD(LocalDate cOTD) {
		COTD = cOTD;
	}

}
