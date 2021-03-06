package com.briup.apps.poll.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.apps.poll.bean.Course;
import com.briup.apps.poll.dao.CourseMapper;
import com.briup.apps.poll.service.ICourseService;
@Service
//自动添加方法：
//创建一个类后，先写上接口，然后接口提示导入未知方法即可。
public class CourseServiceImpl implements ICourseService{
	@Autowired
	private CourseMapper courseMapper;

	@Override
	public List<Course> findAll() {
		// TODO Auto-generated method stub
		return courseMapper.findAll();
		
	}

	@Override
	public void deleteById(long id) {
		// TODO Auto-generated method stub
		 courseMapper.deleteById(id);
		
	}

	@Override
	public void save(Course course) {
		// TODO Auto-generated method stub
		courseMapper.save(course);
	}

	@Override
	public void update(Course course) {
		// TODO Auto-generated method stub
		courseMapper.update(course);
	}
	

}
