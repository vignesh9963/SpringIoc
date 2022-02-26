package com.dxc.main;

import com.dxc.config.IOTDeviceBeanConfig2;
import com.dxc.data.IOTDevice;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//using bean annotation in IOTDeviceBeanConfig2
public class Main6 {

    public static void main(String[] args)
    {
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(IOTDeviceBeanConfig2.class);

        IOTDevice myFirstDeviceBean=(IOTDevice) applicationContext.getBean("IOTDeviceBean");
        //newly created bean method in IOTDeviceBeanConfig2

        myFirstDeviceBean.setDevice("TV-2");
        myFirstDeviceBean.setDescription("Different channels including netflix");
        System.out.println("myFirstDeviceBean "+myFirstDeviceBean);


    }


}
