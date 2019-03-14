package com.hotel.DAO;

import java.util.List;

import com.hotel.model.User;

public interface UserDao {
	
	public void add(User user);
	public void remove(String id);
	public User viewUser(String id);
	public List<User> viewAll();
	public void update(String id);
}
