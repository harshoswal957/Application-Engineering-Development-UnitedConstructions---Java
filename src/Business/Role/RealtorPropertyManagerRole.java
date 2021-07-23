/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.role;

import business.ecosystem.Ecosystem;
import business.enterprise.RealtorEnterprise;
import business.enterprise.Enterprise;
import business.organization.Organization;
import business.organization.RealtorPropertyManagerOrganization;
import business.useraccount.UserAccount;
import javax.swing.JPanel;
import userinterface.RealtorPropertyManager.RealtorPropertyManagerWorkAreaManagementJPanel;

/**
 *
 * @author Harsh
 */
public class RealtorPropertyManagerRole extends Role {
    //
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Ecosystem business) {

        return new RealtorPropertyManagerWorkAreaManagementJPanel(userProcessContainer, account, (RealtorPropertyManagerOrganization) organization, (RealtorEnterprise) enterprise, business);

    }

    @Override
    public String toString() {
        return "Realtor Property Manager"; //To change body of generated methods, choose Tools | Templates.
    }
}
