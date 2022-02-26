package com.dxc.main;

import com.dxc.data.IOTDevice;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


//Using Init and Destroy methods for Beans
public class Main7 {

    public static void main(String[] args)
    {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");

        System.out.println("About to Retrieve the instantiated beans...\n");
        IOTDevice myFirstDeviceBean=(IOTDevice) applicationContext.getBean("myIOTDeviceBeanOne");
        IOTDevice mySecondDeviceBean=(IOTDevice) applicationContext.getBean("myIOTDeviceBeanTwo");

        myFirstDeviceBean.setDevice("Fridge");
        myFirstDeviceBean.setDescription("Temperature guage for the freezer");

        mySecondDeviceBean.setDevice("Dishwasher");
        mySecondDeviceBean.setDescription("Monitors water flow");

        System.out.println("myFirstDeviceBean :"+myFirstDeviceBean);
        System.out.println("mySecondDeviceBean :"+mySecondDeviceBean);


    }
}
