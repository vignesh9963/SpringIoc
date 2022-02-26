package com.dxc.main;




import com.dxc.auto.Car10;
import com.dxc.auto.Car8;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


//Autowiring Collections Using a XMLConfig
public class Main22 {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext14.xml");

        Car10 car10= (Car10) applicationContext.getBean("carBean");

        System.out.println("The Car obtained from the Bean:\n" +car10);

    }

}
