package com.service;

import com.entity.User;
import com.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {

    @Resource private UserMapper userMapper;

    public User login(User user){
       User user1 = userMapper.findUserByUserId("1");
        System.out.println(user1.getUserId()+" "+user1.getUserName());
        return user1;
    }
}
