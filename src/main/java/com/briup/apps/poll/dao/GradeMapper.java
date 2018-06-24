package com.briup.apps.poll.dao;

import java.util.List;

import com.briup.apps.poll.bean.Grade;

public interface GradeMapper {
	public List<Grade> findAll();
	void deleteById(Long id);
	void save(Grade grade);
	void update(Grade grade);

}
