package com.dxc.main;

import com.dxc.config.IOTDeviceBeanConfig3;
import com.dxc.data.IOTDevice;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//Using Init and Destroy methods for Beans, bean declared in IOTDeviceBeanConfig3 class
public class Main8 {

    public static void main(String[] args)
    {
        AnnotationConfigApplicationContext applicationContext=new AnnotationConfigApplicationContext(IOTDeviceBeanConfig3.class);

        System.out.println("About to Retrieve the instantiated beans...\n");
        IOTDevice myFirstDeviceBean=(IOTDevice) applicationContext.getBean("FirstDeviceBean");
        IOTDevice mySecondDeviceBean=(IOTDevice) applicationContext.getBean("SecondDeviceBean");

        myFirstDeviceBean.setDevice("Fridge");
        myFirstDeviceBean.setDescription("Temperature guage for the freezer");

        mySecondDeviceBean.setDevice("Dishwasher");
        mySecondDeviceBean.setDescription("Monitors water flow");

        System.out.println("myFirstDeviceBean :"+myFirstDeviceBean);
        System.out.println("mySecondDeviceBean :"+mySecondDeviceBean);


        applicationContext.close();
    }
}
