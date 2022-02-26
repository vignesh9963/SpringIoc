package com.dxc.config;


import com.dxc.data.IOTDevice;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//bean annotaions and declaring a bean method
//main6
@Configuration
public class IOTDeviceBeanConfig2 {

    @Bean
    public IOTDevice IOTDeviceBean()
    {
        return new IOTDevice();
    }
}
