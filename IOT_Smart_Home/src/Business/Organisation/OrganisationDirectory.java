/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organisation;

import Business.Organisation.Grocery.GroceryOrganisation;
import Business.Organisation.Organisation;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author ajaygoel
 */
public class OrganisationDirectory {

    public ArrayList<Organisation> organisationlist;

    public OrganisationDirectory() {
        organisationlist = new ArrayList<>();
    }

    public ArrayList<Organisation> getOrganizationlist() {
        return organisationlist;
    }

    public Organisation createMarketOrganisation(Organisation.MarketType type) {
        Organisation organization = null;

        if (type.getValue().equals(Organisation.MarketType.DeliveryAdmin.getValue())) {
            for (Organisation org : organisationlist) {
                if (org instanceof DeliveryOrganisation) {
                    JOptionPane.showMessageDialog(null, "This organization is already added, please select another.", "Warning", JOptionPane.WARNING_MESSAGE);
                    return null;
                }
            }

            organization = new DeliveryOrganisation();
            organisationlist.add(organization);
        } else if (type.getValue().equals(Organisation.MarketType.MarketAdmin.getValue())) {
            for (Organisation org : organisationlist) {
                if (org instanceof GroceryOrganisation) {
                    JOptionPane.showMessageDialog(null, "This organization is already added, please select another.", "Warning", JOptionPane.WARNING_MESSAGE);
                    return null;
                }
            }
            organization = new GroceryOrganisation();
            organisationlist.add(organization);
        } else if (type.getValue().equals(Organisation.MarketType.RetailerAdmin.getValue())) {
            for (Organisation org : organisationlist) {
                if (org instanceof RetailerOrganisation) {
                    JOptionPane.showMessageDialog(null, "This organization is already added, please select another.", "Warning", JOptionPane.WARNING_MESSAGE);
                    return null;
                }
            }
            organization = new RetailerOrganisation();
            organisationlist.add(organization);
        }
        return organization;
    }

    public Organisation createSocietyOrganisation(Organisation.SocietyType type) {
        Organisation organization = null;

        if (type.getValue().equals(Organisation.SocietyType.EventAdmin.getValue())) {
            for (Organisation org : organisationlist) {
                if (org instanceof EventManagementOrganization) {
                    JOptionPane.showMessageDialog(null, "This organization is already added, please select another.", "Warning", JOptionPane.WARNING_MESSAGE);
                    return null;
                }
            }
            organization = new EventManagementOrganization();

        } else if (type.getValue().equals(Organisation.SocietyType.GarbageAdmin.getValue())) {
            for (Organisation org : organisationlist) {
                if (org instanceof GarbageOrganisation) {
                    JOptionPane.showMessageDialog(null, "This organization is already added, please select another.", "Warning", JOptionPane.WARNING_MESSAGE);
                    return null;
                }
            }
            organization = new GarbageOrganisation();

        } else if (type.getValue().equals(Organisation.SocietyType.MaintenanceAdmin.getValue())) {
            for (Organisation org : organisationlist) {
                if (org instanceof MaintenanceOrganisation) {
                    JOptionPane.showMessageDialog(null, "This organization is already added, please select another.", "Warning", JOptionPane.WARNING_MESSAGE);
                    return null;
                }
            }
            organization = new MaintenanceOrganisation();

        } else if (type.getValue().equals(Organisation.SocietyType.ParkingAdmin.getValue())) {
            for (Organisation org : organisationlist) {
                if (org instanceof ParkingOrganisation) {
                    JOptionPane.showMessageDialog(null, "This organization is already added, please select another.", "Warning", JOptionPane.WARNING_MESSAGE);
                    return null;
                }
            }

            organization = new ParkingOrganisation();

        }

        organisationlist.add(organization);
        return organization;
    }

    public Organisation createGovernmentOrganisation(Organisation.GovernmentType type) {
        Organisation organization = null;

        if (type.getValue().equals(Organisation.GovernmentType.ElectricityAdmin.getValue())) {
            for (Organisation org : organisationlist) {
                if (org instanceof ElectricityOrganisation) {
                    JOptionPane.showMessageDialog(null, "This organization is already added, please select another.", "Warning", JOptionPane.WARNING_MESSAGE);
                    return null;
                }
            }

            organization = new ElectricityOrganisation();
            organisationlist.add(organization);
        } else if (type.getValue().equals(Organisation.GovernmentType.WaterAdmin.getValue())) {
            for (Organisation org : organisationlist) {
                if (org instanceof WaterOrganisation) {
                    JOptionPane.showMessageDialog(null, "This organization is already added, please select another.", "Warning", JOptionPane.WARNING_MESSAGE);
                    return null;
                }
            }
            organization = new WaterOrganisation();
            organisationlist.add(organization);
        }
        return organization;
    }

    public Organisation createSecurityOrganisation(Organisation.SecurityType type) {
        Organisation organization = null;

        if (type.getValue().equals(Organisation.SecurityType.SecurityAdmin.getValue())) {
            for (Organisation org : organisationlist) {
                if (org instanceof SecurityOrganisation) {
                    JOptionPane.showMessageDialog(null, "This organization is already added, please select another.", "Warning", JOptionPane.WARNING_MESSAGE);
                    return null;
                }
            }
            organization = new SecurityOrganisation();
            organisationlist.add(organization);
        }
        return organization;
    }

}
