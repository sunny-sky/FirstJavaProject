package com.sy.service;


import com.sy.entity.User;

//Service鐏炲倹甯撮崣锟�
public interface UserService {
	
	//濡拷妤犲瞼鏁ら幋椋庢瑜帮拷
	User checkLogin(String username,String password);
	boolean Regist(User user);

}
