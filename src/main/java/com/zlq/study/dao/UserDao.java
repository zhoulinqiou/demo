package com.zlq.study.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.zlq.study.model.User;

@Mapper
public interface UserDao {
	
	public List<User> selectAllUser();
	
	public User selectUserById(int id);

}
