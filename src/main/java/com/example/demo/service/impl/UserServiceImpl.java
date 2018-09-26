package com.example.demo.service.impl;

import com.example.demo.mapper.UserMapper;
import com.example.demo.pojo.User;
import com.example.demo.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author rongyong
 * @date 2018/9/23 0023 上午 12:59
 */
@Service
public class UserServiceImpl implements UserService {

   @Resource
   private UserMapper mapper;

    @Override
    public PageInfo<User> getUserList(Integer page, Integer rows) {
        PageHelper.startPage(page,rows);
        List<User> list = mapper.getUserList();
        PageInfo<User> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }
}
