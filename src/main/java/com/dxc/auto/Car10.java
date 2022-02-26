package com.dxc.auto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;
import java.util.Set;

public class Car10 {

    String type;
    String model;
    double price;
    int combinedFuelEconomy;
    Engine10 engine10;
    GearBox gearBox;
    List<String> notes;
    Set<Seats> availableSeatOptions;


    public Car10() {
        System.out.println("Defaults constructor in car has been used");
    }

    public Car10(String type, String model, double price, int combinedFuelEconomy, Engine10 engine10, GearBox gearBox, List<String> notes, Set<Seats> availableSeatOptions) {
        this.type = type;
        this.model = model;
        this.price = price;
        this.combinedFuelEconomy = combinedFuelEconomy;
        this.engine10 = engine10;
        this.gearBox = gearBox;
        this.notes = notes;
        this.availableSeatOptions = availableSeatOptions;

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

    public Engine10 getEngine10() {
        return engine10;
    }

    @Autowired(required = false)
    @Qualifier("engineBMW")
    public void setEngine10(Engine10 engine10) {
        this.engine10 = engine10;
        System.out.println("Engine setter accesssed in car");
    }


    public GearBox getGearBox() {
        return gearBox;
    }

    @Autowired(required = false)
    public void setGearBox(GearBox gearBox) {
        this.gearBox = gearBox;
    }

    public List<String> getNotes() {
        return notes;
    }

    @Autowired(required = false)
    public void setNotes(List<String> notes) {
        this.notes = notes;
    }

    public Set<Seats> getAvailableSeatOptions() {
        return availableSeatOptions;
    }

    @Autowired(required = false)
    public void setAvailableSeatOptions(Set<Seats> availableSeatOptions) {
        this.availableSeatOptions = availableSeatOptions;
    }


    @Override
    public String toString() {
        return "Car10{" +
                "type='" + type + '\'' +
                ",\n model='" + model + '\'' +
                ", \nprice=" + price +
                ", \ncombinedFuelEconomy=" + combinedFuelEconomy +
                ", \n\nengine10=" + engine10 +
                ", \n\ngearBox=" + gearBox +
                ", \n\nnotes=" + notes +
                ", \n\navailableSeatOptions=" + availableSeatOptions +
                '}';
    }
}
