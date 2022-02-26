package com.dxc.auto;

public class GearBox {
    String type;
    int numGears;


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNumGears() {
        return numGears;
    }

    public void setNumGears(int numGears) {
        this.numGears = numGears;
    }

    @Override
    public String toString() {
        return "GearBox{" +
                "type='" + type + '\'' +
                ", \nnumGears=" + numGears +
                '}';
    }
}
