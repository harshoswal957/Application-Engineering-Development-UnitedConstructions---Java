/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.workqueue;

import Business.Customer.BuyFurnishedApartment;

/**
 *
 * @author Harsh
 */
public class BuyFurnishedApartmentWorkRequest extends WorkRequest {

    public BuyFurnishedApartmentWorkRequest() {
        super(WorkRequest.WorkRequestType.BuyFurnishedApartment.getValue());
    }
    private BuyFurnishedApartment orderFurnishedApt;

    public BuyFurnishedApartment getOrderFurnishedApt() {
        return orderFurnishedApt;
    }

    public void setOrderFurnishedApt(BuyFurnishedApartment orderFurnishedApt) {
        this.orderFurnishedApt = orderFurnishedApt;
    }

    @Override
    public String toString() {
        return Integer.toString(orderFurnishedApt.getOrderNumber());
    }

}
