package com.hotel.Service.Implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hotel.DAO.BookingDao;
import com.hotel.Service.BookingService;
import com.hotel.model.Booking;

@Service
@Transactional
public class BookingServiceImpl implements BookingService{

	
	@Autowired
	private BookingDao bookingDao;
	
	
	
	@Override
	public void add(Booking booking) {
		// TODO Auto-generated method stub
		
	}
}
