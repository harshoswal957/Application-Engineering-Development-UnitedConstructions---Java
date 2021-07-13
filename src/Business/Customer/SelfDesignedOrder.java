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
public class SelfDesignedOrder {

    private ArrayList<SelfDesignedOrderItem> orderItemList;
    private Person customer;
    private int orderNumber;
    private static int count;

    public SelfDesignedOrder() {
        count++;
        orderNumber = count;
        orderItemList = new ArrayList<>();
    }

    public ArrayList<SelfDesignedOrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(ArrayList<SelfDesignedOrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        SelfDesignedOrder.count = count;
    }

    public Person getCustomer() {
        return customer;
    }

    public void setCustomer(Person customer) {
        this.customer = customer;
    }

    public SelfDesignedOrderItem addCustomizedOrderItem() {
        SelfDesignedOrderItem co = new SelfDesignedOrderItem();
        orderItemList.add(co);
        return co;
    }

    public void removeOrderItem(SelfDesignedOrderItem aoi) {
        orderItemList.remove(aoi);
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    
    @Override
    public String toString() {
        return Integer.toString(orderNumber);
    }
}
