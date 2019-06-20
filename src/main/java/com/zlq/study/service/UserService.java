package com.zlq.study.service;

import java.util.List;

import com.zlq.study.model.User;

public interface UserService {
	
	public List<User> selectAllUser();
	
	public User selectUserById(int id);

}
