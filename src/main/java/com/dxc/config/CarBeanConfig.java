package com.dxc.config;

import com.dxc.auto.Car9;
import com.dxc.auto.Engine9;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CarBeanConfig {

    @Bean(name = "carBeanConfig1")
    public Car9 carBean123()
    {

        Car9 car9=new Car9();
        car9.setType("HatchBook");
        car9.setModel("Volkswagen GTI 2021");
        car9.setPrice(33333);
        car9.setCombinedFuelEconomy(26);

        return car9;

    }


    @Bean(name = "engineVW")
    public Engine9 engine9()
    {
        return new Engine9(228,50000,2.0f,"I-4","premiumunleaded");

    }
}
