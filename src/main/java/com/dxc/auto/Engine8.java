package com.dxc.auto;

public class Engine8 {

    int horsePower;
    int maxRPM;
    float displacement;
    String cylinderConfig;
    String recommendedFuel;

    public Engine8() {
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getMaxRPM() {
        return maxRPM;
    }

    public void setMaxRPM(int maxRPM) {
        this.maxRPM = maxRPM;
    }

    public float getDisplacement() {
        return displacement;
    }

    public void setDisplacement(float displacement) {
        this.displacement = displacement;
    }

    public String getCylinderConfig() {
        return cylinderConfig;
    }

    public void setCylinderConfig(String cylinderConfig) {
        this.cylinderConfig = cylinderConfig;
    }

    public String getRecommendedFuel() {
        return recommendedFuel;
    }

    public void setRecommendedFuel(String recommendedFuel) {
        this.recommendedFuel = recommendedFuel;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "horsePower=" + horsePower +
                ", \nmaxRPM=" + maxRPM +
                ", \ndisplacement=" + displacement +
                ", \ncylinderConfig='" + cylinderConfig + '\'' +
                ", \nrecommendedFuel='" + recommendedFuel + '\'' +
                '}';
    }
}
