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
public class ApartmentOrderItem {

    private RealtorApartment realtorApartment;
    private int orderItemId;
    private static int count = 0;

    public ApartmentOrderItem() {
        realtorApartment = new RealtorApartment();
        count++;
        orderItemId = count;
    }

    public RealtorApartment getRealtorApartment() {
        return realtorApartment;
    }

    public void setRealtorApartment(RealtorApartment realtorApartment) {
        this.realtorApartment = realtorApartment;
    }

    public int getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(int orderItemId) {
        this.orderItemId = orderItemId;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        ApartmentOrderItem.count = count;
    }

    @Override
    public String toString() {
        return Integer.toString(this.orderItemId);
    }
}
