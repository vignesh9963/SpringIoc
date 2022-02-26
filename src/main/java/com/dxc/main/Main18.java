package com.dxc.main;




import com.dxc.auto.Car5;
import com.dxc.auto.Car6;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


//Autowiring with setters
public class Main18 {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext10.xml");

        Car6 car6= (Car6) applicationContext.getBean("carBean");

        System.out.println("The Car obtained from the Bean:\n" +car6);

    }

}
