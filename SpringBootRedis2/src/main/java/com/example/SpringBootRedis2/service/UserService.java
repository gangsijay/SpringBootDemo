package com.example.SpringBootRedis2.service;

import java.util.List;

public interface UserService {

    /**
     * 新增一个用户
     * @param name
     * @param age
     */
    void create(Integer id,String name, Integer age);

    /**
     * 根据name删除一个用户高
     * @param name
     */
    void deleteByName(String name);

    /**
     * 获取用户总量
     */
    String getAllUsers();
    
    /**
     * 获取用户总量
     */
    String getAllUsers1();

    /**
     * 删除所有用户
     */
    void deleteAllUsers();

}