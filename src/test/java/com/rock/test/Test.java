package com.rock.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rock.service.UserService;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "beans.xml" });
		UserService userService = (UserService) context.getBean("userService");
		userService.save();
	}

}
