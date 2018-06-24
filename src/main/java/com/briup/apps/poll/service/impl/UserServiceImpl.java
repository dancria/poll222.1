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
	//应该自动添加，但是我的出不来。。。。自动又出来了，12行出错，点击出来的

	@Override
	public List<User> findAll() {		
		return userMapper.findAll();
	}

	@Override
	public void deleteById(long id) {
		// TODO Auto-generated method stub
		userMapper.deleteById(id);
	}

	@Override
	public void save(User user) {
		// TODO Auto-generated method stub
		userMapper.save(user);
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		userMapper.update(user);
	}
	

	

}
