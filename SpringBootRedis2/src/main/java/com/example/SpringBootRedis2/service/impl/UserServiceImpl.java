package com.example.SpringBootRedis2.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.example.SpringBootRedis2.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void create(Integer id,String name, Integer age) {
        jdbcTemplate.update("insert into users(id,name, age) values(?,?, ?)", id, name, age);
    }

    @Override
    public void deleteByName(String name) {
        jdbcTemplate.update("delete from users where name = ?", name);
    }

    @Override
    @Cacheable(value = { "findUsers" })
    public String getAllUsers() {
        return jdbcTemplate.queryForObject("select name from users limit 1 ", String.class);
    }
    
    @Override
    @Cacheable(value = { "findUsers1" })
    public String getAllUsers1() {
        return jdbcTemplate.queryForObject("select name from users limit 1 ", String.class);
    }

    @Override
    public void deleteAllUsers() {
        jdbcTemplate.update("delete from USER");
    }
}