package com.loveincode.dubbo.provider;

import com.loveincode.dubbo.api.UserService;

public class UserServiceImpl implements UserService {

	public String sayHello(String name) {
		System.out.println("node");
		return "Welcome to loveincode's Dubbo world, Hello " + name;
	}

}
