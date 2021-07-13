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
public class SelfDesignedOrderItem {

    private float Price;
    private CustomerApartment customizeProduct;
    private int orderItemId;
    private static int count = 0;

    public SelfDesignedOrderItem() {
        customizeProduct = new CustomerApartment();
        count++;
        orderItemId = count;
    }

    public float getPrice() {
        return Price;
    }

    public void setPrice(float Price) {
        this.Price = Price;
    }

    public CustomerApartment getCustomizeProduct() {
        return customizeProduct;
    }

    public void setCustomizeProduct(CustomerApartment customizeProduct) {
        this.customizeProduct = customizeProduct;
    }

    public void setOrderItemId(int orderItemId) {
        this.orderItemId = orderItemId;
    }

    
    @Override
    public String toString() {
        return Integer.toString(this.orderItemId);
    }
}
