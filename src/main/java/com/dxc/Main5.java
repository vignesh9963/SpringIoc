package com.dxc;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


//Configuring Beans with Annotations
//using componentscan in IOTDeviceBeanConfig
public class Main5 {

    public static void main(String[] args)
    {
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(IOTDeviceBeanConfig.class);

        IOTDevice myFirstDeviceBean=applicationContext.getBean(IOTDevice.class);

        myFirstDeviceBean.setDevice("TV");
        myFirstDeviceBean.setDescription("Different channels including netflix");
        System.out.println("myFirstDeviceBean "+myFirstDeviceBean);


    }


}
