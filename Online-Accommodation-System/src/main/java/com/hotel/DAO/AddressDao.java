package com.hotel.DAO;

import java.util.List;

import com.hotel.model.Address;

public interface AddressDao {
	public void add(Address address);

	public void remove(String id);

	public void remove(Address address);

	public Address search(Address address);

	public Address view(String id);

	public List<Address> viewAll();
	 
	public List<Integer> searchByCity(String city);
}
