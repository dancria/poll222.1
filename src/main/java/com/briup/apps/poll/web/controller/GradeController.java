package com.briup.apps.poll.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.briup.apps.poll.bean.Grade;
import com.briup.apps.poll.service.IGradeService;

import io.swagger.annotations.Api;
@Api(description="班级相关接口")
@RestController
@RequestMapping("/grade")
public class GradeController {
	@Autowired
	private IGradeService gradeService;
	
	@PostMapping("findAllGrade")
	public List<Grade> findAll(){
		return gradeService.findAll();
	}
	@PostMapping("deleteGradeById")
	public String deleteGradeById(@RequestParam Long id){
		gradeService.deleteById(id);
		return "删除成功";
	}
	@PostMapping("updateGrade")
	public String updateGrade(Grade grade){
		gradeService.update(grade);
		return "更新成功";
	}
	@PostMapping("saveGrade")
	public String saveGrade(Grade grade){
		gradeService.save(grade);
		return "添加成功";
	}

}
