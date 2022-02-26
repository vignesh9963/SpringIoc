package com.dxc.config;

import com.dxc.data.IOTDevice;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//Populating bean in java config file
@Configuration
public class IOTDeviceBeanConfig4 {



    @Bean(name = "FridgeBean",initMethod = "initBean",destroyMethod = "destroyBean")
    public IOTDevice FirstIOTDeviceBean()
    {

        IOTDevice iotDevice=new IOTDevice();
        iotDevice.setDevice("Fridge");
        iotDevice.setDescription("Temperature guage for the freezer");
        return iotDevice;
    }

    @Bean(name = "DishwasherBean",initMethod = "initBean",destroyMethod = "destroyBean")
    public IOTDevice SecondIOTDeviceBean()
    {
        IOTDevice iotDevice=new IOTDevice();
        iotDevice.setDevice("Dishwasher");
        iotDevice.setDescription("Monitors water Flow");
        return iotDevice;
    }
}

