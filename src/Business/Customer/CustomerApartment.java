/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

/**
 *
 * @author Harsh
 */
public class CustomerApartment {

    private int customizeProductId;
    private String apartmentType;
    private String powerType;
    private String window;
    private String flooring;
    private String spaceHeating;
    private String housingComplexType;
    private String furnitureWoodType;
    private String interiorThemeType;
    private String lightFixtureType;
    private float price;
    private static int count = 0;

    public CustomerApartment() {
        count++;
        customizeProductId = count;
    }

    public String getLightFixtureType() {
        return lightFixtureType;
    }

    public void setLightFixtureType(String lightFixtureType) {
        this.lightFixtureType = lightFixtureType;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        CustomerApartment.count = count;
    }

    public int getCustomizeProductId() {
        return customizeProductId;
    }

    public void setCustomizeProductId(int customizeProductId) {
        this.customizeProductId = customizeProductId;
    }

    public String getApartmentType() {
        return apartmentType;
    }

    public void setApartmentType(String apartmentType) {
        this.apartmentType = apartmentType;
    }

    public String getPowerType() {
        return powerType;
    }

    public void setPowerType(String powerType) {
        this.powerType = powerType;
    }

    public String getWindow() {
        return window;
    }

    public void setWindow(String window) {
        this.window = window;
    }

    public String getFlooring() {
        return flooring;
    }

    public void setFlooring(String flooring) {
        this.flooring = flooring;
    }

    public String getSpaceHeating() {
        return spaceHeating;
    }

    public void setSpaceHeating(String spaceHeating) {
        this.spaceHeating = spaceHeating;
    }

    public String getHousingComplexType() {
        return housingComplexType;
    }

    public void setHousingComplexType(String housingComplexType) {
        this.housingComplexType = housingComplexType;
    }

    public String getFurnitureWoodType() {
        return furnitureWoodType;
    }

    public void setFurnitureWoodType(String furnitureWoodType) {
        this.furnitureWoodType = furnitureWoodType;
    }

    public String getInteriorThemeType() {
        return interiorThemeType;
    }

    public void setInteriorThemeType(String interiorThemeType) {
        this.interiorThemeType = interiorThemeType;
    }

    @Override
    public String toString() {
        return Integer.toString(customizeProductId);

    }

}
