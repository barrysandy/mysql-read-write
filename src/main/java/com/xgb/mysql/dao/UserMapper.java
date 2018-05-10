package com.xgb.mysql.dao;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import com.xgb.mysql.entity.User;

@Repository
public interface UserMapper {
	
	@Insert("insert into t_user(name,age,sex) values(#{name},#{age},#{sex} )")
	int save(User user) ;
	
	@Delete("delete from t_user where id = #{id}")
	int delete(@Param("id") int id);
	
	@Update("update set t_user name=#{name},age=#{age},sex=#{sex} where id=#{id} ")
	int update(User user);
	
	@Select("select * from t_user where id =#{id} ")
	User getOne(@Param("id") int id);
	

}
