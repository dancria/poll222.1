package com.briup.apps.poll.service;

import java.util.List;

import com.briup.apps.poll.bean.Grade;

public interface IGradeService {
	List<Grade> findAll();
	void deleteById(long id);
	void save(Grade grade);
	void update(Grade grade);

}
