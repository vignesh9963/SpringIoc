package com.dxc.main;

import com.dxc.data.IOTDevice;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

//Managing Beans with Spring Bean Factory
public class Main2 {

    public static void main(String[] args)
    {
        Resource resource=new ClassPathResource("applicationContext.xml");

        BeanDefinitionRegistry beanFactory=new DefaultListableBeanFactory();
        XmlBeanDefinitionReader beanReader=new XmlBeanDefinitionReader(beanFactory);
        beanReader.loadBeanDefinitions(resource);

        IOTDevice myDeviceBean=(IOTDevice) ((DefaultListableBeanFactory) beanFactory).getBean("myIOTDeviceBeanOne");
        System.out.println("Bean From BeanDefinitionRegistry -- "+ myDeviceBean);

    }
}
