package com.dxc.main;



import com.dxc.auto.Car2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


//Configuring Beans with References(class Car ref to class engine) using default and parameterized constructor
public class Main14 {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext5.xml");

        Car2 car2= (Car2) applicationContext.getBean("carBean2");

        System.out.println("The Car obtained from the Bean:\n" +car2);

    }

}
