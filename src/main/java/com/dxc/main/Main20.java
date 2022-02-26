package com.dxc.main;




import com.dxc.auto.Car7;
import com.dxc.auto.Car8;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


// Autowiring with setters(passing argument as false) and using qualifier(to restrict to a specific bean)
public class Main20 {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext12.xml");

        Car8 car8= (Car8) applicationContext.getBean("carBean");

        System.out.println("The Car obtained from the Bean:\n" +car8);

    }

}
