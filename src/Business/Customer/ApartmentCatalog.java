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
public class ApartmentCatalog {

    private ArrayList<RealtorApartment> listOfRealtorApartments;

    public ApartmentCatalog() {
        listOfRealtorApartments = new ArrayList<>();
    }

    public ArrayList<RealtorApartment> getListOfRealtorApartments() {
        return listOfRealtorApartments;
    }

    public void setListOfRealtorApartments(ArrayList<RealtorApartment> listOfRealtorApartments) {
        this.listOfRealtorApartments = listOfRealtorApartments;
    }

    public RealtorApartment addRealtorApartment() {
        RealtorApartment apt = new RealtorApartment();
        listOfRealtorApartments.add(apt);
        return apt;
    }

    public void removeRealtorApartment(RealtorApartment realtorApartment) {
        listOfRealtorApartments.remove(realtorApartment);
    }

}
