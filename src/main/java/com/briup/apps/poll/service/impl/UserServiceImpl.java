package com.briup.apps.poll.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.apps.poll.bean.User;
import com.briup.apps.poll.dao.UserMapper;
import com.briup.apps.poll.service.IUserService;
@Service//加了才能找到这个Service
public class UserServiceImpl implements IUserService{
	@Autowired
	private UserMapper userMapper;

	@Override
	public List<User> findAll() {		
		return userMapper.findAll();
	}
	

}
