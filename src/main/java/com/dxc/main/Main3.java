package com.dxc.main;

import com.dxc.data.IOTDevice;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

//Loading beans with an ApplicationContext
public class Main3 {

    public static void main(String[] args)
    {
        Resource resource =new ClassPathResource("applicationContext.xml");
        /*
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
       */ /*IOTDevice myDeviceBean=(IOTDevice) applicationContext.getBean("myIOTDeviceBean");
        System.out.println("Bean from ApplicationContext: \n"+ myDeviceBean);*/

        BeanFactory beanFactory=new XmlBeanFactory(resource);
        IOTDevice myDeviceBean=(IOTDevice) beanFactory.getBean("myIOTDeviceBeanOne");
        System.out.println("XmlBeanFactory-- "+ myDeviceBean);

    }

}
