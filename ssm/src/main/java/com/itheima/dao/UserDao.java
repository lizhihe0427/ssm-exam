package com.itheima.dao;


import com.itheima.domain.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author: lizhihe
 * @Date: 2019/2/22 20:02
 * @Version 1.0
 */
public interface UserDao {
    @Select("select*from s_user where username=#{username} and password =#{password}")
    User login(@Param(value = "username")String username, @Param(value = "password") String password);

    @Select("SELECT*from s_user where uid=#{cid}")
    List<User> listByCid(@Param(value = "cid") Integer cid);

    @Select("select*from s_user")
    List<User>list();





}
