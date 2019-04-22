package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.model.Admin;
import com.example.demo.model.User;
import com.example.demo.services.AdminService;
import com.example.demo.services.UserService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TechPublishingApplicationTests {

	@Autowired
	ApplicationContext context;

	@Test
		public void validateUser() {
			UserService service = context.getBean(UserService.class);
			String username="sam";
			String pass="123456";
			User user = service.validateUser(username, pass);
			System.out.println(user);
		}
	@Test
	public void validateAdmin() {
		AdminService service = context.getBean(AdminService.class);
		String adminname="root";
		String pass="root";
		Admin admin = service.validateAdmin(adminname, pass);
		System.out.println(admin);
	}
}


