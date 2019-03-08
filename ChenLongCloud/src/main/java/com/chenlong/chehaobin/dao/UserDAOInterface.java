package com.chenlong.chehaobin.dao;

import com.chenlong.entity.User;

public interface UserDAOInterface  {

	public boolean insertUser(User user);
	public boolean delectUser(User user);
	public User selectUser(User user);
	
	
}
