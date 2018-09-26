package com.example.demo.controller;

import com.example.demo.pojo.User;
import com.example.demo.service.UserService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author rongyong
 * @date 2018/9/23 0023 上午 12:28
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService service;

    @RequestMapping("getUserList")
    public String getUserList(Model model, @RequestParam(defaultValue = "0") int page,
                              @RequestParam(defaultValue = "10") int rows){
        PageInfo<User> pageInfo = service.getUserList(page,rows);
        model.addAttribute("name","rong");
        model.addAttribute("pageInfo",pageInfo);
        return "userList";
    }
}
