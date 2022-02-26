package com.dxc.data;


import org.springframework.core.env.SystemEnvironmentPropertySource;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.sql.SQLOutput;

@Component
public class IOTDevice1 {

    String device;
    String description;

    public IOTDevice1(String device, String description) {
        this.device = device;
        this.description = description;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "IOTDevice{" +
                "device='" + device + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    @PostConstruct
    public void initBean() throws Exception{
        System.out.println("IOTDevice has been instantiated. Inside the initBean() method");
    }

    @PreDestroy
    public void destroyBean() throws Exception{
        System.out.println("IOTDevice has been destroyed. Inside the destroyBean() method");
    }

}
