package com.dxc.auto;

public class Car3 {

    String type;
    String model;
    double price;
    int combinedFuelEconomy;
    Engine3 engine3;


    public Car3() {
        //Default Constructor
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

    public Engine3 getEngine3() {
        return engine3;
    }

    public void setEngine3(Engine3 engine3) {
        this.engine3 = engine3;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", combinedFuelEconomy=" + combinedFuelEconomy +
                ", engine3=" + engine3 +
                '}';
    }
}
