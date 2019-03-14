package com.hotel.DAO.Implementation;
import java.util.List;

import javax.persistence.criteria.Root;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.hibernate.query.criteria.internal.CriteriaBuilderImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hotel.DAO.BookingDao;
import com.hotel.model.Booking;


	@Repository
	public class BookingDaoImpl implements BookingDao {
		@Autowired
		private SessionFactory sessionFactory;

		@Override
		public void add(Booking booking) {
			
			
		}

		
		
			
		}


