package com.sy.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sy.dao.UserDao;
import com.sy.entity.User;
import com.sy.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;
	
	/* 
	 * 妫�楠岀敤鎴风櫥褰曚笟鍔�
	 * 
	 */
	public User checkLogin(String username, String password) {
		
		User user = userDao.findByUsername(username);
		if(user != null && user.getPassword().equals(password)){
		
			return user;
		}
		return null;
	}
	
	@Override
	public void Regist(User user){
		 userDao.registerByUsernameAndPassword(user.getUsername(),user.getPassword());
	}
}