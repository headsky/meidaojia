package com.hs.service;

import java.util.List;

import com.hs.Application;
import com.hs.dao.UserDao;
import com.hs.dao.UserDaoImpl;
import com.hs.model.User;

public class UserService {
	
	private UserDao userDao;
	public void UserService(){
		userDao = new UserDao();
	}

	public void insertUser(User user) {
		//userDao.insertUser(user);
		//userDao.updateUser(user);
		UserDaoImpl udi = (UserDaoImpl)Application.getBean("userDao");
		udi.insertUser("12");
		throw new RuntimeException("Manul exception!");
	}
	
	public List<User> getUser(){
		//return userDao.getUser();
		return null;
	}
}
