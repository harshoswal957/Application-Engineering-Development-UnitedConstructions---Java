/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;

import business.organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author Harsh
 */
public class OrganizationDirectory {

    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

    public Organization createOrganization(Type type) {
        Organization organization = null;
        if (type.getValue().equals(Type.Admin.getValue())) {
            organization = new AdminOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Layout.getValue())) {
            organization = new LayoutOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Labour.getValue())) {
            organization = new LabourOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Inventory.getValue())) {
            organization = new InventoryOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Customer.getValue())) {
            organization = new CustomerOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
}
