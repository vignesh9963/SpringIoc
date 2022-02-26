package com.dxc.main;

import com.dxc.config.IOTDeviceBeanConfig4;
import com.dxc.data.IOTDevice;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main9 {


    public static void main(String[] args)
    {
        AnnotationConfigApplicationContext applicationContext=new AnnotationConfigApplicationContext(IOTDeviceBeanConfig4.class);

        System.out.println("About to Retrieve the instantiated beans...\n");
        IOTDevice myFirstDeviceBean=(IOTDevice) applicationContext.getBean("FridgeBean");
        IOTDevice mySecondDeviceBean=(IOTDevice) applicationContext.getBean("DishwasherBean");


        System.out.println("myFirstDeviceBean :"+myFirstDeviceBean);
        System.out.println("mySecondDeviceBean :"+mySecondDeviceBean);


        applicationContext.close();
    }
}
