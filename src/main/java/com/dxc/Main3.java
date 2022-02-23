package com.dxc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//Loading beans with an ApplicationContext
public class Main3 {

    public static void main(String[] args)
    {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        IOTDevice myDeviceBean=(IOTDevice) applicationContext.getBean("myIOTDeviceBean");
        System.out.println("Bean from ApplicationContext: \n"+ myDeviceBean);
    }

}
