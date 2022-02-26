package com.dxc.main;




import com.dxc.auto.Car6;
import com.dxc.auto.Car7;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


// Autowiring with constructors
public class Main19 {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext11.xml");

        Car7 car7= (Car7) applicationContext.getBean("carBean");

        System.out.println("The Car obtained from the Bean:\n" +car7);

    }

}
