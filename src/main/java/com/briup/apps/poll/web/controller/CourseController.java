package com.briup.apps.poll.web.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.briup.apps.poll.bean.Course;
import com.briup.apps.poll.service.ICourseService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
@Api(description="课程相关api,接口")
@RestController//增删改查服务
@RequestMapping("/course")//请求映射，/代表根目录
public class CourseController {
	@Autowired//自动注入
	private ICourseService courseService;
	@ApiOperation(value="查询所有课程信息")
	@GetMapping("findAllCourse")//定义方法路由，确定请求类型
	public List<Course> findAllCourse(){
		return courseService.findAll();
		
	}
	//对内接口不用写，这是对外要写多一点，
	@ApiOperation(value="通过ID删除所有课程信息")
	@GetMapping("deleteCourseById")//浏览器地址栏输入，不安全
	public String deleteCourseById(@RequestParam Long id){
		courseService.deleteById(id);
		return "删除成功";
	}
	@ApiOperation(value="添加所有课程信息")
	@PostMapping("saveCourse")//
	public String saveCourse(Course course){
		courseService.save(course);
		return "保存成功";
	}
	@ApiOperation(value="更新所有课程信息")
	@PostMapping("updateCourse")
	public String updateCourse(Course course){
		courseService.update(course);
		return "成功";
	}

}
