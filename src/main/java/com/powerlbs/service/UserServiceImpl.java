package com.powerlbs.service;

import com.powerlbs.bean.User;
import com.powerlbs.service.UserService;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName:${name}
 * package:com.powerlbs.service.impl
 *
 * @date:2019/10/1 21:43
 * @author:Yaoxiaoming
 **/

public class UserServiceImpl implements UserService {
    @Override
    public List<User> selectUserInfo() {
        List<User> userList = new ArrayList<>();
        User user = new User();
        user.setAge(13);
        user.setId(1);
        user.setName("大黄");
        userList.add(user);
        return userList;
    }
}
