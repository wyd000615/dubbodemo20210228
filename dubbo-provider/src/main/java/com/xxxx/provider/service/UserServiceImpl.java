package com.xxxx.provider.service;

import com.xxxx.common.pojo.User;
import com.xxxx.common.service.IUserService;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements IUserService {
    @Override
    public User selectUserById(int id) {
        User user = new User();
        user.setUserId(id);
        user.setUsername("张三");
        System.out.println("接收到客户端id:"+id);
        return user;
    }
}
