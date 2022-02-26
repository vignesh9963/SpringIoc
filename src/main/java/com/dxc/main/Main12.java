package com.dxc.main;

import com.dxc.auto.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


//Referencing Beans(class Car ref to class engine)
public class Main12 {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext3.xml");

        Car car= (Car) applicationContext.getBean("carBean");

        System.out.println("The Car obtained from the Bean:\n" +car);

    }

}
