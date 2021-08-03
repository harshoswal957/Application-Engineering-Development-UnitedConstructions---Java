/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.role;

import business.ecosystem.Ecosystem;

import business.enterprise.Enterprise;
import business.enterprise.RegulatoryEnterprise;
import business.organization.Organization;
import business.organization.EnergyRegulatoryCommissionOrganization;
import business.useraccount.UserAccount;
import javax.swing.JPanel;
import userinterface.EnergyRegulatoryCommission.EnergyRegulatoryCommissionWorkAreaJPanel;

/**
 *
 * @author Harsh
 */
public class EnergyRegulatoryCommissionStaffRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Ecosystem business) {
        return new EnergyRegulatoryCommissionWorkAreaJPanel(userProcessContainer, account, (EnergyRegulatoryCommissionOrganization) organization, (RegulatoryEnterprise) enterprise, business);
    }

    @Override
    public String toString() {
        return "Energy Regulatory Commission Staff"; //To change body of generated methods, choose Tools | Templates.
    }
}
