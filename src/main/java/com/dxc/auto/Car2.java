package com.dxc.auto;

public class Car2 {

    String type;
    String model;
    double price;
    int combinedFuelEconomy;
    Engine2 engine2;



    public Car2(String type, String model, double price, int combinedFuelEconomy, Engine2 engine2) {
        this.type = type;
        this.model = model;
        this.price = price;
        this.combinedFuelEconomy = combinedFuelEconomy;
        this.engine2 = engine2;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", combinedFuelEconomy=" + combinedFuelEconomy +
                ", engine1=" + engine2 +
                '}';
    }
}
