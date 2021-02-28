package com.xxxx.consumer;

import com.xxxx.common.pojo.User;
import com.xxxx.common.service.IUserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Client implements CommandLineRunner {
    //@Autowired
    //@Reference(version = "1.0",parameters = {"unicast","false"})  //注意此处需要用dubbo的reference
    @Reference(version = "1.0")  //注意此处需要用dubbo的reference
    private IUserService userService;
    @Override
    public void run(String... args) throws Exception {
        User user = userService.selectUserById(2);
        System.out.println(user.toString());
    }
}
