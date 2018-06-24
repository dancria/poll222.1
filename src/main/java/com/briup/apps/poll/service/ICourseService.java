package com.briup.apps.poll.service;

import java.util.List;

import com.briup.apps.poll.bean.Course;

public interface ICourseService {

	List<Course> findAll();
	void deleteById(long id);//大小写不一样为什么不影响；long与Long????
	void save(Course course);//这个Course 是什么意思-是一个集合命名为Course
	void update(Course course);
}
