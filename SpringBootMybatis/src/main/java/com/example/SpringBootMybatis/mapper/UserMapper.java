package com.example.SpringBootMybatis.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.example.SpringBootMybatis.entity.UserEntity;

public interface UserMapper {
	
	@Select("SELECT * FROM users WHERE id = #{id}")
	@Results({
		@Result(property = "name",  column = "name"),
		@Result(property = "age", column = "age")
	})
	UserEntity getOne(Integer id);

	@Insert("INSERT INTO users(id,name,age) VALUES(#{id},#{name}, #{age})")
	void insert(UserEntity user);

}