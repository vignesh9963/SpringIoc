package com.dxc.auto;

import org.springframework.beans.factory.annotation.Autowired;

public class Car7 {

    String type;
    String model;
    double price;
    int combinedFuelEconomy;

    Engine7 engine7;


    public Car7() {
        System.out.println("Defaults constructor in car has been used");
    }

    @Autowired
    public Car7(String type, String model, double price, int combinedFuelEconomy, Engine7 engine7) {
        this.type = type;
        this.model = model;
        this.price = price;
        this.combinedFuelEconomy = combinedFuelEconomy;
        this.engine7 = engine7;


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

    public Engine7 getEngine7() {
        return engine7;
    }

    public void setEngine7(Engine7 engine7) {
        this.engine7 = engine7;

        System.out.println("Engine setter accesssed in car");
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", \nmodel='" + model + '\'' +
                ", \nprice=" + price +
                ", \ncombinedFuelEconomy=" + combinedFuelEconomy +
                ",\n engine7=" + engine7 +
                '}';
    }
}
