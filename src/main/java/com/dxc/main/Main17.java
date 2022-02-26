package com.dxc.main;




import com.dxc.auto.Car;
import com.dxc.auto.Car1;
import com.dxc.auto.Car5;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


// using the autowired annotation
public class Main17 {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext9.xml");

        Car5 car5= (Car5) applicationContext.getBean("carBean");

        System.out.println("The Car obtained from the Bean:\n" +car5);

    }

}
