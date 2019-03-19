package cn.spring.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;

import cn.spring.entity.User;
import cn.spring.service.UserService;

@Controller
public class UserController {
	@Resource
	private UserService userService;

	@Resource
	private User user;

	@RequestMapping("/hello")
	@ResponseBody
	public Map<String, Object> showHelloWorld() {
		Map<String, Object> map = new HashMap<>();
		map.put("msg", "HelloWorld");
		System.out.println("userName="+user.getUserName()+"  userPassword="+user.getUserPassword());
		return map;
	}

	@RequestMapping(value="/user",produces="application/json")
	@ResponseBody
	public String getUserById(@RequestParam("id") String idStr) {
		Integer id = Integer.parseInt(idStr);
		Map<String, Object> map = new HashMap<>();
		User userById = userService.getUserById(id);
		map.put("user", userById);
		return JSON.toJSONString(map);
	}
	
	@RequestMapping(value="/index")
	public String index(@RequestParam("id") String idStr,Model model) {
		Integer id = Integer.parseInt(idStr);
		User userById = userService.getUserById(id);
		model.addAttribute("user", userById);
		return "index";
	}
}
