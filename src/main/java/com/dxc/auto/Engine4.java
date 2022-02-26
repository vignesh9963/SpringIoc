package com.dxc.auto;

public class Engine4 {

    int horsePower;
    int maxRPM;
    float displacement;
    String cylinderConfig;
    String recommendedFuel;

    public Engine4(int horsePower, int maxRPM, float displacement, String cylinderConfig, String recommendedFuel) {
        this.horsePower = horsePower;
        this.maxRPM = maxRPM;
        this.displacement = displacement;
        this.cylinderConfig = cylinderConfig;
        this.recommendedFuel = recommendedFuel;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "horsePower=" + horsePower +
                ", maxRPM=" + maxRPM +
                ", displacement=" + displacement +
                ", cylinderConfig='" + cylinderConfig + '\'' +
                ", recommendedFuel='" + recommendedFuel + '\'' +
                '}';
    }
}
