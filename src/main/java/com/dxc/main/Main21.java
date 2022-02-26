package com.dxc.main;




import com.dxc.auto.Car9;
import com.dxc.config.CarBeanConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//Autowiring with Java Bean Configuration
//@ setters(passing argument as false) in car9 and using qualifier(to restrict to a specific bean)
public class Main21 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(CarBeanConfig.class);

        Car9 car9= (Car9) applicationContext.getBean("carBeanConfig1");

        System.out.println("The Car obtained from the Bean:\n" +car9);

    }

}
