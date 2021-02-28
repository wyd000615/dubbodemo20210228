package com.xxxx.consumer;

import com.xxxx.common.pojo.User;
import com.xxxx.common.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Client implements CommandLineRunner {
    @Autowired
    private IUserService userService;
    @Override
    public void run(String... args) throws Exception {
        User user = userService.selectUserById(2);
        System.out.println(user.toString());
    }
}
