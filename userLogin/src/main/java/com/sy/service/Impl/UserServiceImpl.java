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
	 * 濡拷妤犲瞼鏁ら幋椋庢瑜版洑绗熼崝锟�
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
	public boolean Regist(User user){
//		try {
//			userDao.registerByUsernameAndPassword(user.getUsername(),user.getPassword());
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
////		User user1 = userDao.findByUsername(user.getUsername());
////		if(user1==null){
////			userDao.registerByUsernameAndPassword(user.getUsername(),user.getPassword());
////		}
////		else{
////			return null;
////		}
//}

		User user1 = userDao.findByUsername(user.getUsername());
		if(user1==null){
			userDao.registerByUsernameAndPassword(user.getUsername(),user.getPassword());
			return true;
		}
		else{
			return false;
		}
	}
}
