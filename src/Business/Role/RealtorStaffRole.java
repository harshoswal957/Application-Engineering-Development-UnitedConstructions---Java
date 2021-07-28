/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.role;

import business.ecosystem.Ecosystem;
import business.enterprise.CustomerSupportEnterprise;
import business.enterprise.Enterprise;
import business.organization.Organization;
import business.organization.RealtorOrganization;
import business.useraccount.UserAccount;
import javax.swing.JPanel;
import userinterface.RealtorWorkArea.RealtorStaffWorkAreaManagement;

/**
 *
 * @author Harsh
 */
public class RealtorStaffRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Ecosystem business) {
        return new RealtorStaffWorkAreaManagement(userProcessContainer, account, (RealtorOrganization) organization, (CustomerSupportEnterprise) enterprise, business);
    }

    @Override
    public String toString() {
        return "Realtor"; //To change body of generated methods, choose Tools | Templates.
    }
}
