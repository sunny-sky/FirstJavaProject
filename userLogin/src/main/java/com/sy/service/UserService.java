package com.sy.service;


import com.sy.entity.User;

//Service灞傛帴鍙�
public interface UserService {
	
	//妫�楠岀敤鎴风櫥褰�
	User checkLogin(String username,String password);
	void Regist(User user);

}
