package com.briup.apps.poll.dao;

import java.util.List;

import com.briup.apps.poll.bean.Course;

public interface CourseMapper {
//查询所以课程信息，并且将所有课程信息封装到同一个LIST接口集合中
	//@Select("select * from poll_course")//写法1.写法2是配置xml
	public List<Course> findAll();
	void deleteById(Long id);//通过id是基本数据类型
	void save(Course course);
	void update(Course course);//引用数据类型，用Course包含所用数据
}
