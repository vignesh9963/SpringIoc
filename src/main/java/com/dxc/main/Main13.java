package com.dxc.main;


import com.dxc.auto.Car1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


//Configuring Beans with References(class Car ref to class engine) using constructor parameterized
public class Main13 {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext4.xml");

        Car1 car1= (Car1) applicationContext.getBean("carBean1");

        System.out.println("The Car obtained from the Bean:\n" +car1);

    }

}
