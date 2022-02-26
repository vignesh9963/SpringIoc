package com.dxc.auto;

public class Car1 {

    String type;
    String model;
    double price;
    int combinedFuelEconomy;
    Engine1 engine1;


    public Car1(String type, String model, double price, int combinedFuelEconomy, Engine1 engine1) {
        this.type = type;
        this.model = model;
        this.price = price;
        this.combinedFuelEconomy = combinedFuelEconomy;
        this.engine1 = engine1;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", combinedFuelEconomy=" + combinedFuelEconomy +
                ", engine1=" + engine1 +
                '}';
    }
}
