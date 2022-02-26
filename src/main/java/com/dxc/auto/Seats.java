package com.dxc.auto;

public class Seats {

    String type;
    boolean heated;
    String color;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isHeated() {
        return heated;
    }

    public void setHeated(boolean heated) {
        this.heated = heated;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    @Override
    public String toString() {
        return "Seats{" +
                "type='" + type + '\'' +
                ", \nheated=" + heated +
                ", \ncolor='" + color + '\'' +
                '}';
    }
}
