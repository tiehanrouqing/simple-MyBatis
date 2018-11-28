package com.zit.springboot.service;

import java.util.List;

import com.zit.springboot.entity.User;

public interface UserService {
	
	/**
	 * 查询全部用户
	 * @return
	 */
	List<User> findAll();

}
