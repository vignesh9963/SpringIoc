package com.dxc.auto;

import org.springframework.beans.factory.annotation.Autowired;

public class Car5 {

    String type;
    String model;
    double price;
    int combinedFuelEconomy;

    @Autowired
    Engine5 engine5;


    public Car5() {
        System.out.println("Defaults constructor in car has been used");
    }


    public Car5(String type, String model, double price, int combinedFuelEconomy, Engine5 engine5) {
        this.type = type;
        this.model = model;
        this.price = price;
        this.combinedFuelEconomy = combinedFuelEconomy;
        this.engine5 = engine5;


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

    public Engine5 getEngine5() {
        return engine5;
    }

    public void setEngine5(Engine5 engine5) {
        this.engine5 = engine5;

        System.out.println("Engine setter accesssed in car");
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", \nmodel='" + model + '\'' +
                ", \nprice=" + price +
                ", \ncombinedFuelEconomy=" + combinedFuelEconomy +
                ",\n engine5=" + engine5 +
                '}';
    }
}
