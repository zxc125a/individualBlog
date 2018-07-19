package cn.edu.scau.individual.blog.controller.home;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import cn.edu.scau.individual.blog.service.UserService;
import cn.edu.scau.individual.blog.util.Functions;
/**
 * 用户的controller
 */
@Controller
public class UserController {

	@Autowired
	private  HttpServletRequest request;

	@Autowired
	private UserService userService;

	@Autowired
	private Functions functions;


}
