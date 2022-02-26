package com.dxc.config;

import com.dxc.auto.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

@Configuration
public class CarBeanConfig2 {

    @Bean
    public Car10 carBean()
    {

        Car10 car10=new Car10();

        ArrayList<String> notes=new ArrayList<>();
        notes.add("Internal Combustion Engine");
        notes.add("3-year service included");

        car10.setType("Sedan");
        car10.setModel("BMW 740 2021");
        car10.setPrice(33333);
        car10.setCombinedFuelEconomy(26);
        car10.setNotes(notes);

        return car10;

    }


    @Bean(name = "engineBMW")
    public Engine10 engine10()
    {
        return new Engine10(228,50000,2.0f,"I-4","premiumunleaded");

    }

    @Bean(name = "gearBoxBMW")
    public GearBox gearBox()
    {
        GearBox myGearBox=new GearBox();
        myGearBox.setType("Shiftable Automatic");
        myGearBox.setNumGears(8);
        return myGearBox;

    }

    @Bean(name = "seatOptionOne")
    public Seats seatOne(){
        Seats seatsConfig=new Seats();
        seatsConfig.setType("Bucket Leather");
        seatsConfig.setColor("Black");
        seatsConfig.setHeated(true);
        return seatsConfig;
    }

    @Bean(name = "seatOptionTwo")
    public Seats seatTwo()
    {
        Seats seatsConfig=new Seats();
        seatsConfig.setType("Bucket Vinyl");
        seatsConfig.setColor("Red");
        seatsConfig.setHeated(true);
        return seatsConfig;
    }

    @Bean(name = "seatOptionThree")
    public Seats seatThree()
    {
        Seats seatsConfig=new Seats();
        seatsConfig.setType("Bucket Fabric");
        seatsConfig.setColor("Brown");
        seatsConfig.setHeated(false);
        return seatsConfig;
    }


}
