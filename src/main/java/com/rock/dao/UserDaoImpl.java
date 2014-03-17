package com.rock.dao;

import org.springframework.stereotype.Component;

@Component
public class UserDaoImpl implements UserDao{
	@Override
	public void save() {
		System.out.println("save a user");
	}

}
