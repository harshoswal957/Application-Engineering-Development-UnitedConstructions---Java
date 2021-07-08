/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;

import business.role.ArchitectRole;
import business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author Harsh
 */
public class LayoutOrganization extends Organization {

    public LayoutOrganization() {
        super(Organization.Type.Layout.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new ArchitectRole());
        return roles;
    }
}
