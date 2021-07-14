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
public class RealtorApartment {
    private String apartmentType;
    private String housingComplexType;
    private int quantity;
    private static int count=0;
    private int realtorApartmentId;
    private float price;
    
    
    public RealtorApartment()
    {
        count++;
        realtorApartmentId=count;
    }

    public String getApartmentType() {
        return apartmentType;
    }

    public void setApartmentType(String apartmentType) {
        this.apartmentType = apartmentType;
    }

    public String getHousingComplexType() {
        return housingComplexType;
    }

    public void setHousingComplexType(String housingComplexType) {
        this.housingComplexType = housingComplexType;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        RealtorApartment.count = count;
    }

    public int getRealtorApartmentId() {
        return realtorApartmentId;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    @Override
    public String toString()
    {
        return Integer.toString(realtorApartmentId);
    }
}
