package com.dxc;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//Loading beans with an ApplicationContext
//creating many object and set the data
//creating two bean in .xml file and injecting in main class
public class Main4 {

    public static void main(String[] args)
    {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");

        IOTDevice myFirstDeviceBean=(IOTDevice) applicationContext.getBean("myIOTDeviceBeanOne");//casting
        IOTDevice mySecondDeviceBean= applicationContext.getBean("myIOTDeviceBeanTwo",IOTDevice.class);//without casting

        myFirstDeviceBean.setDevice("Fridge");
        myFirstDeviceBean.setDescription("Temperature guage for the freezer");

        mySecondDeviceBean.setDevice("Dishwasher");
        mySecondDeviceBean.setDescription("Monitors water flow");

        System.out.println("myFirstDeviceBean :"+myFirstDeviceBean);
        System.out.println("mySecondDeviceBean :"+mySecondDeviceBean);



    }
}
