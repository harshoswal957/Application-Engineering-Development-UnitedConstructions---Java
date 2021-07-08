/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.role;

import business.ecosystem.Ecosystem;
import business.enterprise.Enterprise;
import business.organization.Organization;
import business.useraccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author Harsh
 */
public abstract class Role {

    public enum RoleType {
        Admin("Admin"),
        ArchitectStaff("Architect Staff"),
        LabourStaff("Labour Staff"),
        InventoryStaff("Inventory Staff"),
        Customer("Customer Staff"),
        RealtorPropertyManager("Realtor Property Manager"),
        RealtorStaff("Realtor Staff"),
        ReportingStaff("Reporting Staff"),
        EnergyRegulatoryCommissionStaff("Energy Regulatory Commission Staff");

        private String value;

        private RoleType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public abstract JPanel createWorkArea(JPanel userProcessContainer,
            UserAccount account,
            Organization organization,
            Enterprise enterprise,
            Ecosystem business);

    @Override
    public String toString() {
        return this.getClass().getName();
    }

}
