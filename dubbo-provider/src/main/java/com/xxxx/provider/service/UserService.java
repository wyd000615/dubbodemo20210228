package com.xxxx.provider.service;

import com.xxxx.common.pojo.User;
import com.xxxx.common.service.IUserService;
import org.apache.dubbo.config.annotation.Service;
//import org.apache.dubbo.config.annotation.Service;

//@Service("userService")
@Service(version = "1.0")  //注意 此处用的是dubbo提供的service
//@Service
public class UserService implements IUserService {
    @Override
    public User selectUserById(int id) {
        User user = new User();
        user.setUserId(id);
        user.setUsername("张三");
        System.out.println("接收到客户端id:"+id);
        return user;
    }
}
