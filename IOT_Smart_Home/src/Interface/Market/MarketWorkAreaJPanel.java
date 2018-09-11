/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Market;

import Business.Ecosystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Organisation.DeliveryOrganisation;
import Business.Organisation.Grocery.GroceryOrganisation;
import Business.Organisation.Grocery.GroceryProduct;
import Business.Organisation.Organisation;
import Business.Organisation.RetailerOrganisation;
import Business.UserAccount.UserAccount;
import Business.Utility.Wallet;
import Business.WorkQueue.DeliverWorkRequest;
import Business.WorkQueue.WorkRequest;
import Interface.Customer.WalletDetailsJPanel;
import java.awt.CardLayout;
import java.util.Date;
import javax.swing.JPanel;

/**
 *
 * @author ajaygoel
 */
public class MarketWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form MarketWorkAreaJPanel
     */
    
    JPanel userProcessContainer;
    UserAccount account;
    GroceryOrganisation organization;
    Enterprise enterprise;
    Ecosystem business;
    Organisation organisation1;
    RetailerOrganisation retailerOrganisation;
    GroceryOrganisation grocery;

    public MarketWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, GroceryOrganisation organization, Enterprise enterprise, Ecosystem business) {
            initComponents();
            this.userProcessContainer=userProcessContainer;
            this.account=account;
            this.organization= organization;
            this.business=business;
            this.enterprise=enterprise;
            
            nameTxtField.setText(account.getEmployee().getName());
            
            for(Organisation or:enterprise.getOrganisationDirectory().getOrganizationlist())
            {
                for(UserAccount ua:or.getUserAccountDir().getUserAccountDirectory())
                {
                    if(account.getUserName().equals(ua.getUserName()))
                    {
                        organisation1=or;
                    }
                }
                
                if(or instanceof RetailerOrganisation)
                {
                    retailerOrganisation=(RetailerOrganisation) or;
                }
                if(or instanceof GroceryOrganisation)
                {
                    grocery=(GroceryOrganisation) or;
                }
                
            }
            
     send_auto_refill_request();       
            
    }

    public void send_auto_refill_request()
    {
                 ////////////////////////////Generating automatic requests for retailer/////////////////////////
                    for(GroceryProduct gp:organization.getGroceryProductDirectory())
                    {
                        if(gp.getAvail()<10)
                        {
                            
                            for(Employee empl : organization.getEmpList().getEmployeeDirectory())
                            {
                                if(empl.getRole().toString().equals("GroceryRole"))
                                {
                                    
                                    DeliverWorkRequest req = new DeliverWorkRequest();
                                    req.setMessage("Automatically generated for Retailer");
                                    req.setSender(empl.getEmpUserAcc());
                                    req.setStatus("Automatically generated for Retailer");
                                    req.setGroceryProduct(gp);
                                    Date date = new Date(); 
                                    req.setRequestDate(date);
                                    
                                    RetailerOrganisation ro=new RetailerOrganisation();
                                    ro=retailerOrganisation;
                                    
                                    if (ro != null)
                                    {
                                        ro.getWorkQueue().getReqList().add(req);
                                        account.getWorkQueue().getReqList().add(req);
                                        grocery.getWorkQueue().getReqList().add(req);
//                                        for(WorkRequest wr1:ro.getWorkQueue().getReqList())
//                                        {
//                                            if(wr1.getGroceryProduct().getProdName()==gp.getProdName() && wr1.getResolveDate()!=null)
//                                            {
//                                                
//                                            }
//                                            else
//                                            {
//                                                return;
//                                            }
//                                        }
                                        
                                        //g.getWorkQueue().getReqList().add(request);
                                        
                        
                                    }
                                    
                                }
                                
                                
                                    
                            }
                            
                            
                        }
                    }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        manageProducts = new javax.swing.JButton();
        ManageOrdersBtn = new javax.swing.JButton();
        ManageSupAccountsJPanel = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        nameTxtField = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 153, 0));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Market Work Area");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(301, 10, -1, -1));

        manageProducts.setText("Manage Products");
        manageProducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageProductsActionPerformed(evt);
            }
        });
        add(manageProducts, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 42, 290, -1));

        ManageOrdersBtn.setText("Manage Orders");
        ManageOrdersBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageOrdersBtnActionPerformed(evt);
            }
        });
        add(ManageOrdersBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 83, 290, -1));

        ManageSupAccountsJPanel.setText("Manage Retailer Automatic Requests");
        ManageSupAccountsJPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageSupAccountsJPanelActionPerformed(evt);
            }
        });
        add(ManageSupAccountsJPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 124, 290, -1));

        jButton1.setText("Market Wallet ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 168, 290, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Welcome !");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));
        add(nameTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 10, 120, -1));

        jButton2.setText("Analytics");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 209, 290, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/market.jpg"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void manageProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageProductsActionPerformed
        // TODO add your handling code here:
        Interface.Market.ManageProductsJPanel mpjp = new Interface.Market.ManageProductsJPanel(userProcessContainer,account,organisation1,enterprise,business);
        userProcessContainer.add("ManageProductsJPanel",mpjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageProductsActionPerformed

    private void ManageOrdersBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageOrdersBtnActionPerformed
        // TODO add your handling code here:
        Interface.Market.ManageOrdersJPanel immojp = new Interface.Market.ManageOrdersJPanel(userProcessContainer,account,organisation1,enterprise,business);
        userProcessContainer.add("ManageOrdersJPanel",immojp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_ManageOrdersBtnActionPerformed

    private void ManageSupAccountsJPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageSupAccountsJPanelActionPerformed
        // TODO add your handling code here:

        Interface.Market.ManageGroceryEmployeesJPanel immgejp = new Interface.Market.ManageGroceryEmployeesJPanel(userProcessContainer,account,organization,enterprise,business,retailerOrganisation);
        userProcessContainer.add("ManageGroceryEmployeesJPanel",immgejp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_ManageSupAccountsJPanelActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        Wallet wallet= grocery.getWalletObj();
        String name= grocery.getOrgName().toString();
        MarketWalletDetails mwdjp = new MarketWalletDetails(name, wallet, userProcessContainer);
        userProcessContainer.add("mwdjp", mwdjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        Interface.Market.AnalyticsJPanel immajppp = new Interface.Market.AnalyticsJPanel(userProcessContainer,account,grocery,enterprise,business,retailerOrganisation);
        userProcessContainer.add("AnalyticsJPanel",immajppp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
        
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ManageOrdersBtn;
    private javax.swing.JButton ManageSupAccountsJPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton manageProducts;
    private javax.swing.JTextField nameTxtField;
    // End of variables declaration//GEN-END:variables
}
