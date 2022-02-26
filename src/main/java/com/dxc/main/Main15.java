package com.dxc.main;




import com.dxc.auto.Car3;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


//Configuring Beans with References(class Car ref to class engine) using default and parameterized constructor
public class Main15 {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext6.xml");

        Car3 car3= (Car3) applicationContext.getBean("carBean3");

        System.out.println("The Car obtained from the Bean:\n" +car3);

    }

}
