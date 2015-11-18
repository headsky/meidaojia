package com.hs;

import org.springframework.aop.support.AopUtils;

import com.hs.model.User;
import com.hs.service.UserService;

public class Main {
	public static void main(String[] args) {
			User user = new User();
			user.setOld(10);
			//UserService userService = new UserService();
			UserService userService = (UserService)Application.getBean("userService");
			boolean isProxy = AopUtils.isAopProxy(userService);
			System.out.println(isProxy);
			userService.insertUser(user);
			//userService.getUser();
		}
	}