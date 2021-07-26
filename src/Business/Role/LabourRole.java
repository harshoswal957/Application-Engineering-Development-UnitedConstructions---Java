/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.role;

import business.ecosystem.Ecosystem;
import business.enterprise.UnitedConstructionEnterprise;
import business.enterprise.Enterprise;
import business.organization.LabourOrganization;
import business.organization.Organization;
import business.useraccount.UserAccount;
import javax.swing.JPanel;
import userinterface.LabourRole.LabourWorkAreaManangementJPanel;

/**
 *
 * @author Harsh
 */
public class LabourRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Ecosystem business) {
        return new LabourWorkAreaManangementJPanel(userProcessContainer, account, (LabourOrganization) organization, (UnitedConstructionEnterprise) enterprise, business);
    }

    @Override
    public String toString() {
        return "Labour"; //To change body of generated methods, choose Tools | Templates.
    }
}
