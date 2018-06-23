package com.briup.apps.poll.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.briup.apps.poll.bean.User;
import com.briup.apps.poll.service.IUserService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private IUserService userService;

	@ApiOperation(value = "查询所有用户信息")
	@GetMapping("findAllUser")
	public List<User> findAllUser() {// 两个问题，从前往后解决
		return userService.findAll();
	}
	//swagger显示不出来，重新运行服务器就可以了。
	@ApiOperation(value = "删除所有用户")//我到底什么问题啊，
	@PostMapping("deleteUser")
	public String deleteUserById(@RequestParam Long id) {
		userService.deleteById(id);
		return "删除成功";
	};

	@PostMapping("saveUser")
	public String saveUser(User user) {
		userService.save(user);
		return "保存成功，添加成功";
		
	}

	@PostMapping("updateUser")
	public String updateUser(User user) {
		userService.update(user);
		return "更新成功";
	}

}
