package com.xgb.mysql.service;


import com.xgb.mysql.entity.User;

public interface UserService {
	int save(User user) ;
	
	int delete(int id);
	
	int update(User user);
	
	User getOne(int id);
}
