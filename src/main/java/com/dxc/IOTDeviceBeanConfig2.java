package com.dxc;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//bean annotaions and declaring a bean method
@Configuration
public class IOTDeviceBeanConfig2 {

    @Bean
    public IOTDevice IOTDeviceBean()
    {
        return new IOTDevice();
    }
}
