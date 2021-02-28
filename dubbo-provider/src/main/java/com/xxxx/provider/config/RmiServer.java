package com.xxxx.provider.config;

import com.xxxx.common.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiServiceExporter;

@Configuration
public class RmiServer {
    @Autowired
    private IUserService userService;
    @Bean
    public RmiServiceExporter rmiServiceExporter(){
        RmiServiceExporter rmiServiceExporter = new RmiServiceExporter();
        rmiServiceExporter.setServiceName("userService");
        rmiServiceExporter.setRegistryPort(2002);
        rmiServiceExporter.setService(userService);
        rmiServiceExporter.setServiceInterface(IUserService.class);
        return  rmiServiceExporter;
    }
}
