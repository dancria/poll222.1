package com.briup.apps.poll.service;

import java.util.List;

import com.briup.apps.poll.bean.Course;

public interface ICourseService {

	List<Course> findAll();
	void deleteById(long id);
	void save(Course course);//这个Course 是什么意思
	void update(Course course);
}
