package com.sy.dao;

import org.apache.ibatis.annotations.Param;

import com.sy.entity.User;

public interface UserDao {
	
	
	/**
	 * 鏌ユ壘鐢ㄦ埛鍚嶅拰瀵嗙爜
	 * @param username 鐧诲綍鐢ㄦ埛鍚� 
	 * @param password 瀵嗙爜
	 * @return
	 */
	User findByUsername(String username);

	
	/**
	 * 娉ㄥ唽鐢ㄦ埛鍜屽瘑鐮�
	 * @param username 鐢ㄦ埛鍚�
	 * @param password 瀵嗙爜
	 * @return
	 */
	void registerByUsernameAndPassword(@Param("username")String username,
										@Param("password")String password);
}
