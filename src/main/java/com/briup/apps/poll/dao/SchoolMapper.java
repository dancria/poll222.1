package com.briup.apps.poll.dao;

import java.util.List;

import com.briup.apps.poll.bean.School;

public interface SchoolMapper {
	public List<School> findAll();
	void deleteById(Long id);
	void save(School school);
	void update(School school);
	

}
