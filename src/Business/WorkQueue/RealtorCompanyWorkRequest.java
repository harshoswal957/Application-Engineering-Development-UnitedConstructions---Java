/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.workqueue;

import Business.Customer.RealtorApartment;

/**
 *
 * @author Harsh
 */
public class RealtorCompanyWorkRequest extends WorkRequest {

    public RealtorCompanyWorkRequest() {
        super(WorkRequest.WorkRequestType.RealtorCompany.getValue());

    }
    private RealtorApartment realtorApartment;

    public RealtorApartment getRealtorApartment() {
        return realtorApartment;
    }

    public void setRealtorApartment(RealtorApartment realtorApartment) {
        this.realtorApartment = realtorApartment;
    }

    @Override
    public String toString() {
        return this.realtorApartment.toString();
    }

}
