package com.briup.apps.poll.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.briup.apps.poll.bean.School;
import com.briup.apps.poll.dao.SchoolMapper;
import com.briup.apps.poll.service.ISchoolService;
@Service
public class SchoolServiceImpl implements ISchoolService{
private SchoolMapper schoolMapper;
	@Override
	public List<School> findAll() {
		// TODO Auto-generated method stub
		return schoolMapper.findAll();
	}

	@Override
	public void deleteById(long id) {
		// TODO Auto-generated method stub
		schoolMapper.deleteById(id);
	}

	@Override
	public void save(School school) {
		// TODO Auto-generated method stub
		schoolMapper.save(school);
	}

	@Override
	public void update(School school) {
		// TODO Auto-generated method stub
		schoolMapper.update(school);
	}

}
