/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;

import Business.Customer.ApartmentCatalog;
import Business.Customer.MasterOrderList;
import business.role.Role;
import business.role.RealtorStaffRole;
import java.util.ArrayList;

/**
 *
 * @author Harsh
 */
public class RealtorOrganization extends Organization {

    private MasterOrderList mod;
    private ApartmentCatalog aptCatalog;

    public RealtorOrganization() {
        super(Organization.Type.Realtor.getValue());
        mod = new MasterOrderList();
        aptCatalog = new ApartmentCatalog();
    }

    public MasterOrderList getMod() {
        return mod;
    }

    public void setMod(MasterOrderList mod) {
        this.mod = mod;
    }

    public ApartmentCatalog getAptCatalog() {
        return aptCatalog;
    }

    public void setAptCatalog(ApartmentCatalog aptCatalog) {
        this.aptCatalog = aptCatalog;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new RealtorStaffRole());
        return roles;
    }
}
