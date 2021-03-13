package com.upc.demo.service;

import com.upc.demo.bean.User;
import com.upc.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thymeleaf.util.StringUtils;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public boolean login(String username, String password,int position) {
        User user = userMapper.getUserByName1(username,position);
        if(user==null){return false;}
        if (!StringUtils.isEmpty(username) && user.getPassword().equals(password)) {
            return true;
        }
        return false;
    }

    public int register(String username, String password) {
        User user = new User(username, password);
        if(userMapper.getUserByName(username)==null)
        {userMapper.addUser(user);
            return 1;}
        else
            return 0;

    }


}
