package com.itheima.controller;

import com.itheima.domain.Cust;
import com.itheima.domain.User;
import com.itheima.service.CustService;
import com.itheima.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: lizhihe
 * @Date: 2019/2/22 21:16
 * @Version 1.0
 */
@Controller
@RequestMapping(value = "/cust")
public class CustController {

    @Autowired
    private CustService custService;

    @Autowired
    private UserService userService;


    @RequestMapping(value = "/list")
    public String list(@Param(value = "custName") String custName, @Param(value = "custType") String custType,Model model) {
        if (custName==""&&custType==""){
            List<Cust> list = custService.list();
            model.addAttribute("list", list);
            return "center";
        }


        if (custName!=null||custType!=null) {
            List<Cust> list = custService.search(custName, custType);
            model.addAttribute("list", list);
            model.addAttribute("custName",custName);
            model.addAttribute("custType",custType);
        }else {
            List<Cust> list = custService.list();
            model.addAttribute("list", list);
        }
        return "center";
    }


    @RequestMapping(value = "/delete/{id}")
    public String delete(@PathVariable(value = "id") Integer id) {
        int delete = custService.delete(id);
        return "redirect:/cust/list";
    }



    @RequestMapping(value = "/add",method = RequestMethod.GET)
     public String add(Model model){
        List<User> users = userService.list();
        System.out.println("-------------------");
        model.addAttribute("users",users);
        return "forward:/cust/list";
    }

    /**
     * \
     * 增加客户
     *
     * @param
     * @return
     */
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public String add(Cust cust) {

        int add = custService.add(cust);
        //添加失败，提示用户
        return "forward:/cust/list";
    }
}
