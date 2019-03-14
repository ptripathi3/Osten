package com.hotel.DAO.Implementation;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hotel.DAO.AddressDao;
import com.hotel.model.Address;
import com.hotel.model.Hotel;

@Repository
public class AddressDaoImpl implements AddressDao{

	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void add(Address address) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(Address address) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Address search(Address address) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Address view(String id) {
		// TODO Auto-generated method stub
		
		
		
		return null;
	}	



	@Override
	public List<Address> viewAll() {
		// TODO Auto-generated method stub
		return null;
	}
	


	@Override
	public List<Integer> searchByCity(String city) {
		// TODO Auto-generated method stub
		
				Session session = sessionFactory.getCurrentSession();
				
				//HQL example - Get All Employees;
				
				String c;
				c=city.toLowerCase().trim();
				String query1="from hotel h where h.aid in (select  a.aid from address a where city='"+c+"')";
				@SuppressWarnings("unchecked")
				Query<String> query = session.createSQLQuery(query1);
				//query.setParameter("ct",c);
				List<String> empList = query.list();
				if(empList==null)
					
					System.out.println(empList.get(0));
				return null;
	}

}
