/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.BarChart;

/**
 *
 * @author Harsh
 */
public class Report {

    private float energyWindow;
    private float energySpaceHeating;
    private float energyPower;
    private float energyLight;
    private float totalEnergySaving;


    public float getEnergyWindow() {
        return energyWindow;
    }

    public void setEnergyWindow(float energyWindow) {
        this.energyWindow = energyWindow;
    }


    public float getEnergySpaceHeating() {
        return energySpaceHeating;
    }

    public void setEnergySpaceHeating(float energySpaceHeating) {
        this.energySpaceHeating = energySpaceHeating;
    }


    public float getEnergyPower() {
        return energyPower;
    }

    public void setEnergyPower(float energyPower) {
        this.energyPower = energyPower;
    }


    public float getEnergyLight() {
        return energyLight;
    }

    public void setEnergyLight(float energyLight) {
        this.energyLight = energyLight;
    }

    public float getTotalEnergySaving() {
        return totalEnergySaving;
    }

    public void setTotalEnergySaving(float totalEnergySaving) {
        this.totalEnergySaving = totalEnergySaving;
    }

}
