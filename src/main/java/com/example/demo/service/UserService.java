package com.example.demo.service;

import com.example.demo.pojo.User;
import com.github.pagehelper.PageInfo;

/**
 * @author rongyong
 * @date 2018/9/23 0023 上午 12:58
 */
public interface UserService {
    PageInfo<User> getUserList(Integer page, Integer rows);
}
