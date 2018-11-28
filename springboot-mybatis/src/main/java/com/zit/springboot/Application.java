package com.zit.springboot;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.zit.springboot.entity.User;
import com.zit.springboot.mapper.UserMapper;

@SpringBootApplication
@MapperScan({"com.zit.springboot.mapper"})
public class Application implements CommandLineRunner {
	@Autowired
	private UserMapper userMapper;
	
	public static void main(String[] args) {
		
		SpringApplication.run(Application.class, args);
		
	}
	
	@Override
	public void run(String... args) throws Exception {
		
		List<User> userList = userMapper.selectAll();
		
		for (User user : userList) {
			
			System.out.println("用户名："+user.getName());
			
		}
	}

}
