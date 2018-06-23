package com.briup.apps.poll.dao;

import java.util.List;

import com.briup.apps.poll.bean.User;

public interface UserMapper {
	public List<User> findAll();
	void deleteById(Long id);
	void save(User user);
	void update(User user);
	
	
}
 