package com.dxc.config;

import com.dxc.data.IOTDevice;
import org.springframework.context.annotation.Bean;
//main8
public class IOTDeviceBeanConfig3 {

    @Bean(name = "FirstDeviceBean",initMethod = "initBean",destroyMethod = "destroyBean")
    public IOTDevice FirstIOTDeviceBean()
    {
        return new IOTDevice();
    }

    @Bean(name = "SecondDeviceBean",initMethod = "initBean",destroyMethod = "destroyBean")
    public IOTDevice SecondIOTDeviceBean()
    {
        return new IOTDevice();
    }
}
