package com.hotel.Service.Implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hotel.Service.UserService;
import com.hotel.DAO.UserDao;
import com.hotel.model.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Transactional
	public void add(User user) {
		userDao.add(user);
	}

	@Transactional
	public void remove(String id) {
		userDao.remove(id);
	}

	@Transactional
	public User viewUser(String id) {

		return userDao.viewUser(id);
	}

	@Transactional
	public List<User> viewAll() {

		return userDao.viewAll();
	}

	@Transactional
	public void update(String id) {
		userDao.update(id);
	}
}
