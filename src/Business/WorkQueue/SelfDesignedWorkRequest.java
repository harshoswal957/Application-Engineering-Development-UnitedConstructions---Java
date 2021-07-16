/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.workqueue;

import Business.Customer.SelfDesignedOrder;
import business.useraccount.UserAccount;

/**
 *
 * @author Harsh
 */
public class SelfDesignedWorkRequest extends WorkRequest {

    private SelfDesignedOrder order;
    private UserAccount customerSender;
    private UserAccount realtorReceiver;
    private UserAccount realtorSender;
    private UserAccount designerReceiver;
    private UserAccount designerSender;
    private UserAccount labourerReceiver;
    private UserAccount labourerSender;
    private UserAccount customerReceiver;

    public SelfDesignedWorkRequest() {
        super(WorkRequest.WorkRequestType.SelfDesigned.getValue());

    }

    public SelfDesignedOrder getOrder() {
        return order;
    }

    public void setOrder(SelfDesignedOrder order) {
        this.order = order;
    }

    public UserAccount getCustomerSender() {
        return customerSender;
    }

    public void setCustomerSender(UserAccount customerSender) {
        this.customerSender = customerSender;
    }

    public UserAccount getRealtorReceiver() {
        return realtorReceiver;
    }

    public void setRealtorReceiver(UserAccount realtorReceiver) {
        this.realtorReceiver = realtorReceiver;
    }

    public UserAccount getRealtorSender() {
        return realtorSender;
    }

    public void setRealtorSender(UserAccount realtorSender) {
        this.realtorSender = realtorSender;
    }

    public UserAccount getDesignerReceiver() {
        return designerReceiver;
    }

    public void setDesignerReceiver(UserAccount designerReceiver) {
        this.designerReceiver = designerReceiver;
    }

    public UserAccount getDesignerSender() {
        return designerSender;
    }

    public void setDesignerSender(UserAccount designerSender) {
        this.designerSender = designerSender;
    }

    public UserAccount getLabourerReceiver() {
        return labourerReceiver;
    }

    public void setLabourerReceiver(UserAccount labourerReceiver) {
        this.labourerReceiver = labourerReceiver;
    }

    public UserAccount getLabourerSender() {
        return labourerSender;
    }

    public void setLabourerSender(UserAccount labourerSender) {
        this.labourerSender = labourerSender;
    }

    public UserAccount getCustomerReceiver() {
        return customerReceiver;
    }

    public void setCustomerReceiver(UserAccount customerReceiver) {
        this.customerReceiver = customerReceiver;
    }

    @Override
    public String toString() {
        return String.valueOf(this.order.getOrderNumber());
    }

}
