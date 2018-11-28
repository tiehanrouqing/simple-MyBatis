package com.zit.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zit.springboot.entity.User;
import com.zit.springboot.mapper.UserMapper;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private  UserMapper userMapper;
	
	@Override
	public List<User> findAll() {
		return userMapper.selectAll();
	}

}
