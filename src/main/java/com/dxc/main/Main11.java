package com.dxc.main;

import com.dxc.data.IOTDevice1;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//Populating bean in applicationContext.xml
public class Main11 {

    public static void main(String[] args)
    {
        ClassPathXmlApplicationContext classPathXmlApplicationContext=new ClassPathXmlApplicationContext("applicationContext2.xml");

        System.out.println("About to Retrieve the instantiated beans...\n");
        IOTDevice1 myFirstDeviceBean=(IOTDevice1) classPathXmlApplicationContext.getBean("FridgeBean");
        IOTDevice1 mySecondDeviceBean=(IOTDevice1) classPathXmlApplicationContext.getBean("DishwasherBean");

        System.out.println("myFirstDeviceBean :"+myFirstDeviceBean);
        System.out.println("mySecondDeviceBean :"+mySecondDeviceBean);


        classPathXmlApplicationContext.close();
    }
}
