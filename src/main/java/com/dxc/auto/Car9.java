package com.dxc.auto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car9 {

    String type;
    String model;
    double price;
    int combinedFuelEconomy;

    Engine9 engine9;


    public Car9() {
        System.out.println("Defaults constructor in car has been used");
    }


    public Car9(String type, String model, double price, int combinedFuelEconomy, Engine9 engine9) {
        this.type = type;
        this.model = model;
        this.price = price;
        this.combinedFuelEconomy = combinedFuelEconomy;
        this.engine9 = engine9;


        System.out.println("Parameterized constructor in car has been used");
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCombinedFuelEconomy() {
        return combinedFuelEconomy;
    }

    public void setCombinedFuelEconomy(int combinedFuelEconomy) {
        this.combinedFuelEconomy = combinedFuelEconomy;
    }

    public Engine9 getEngine9() {
        return engine9;
    }

    @Autowired(required = false)
    @Qualifier("engineVW")
    public void setEngine9(Engine9 engine9) {
        this.engine9 = engine9;

        System.out.println("Engine setter accesssed in car");
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", \nmodel='" + model + '\'' +
                ", \nprice=" + price +
                ", \ncombinedFuelEconomy=" + combinedFuelEconomy +
                ",\n engine9=" + engine9 +
                '}';
    }
}
