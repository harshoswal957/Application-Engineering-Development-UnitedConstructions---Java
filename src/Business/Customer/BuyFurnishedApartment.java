/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import business.person.Person;
import java.util.ArrayList;

/**
 *
 * @author Harsh
 */
public class BuyFurnishedApartment {

    private ArrayList<ApartmentOrderItem> listOfApartmentOrders;
    private Person customer;
    private int orderNumber;
    private static int count = 0;

    public BuyFurnishedApartment() {
        count++;
        orderNumber = count;
        listOfApartmentOrders = new ArrayList<>();
    }

    public ArrayList<ApartmentOrderItem> getListOfApartmentOrders() {
        return listOfApartmentOrders;
    }

    public void setListOfApartmentOrders(ArrayList<ApartmentOrderItem> listOfApartmentOrders) {
        this.listOfApartmentOrders = listOfApartmentOrders;
    }

    public Person getCustomer() {
        return customer;
    }

    public void setCustomer(Person customer) {
        this.customer = customer;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        BuyFurnishedApartment.count = count;
    }

    public ApartmentOrderItem addApartmentOrderItem() {
        ApartmentOrderItem aoi = new ApartmentOrderItem();
        listOfApartmentOrders.add(aoi);
        return aoi;
    }

    public void removeApartmentOrderItem(ApartmentOrderItem aoi) {
        listOfApartmentOrders.remove(aoi);
    }

    public String toString() {
        return Integer.toString(this.orderNumber);
    }
}
