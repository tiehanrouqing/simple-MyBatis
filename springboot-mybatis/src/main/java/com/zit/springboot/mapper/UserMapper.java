package com.zit.springboot.mapper;

import java.util.List;

import com.zit.springboot.entity.User;

public interface UserMapper {
	
	/**
	 * 
	 * @return
	 */
	List<User> selectAll();

}
