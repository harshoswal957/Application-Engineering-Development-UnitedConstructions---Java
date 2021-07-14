/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import java.util.ArrayList;

/**
 *
 * @author Harsh
 */
public class MasterOrderList {

    ArrayList<SelfDesignedOrder> listOfCustomisedOrders;
    ArrayList<BuyFurnishedApartment> listOfRealtorOrders;

    public MasterOrderList() {
        listOfCustomisedOrders = new ArrayList<>();
        listOfRealtorOrders = new ArrayList<>();
    }

    public ArrayList<SelfDesignedOrder> getListOfCustomisedOrders() {
        return listOfCustomisedOrders;
    }

    public void setListOfCustomisedOrders(ArrayList<SelfDesignedOrder> listOfCustomisedOrders) {
        this.listOfCustomisedOrders = listOfCustomisedOrders;
    }

    public ArrayList<BuyFurnishedApartment> getListOfRealtorOrders() {
        return listOfRealtorOrders;
    }

    public void setListOfRealtorOrders(ArrayList<BuyFurnishedApartment> listOfRealtorOrders) {
        this.listOfRealtorOrders = listOfRealtorOrders;
    }

    public SelfDesignedOrder addOrder() {
        SelfDesignedOrder order = new SelfDesignedOrder();
        listOfCustomisedOrders.add(order);
        return order;
    }

    public void addOrderFromInput(SelfDesignedOrder order) {
        listOfCustomisedOrders.add(order);
    }

    public void removeCustomisedOrder(SelfDesignedOrder order) {
        listOfCustomisedOrders.remove(order);
    }

    public BuyFurnishedApartment addOrderFurnishedApt() {
        BuyFurnishedApartment bfa = new BuyFurnishedApartment();
        listOfRealtorOrders.add(bfa);
        return bfa;
    }

    public void addRealtorOrder(BuyFurnishedApartment bfa) {
        listOfRealtorOrders.add(bfa);
    }

    public void removeOrderFurnishedApt(BuyFurnishedApartment bfa) {
        listOfRealtorOrders.remove(bfa);
    }

}
