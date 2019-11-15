package com.shangcg.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.shangcg.pojo.User;
import com.shangcg.service.IUserService;


@Controller
@RequestMapping("/user")
public class UserController {
	
	@Resource
	private IUserService userService;
	
	@RequestMapping("/showUser")
	public String toIndex(HttpServletRequest request,Model model){
		try {
			int userId = Integer.parseInt(request.getParameter("id"));
			User user = this.userService.getUserById(userId);
			model.addAttribute("user", user);
		}catch (Exception e){
			e.printStackTrace();
		}

		return "showUser";
	}
	
	//http://localhost:8080/springmvc.mybaits/user/showUser?id=1
}
