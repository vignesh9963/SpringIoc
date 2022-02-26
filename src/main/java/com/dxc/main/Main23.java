package com.dxc.main;




import com.dxc.auto.Car10;
import com.dxc.auto.Car9;
import com.dxc.config.CarBeanConfig;
import com.dxc.config.CarBeanConfig2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//Autowiring Collections Using a JavaConfig

public class Main23 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(CarBeanConfig2.class);

        Car10 car10= (Car10) applicationContext.getBean("carBean");

        System.out.println("The Car obtained from the Bean:\n" +car10);

    }

}
