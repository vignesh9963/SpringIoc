package com.dxc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

//Managing Beans with Spring Bean Factory
public class Main1 {

    public static void main(String[] args)
    {
        //Normal Java Object Construction
        IOTDevice myConstructedObject = new IOTDevice();

        System.out.println("IOTDevice initialized with a constructor: "+myConstructedObject);

        //IoC Container--> BeanFactory
        System.out.println("BeanFactory container");
        Resource resource=new ClassPathResource(("applicationContext.xml"));

        BeanFactory beanFactory=new XmlBeanFactory(resource);
        IOTDevice myDeviceBean=(IOTDevice) beanFactory.getBean("myIOTDeviceBean");
        System.out.println("XmlBeanFactory(Deprecated)-- "+ myDeviceBean);
    }

}
