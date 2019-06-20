package com.zlq.study.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.zlq.study.model.User;
import com.zlq.study.service.UserService;
@RestController
public class MainController {
    @Autowired  
	private UserService userService;
    
	
    @RequestMapping(value = "/world")
    String world() {
    	return "Hello World!";
    }
    
    @RequestMapping(value = "/SingleUser")
    User selectSingleUser() {
    	return userService.selectUserById(1);
    }
    
    @RequestMapping(value = "/AllUser")
    List<User> selectAllUser() {
    	return userService.selectAllUser();
    }
}