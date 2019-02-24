package com.itheima.controller;

import com.itheima.domain.User;
import com.itheima.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: lizhihe
 * @Date: 2019/2/22 20:27
 * @Version 1.0
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserService userService;



    @RequestMapping(value = "/userLogin")
    public String login(@Param(value = "username") String username, @Param(value = "password") String password, Model model) {
        User user = userService.login(username, password);
        if (user != null) {
            String usern = user.getUsername();//获取用户名
            model.addAttribute("usern", usern);
        }

        if (user != null) {
            return "forward:/jsp/index.jsp";//要获取用户名 所以使用请求转发
        } else {
            return "redirect:/jsp/login.jsp";
        }
    }


}
