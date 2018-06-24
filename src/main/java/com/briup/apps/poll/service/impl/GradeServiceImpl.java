package com.briup.apps.poll.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.briup.apps.poll.bean.Grade;
import com.briup.apps.poll.dao.GradeMapper;
import com.briup.apps.poll.service.IGradeService;
@Service
public class GradeServiceImpl implements IGradeService{
	private GradeMapper gradeMapper;

	@Override
	public List<Grade> findAll() {
		// TODO Auto-generated method stub
		return gradeMapper.findAll();
	}

	@Override
	public void deleteById(long id) {
		// TODO Auto-generated method stub
		gradeMapper.deleteById(id);
	}

	@Override
	public void save(Grade grade) {
		// TODO Auto-generated method stub
		gradeMapper.save(grade);
	}

	@Override
	public void update(Grade grade) {
		// TODO Auto-generated method stub
		gradeMapper.update(grade);
	}
	

}
