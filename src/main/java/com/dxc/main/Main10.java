package com.dxc.main;

import com.dxc.data.IOTDevice;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//Populating bean in applicationContext.xml
public class Main10 {

    public static void main(String[] args)
    {
        ClassPathXmlApplicationContext classPathXmlApplicationContext=new ClassPathXmlApplicationContext("applicationContext1.xml");

        System.out.println("About to Retrieve the instantiated beans...\n");
        IOTDevice myFirstDeviceBean=(IOTDevice) classPathXmlApplicationContext.getBean("FridgeBean");
        IOTDevice mySecondDeviceBean=(IOTDevice) classPathXmlApplicationContext.getBean("DishwasherBean");

        System.out.println("myFirstDeviceBean :"+myFirstDeviceBean);
        System.out.println("mySecondDeviceBean :"+mySecondDeviceBean);


        classPathXmlApplicationContext.close();
    }
}
