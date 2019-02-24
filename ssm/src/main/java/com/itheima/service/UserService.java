package com.itheima.service;

import com.itheima.domain.User;

import java.util.List;

/**
 * @Author: lizhihe
 * @Date: 2019/2/22 20:32
 * @Version 1.0
 */
public interface UserService {
    /**
     * 用户登录的方法
     * @param username
     * @param password
     * @return
     */
    User login(String username, String password);

    /**
     * 查询所有用户信息
     * @return
     */
    List<User> list();

}
