package com.example.demo.mapper;

import com.example.demo.pojo.Consumer;
import com.example.demo.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author rongyong
 * @date 2018/9/23 0023 上午 1:00
 */
@Mapper
public interface UserMapper {

    @Select("select * from user")
    List<User> getUserList();

    @Select("select * from consumer where username=#{username} and password=#{password}")
    Consumer login(@Param("username")String username, @Param("password")String password);
}
