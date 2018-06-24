package com.briup.apps.poll.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.briup.apps.poll.bean.School;
import com.briup.apps.poll.service.ISchoolService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
@Api(description="学校相关接口")
@RestController
@RequestMapping("/school")
public class SchoolController {
	@Autowired
	private ISchoolService schoolService;
	@ApiOperation(value="查询所有学校")
	@GetMapping("findAllSchool")
	public List<School> findAll(){
		return schoolService.findAll();
	}
	@PostMapping("deleteSchoolById")
	public String deleteSchoolById(@RequestParam Long id){
		schoolService.deleteById(id);
		return "删除成功";
	}
	@PostMapping("saveSchool")
	public String saveSchool(School school){
		schoolService.save(school);
		return "添加成功";
	}
	@PostMapping("updateSchool")
	public String updateSchool(School school){
		schoolService.update(school);
		return "更新成功";
	}

}
