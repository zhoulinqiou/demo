package com.zlq.study.service.impl;

import java.util.List;	

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zlq.study.dao.UserDao;
import com.zlq.study.model.User;
import com.zlq.study.service.UserService;


@Service
public class UserServiceImpl implements UserService{
    @Autowired  
    private UserDao userDao;  
    
    @Override
    public List<User> selectAllUser() {
        return userDao.selectAllUser();  
    }

	@Override
	public User selectUserById(int id) {
		return userDao.selectUserById(id);
	}

}