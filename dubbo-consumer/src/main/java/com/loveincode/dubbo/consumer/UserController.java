package com.loveincode.dubbo.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.loveincode.dubbo.api.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService userService;

	/**
	 * 
	 * @param name
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/sayHello/{name}")
	public JSONObject testJson(@PathVariable("name") String name) {
		JSONObject jsonObject = new JSONObject();
		String testStr = userService.sayHello(name);
		jsonObject.put("str", testStr);
		return jsonObject;
	}
}