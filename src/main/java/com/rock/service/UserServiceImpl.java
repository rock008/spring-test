package com.rock.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rock.dao.UserDao;

@Service("userService")
public class UserServiceImpl implements UserService{

	@Autowired
	UserDao userDao;
	
	@Override
	public void save() {
		 
		userDao.save();
	}

	
}
