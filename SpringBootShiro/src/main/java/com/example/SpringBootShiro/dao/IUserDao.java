package com.example.SpringBootShiro.dao;

import java.util.List;

import org.springframework.data.repository.Repository;
import org.springframework.data.repository.RepositoryDefinition;

import com.example.SpringBootShiro.entity.User;

@RepositoryDefinition(domainClass=User.class,idClass=Integer.class)
public interface IUserDao extends Repository<User, Integer> {

	public User getById(Integer id);
	
	public List<User> findAll();
	
	public User findByUsername(String name);
}