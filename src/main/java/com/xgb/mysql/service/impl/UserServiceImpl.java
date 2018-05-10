package com.xgb.mysql.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.xgb.mysql.dao.UserMapper;
import com.xgb.mysql.entity.User;
import com.xgb.mysql.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService{
	@Resource UserMapper mapper;

	@Override
	public int save(User user) {
		return mapper.save(user);
	}

	@Override
	public int delete(int id) {
		return mapper.delete(id);
	}

	@Override
	public int update(User user) {
		return mapper.update(user);
	}

	@Override
	public User getOne(int id) {
		return mapper.getOne(id);
	}

}
