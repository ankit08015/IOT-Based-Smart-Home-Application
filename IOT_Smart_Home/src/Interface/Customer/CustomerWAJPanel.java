/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Customer;

import Business.Customer.Customer;
import Business.Customer.Product;
import Business.Ecosystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import static Business.Enterprise.Enterprise.EnterpriseType.Society;
import Business.Network.Network;
import Business.Organisation.DeliveryOrganisation;
import Business.Organisation.ElectricityOrganisation;
import Business.Organisation.Grocery.GroceryOrganisation;
import Business.Organisation.Grocery.GroceryProduct;
import Business.Organisation.MarketOrganisation;
import Business.Organisation.Organisation;
import Business.Organisation.RetailerOrganisation;
import Business.Organisation.WaterOrganisation;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import Business.Utility.Wallet;
import Business.WorkQueue.DeliverWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;

/**
 *
 * @author ajaygoel
 */
public class CustomerWAJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CustomerWAJPanel
     */
    JPanel userProcessContainer;
    UserAccount account;
    Enterprise enterprise;
    Ecosystem business;
    GroceryOrganisation groceryOrganisation;
    Customer customer;
    ElectricityOrganisation electricityOrganisation;
    WaterOrganisation waterOrganisation;

//
//
//    public CustomerWAJPanel(JPanel userProcessContainer, UserAccount account, Organisation organization, Enterprise enterprise, Ecosystem business) {
//        initComponents();
//        this.userProcessContainer=userProcessContainer;
//        this.account=account;
//        this.business=business;
//        this.enterprise=enterprise;
//        //this.groceryOrganisation=(GroceryOrganisation) organization;
//        
////        for(Organisation or:enterprise.getOrganisationDirectory().getOrganizationlist())
////            {
////                for(UserAccount ua:or.getUserAccountDir().getUserAccountDirectory())
////                {
////                        groceryOrganisation=(GroceryOrganisation) or;
////                }
////                
////            }
//        
//        //for(Customer c:business.getCustDir().getCustList())
//        for(Network n: business.getNetworkDirectory())
//        {
//            for(Customer c: n.getCustomerDirectory().getCustList())
//            {
//                if(account.equals(c.getUserAcc()))
//                {
//                    customer=c;
//                    break;
//                }
//            Cus_nameTxtField.setText(customer.getFirst_name()+" "+ customer.getLast_name());
//            }
//        }
//        
//        
//        for(Organisation o:enterprise.getOrganisationDirectory().getOrganizationlist())
//        {
//            if(o instanceof GroceryOrganisation)
//            {
//                o=groceryOrganisation;
//                break;
//                
//            }
//        }
//        
//        
//        
//    }
    public CustomerWAJPanel(JPanel userProcessContainer, Ecosystem business, UserAccount userAccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = userAccount;
        this.business = business;
        

        
        for (Network n1 : business.getNetworkDirectory()) {
            for (Enterprise e1 : n1.getEnterpriseDirectory().getEnterpriseList()) {
                enterprise=e1;
                for (Customer c1 : n1.getCustomerDirectory().getCustList()) {
                    if (c1.getUserAcc().equals(userAccount)) {
                        for (Organisation o : e1.getOrganisationDirectory().getOrganizationlist()) {
                            if (o instanceof GroceryOrganisation) {
                                groceryOrganisation = (GroceryOrganisation) o;
                                //break;

                            }
                        }

                    }

                }

            }

        }

        for (Network n : business.getNetworkDirectory()) {
            for (Customer c : n.getCustomerDirectory().getCustList()) {
                if (account.equals(c.getUserAcc())) {
                    customer = c;
                    Cus_nameTxtField.setText(customer.getFirst_name() + " " + customer.getLast_name());
                    break;
                }

            }
        }
////////////////////////////////////////AUTOMATIC REQUEST/////////////////////////////////////////////////////////
//        if (customer.getProdList() != null) {
//            //for (Product pp : customer.getProdList()) 
//            for (int i = 0; i < customer.getProdList().size() - 1; i++) {
//                Product pp = customer.getProdList().get(i);
//                java.util.Random x = new java.util.Random();
//                int n = 1 + x.nextInt(pp.getProductQuant());
//                System.out.println(n);
//                pp.setQuantity_left(n);
//                if (n > pp.getThreshold()) {
//                    return;
//                } else {
//                    Product p2 = customer.addProduct();
//                    p2.setName(pp.getName());
//                    p2.setPrice(pp.getPrice());
//                    p2.setProductQuant(pp.getProductQuant());
//                    p2.setThreshold(pp.getThreshold());
//                    p2.setOrder_status("Pending at Grocery Market");
//                    p2.setAvail(pp.getAvail());
//                    p2.setProdName(pp.getProdName());
//
//                    DeliverWorkRequest request = new DeliverWorkRequest();
//                    request.setMessage("Automatically generated");
//                    request.setSender(account);
//                    request.setStatus("Automatically sent");
//                    request.setProduct(pp);
//                    request.setCust(customer);
//                    GroceryOrganisation g = new GroceryOrganisation();
//                    g = groceryOrganisation;
//
//                    if (g != null) {
//                        g.getWorkQueue().getReqList().add(request);
//                        account.getWorkQueue().getReqList().add(request);
//                    }
//
//                }
//
//            }
//
//        }

//////// what will happen is it will take 1st product and send request according to the quantity and if the next product is same then it will not send any request
///////  if it is not same then it will send request.
//        if (customer.getProdList() != null) {
//            //for (Product pp : customer.getProdList()) 
//            for (int i = 0; i < customer.getProdList().size() - 1; i++) {
//                Product pp = customer.getProdList().get(i);
//                java.util.Random x = new java.util.Random();
//                int n = 1 + x.nextInt(pp.getProductQuant());
//                System.out.println(n);
//                pp.setQuantity_left(n);
//                if (n > pp.getThreshold()) {
//                    return;
//                } else {
//                    Product p2 = customer.addProduct();
//                    p2.setName(pp.getName());
//                    p2.setPrice(pp.getPrice());
//                    p2.setProductQuant(pp.getProductQuant());
//                    p2.setThreshold(pp.getThreshold());
//                    p2.setOrder_status("Automatically generated at grocery");
//                    p2.setAvail(pp.getAvail());
//                    p2.setProdName(pp.getProdName());
//
//                    DeliverWorkRequest request = new DeliverWorkRequest();
//                    request.setMessage("Automatically generated");
//                    request.setSender(account);
//                    request.setStatus("Automatically generated");
//                    request.setProduct(pp);
//                    request.setCust(customer);
//                    GroceryOrganisation g = new GroceryOrganisation();
//                    g = groceryOrganisation;
//
//                    if (g != null) {
//                        g.getWorkQueue().getReqList().add(request);
//                        account.getWorkQueue().getReqList().add(request);
//
//                    }
//
//                    for (int j = i + 1; j < customer.getProdList().size(); j++) {
//                        if (!customer.getProdList().get(i).getName().equals(customer.getProdList().get(j).getName())) {
//                            break;
//
//                        } else {
//                            i = i + 1;
//                        }
//                    }
//
//                }
//
//            }
//
//        }


showJBadgeButton();
populateComboBox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    public void populateComboBox(){
        String [] names={"Pay/View Bills", "Electricity Bills", "Water Bills"};
        
        govtOptionJVomboBox.removeAllItems();
        
        for(String str:names){
            govtOptionJVomboBox.addItem(str);
        }
    }
    public void showJBadgeButton(){
       // System.out.println(customer);
        String text = null;
         System.out.println("in exp not again "+customer.getNotification().getUnreadNotifications());
        try {
            text = Integer.toString(customer.getNotification().getUnreadNotifications());
                        System.out.println("in exp not "+text);

                notificationJBtn.setText(text);

        } catch (Exception e) {
            System.out.println("in exp");
                notificationJBtn.setText(text);

        }

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu2 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        ManageGroceriesJBtn = new javax.swing.JButton();
        analyticsJBtn = new javax.swing.JButton();
        Cus_nameTxtField = new javax.swing.JTextField();
        manageWalletJBtn = new javax.swing.JButton();
        notificationJBtn = new javax.swing.JButton();
        societyReqJBtn = new javax.swing.JButton();
        manageAccountJBtn = new javax.swing.JButton();
        govtOptionJVomboBox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

        jMenu2.setText("jMenu2");

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Welcome !");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 16, -1, -1));

        ManageGroceriesJBtn.setBackground(new java.awt.Color(255, 255, 255));
        ManageGroceriesJBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ManageGroceriesJBtn.setText("Manage Groceries");
        ManageGroceriesJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageGroceriesJBtnActionPerformed(evt);
            }
        });
        add(ManageGroceriesJBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 68, 250, -1));

        analyticsJBtn.setBackground(new java.awt.Color(255, 255, 255));
        analyticsJBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        analyticsJBtn.setText("Analytics ");
        analyticsJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                analyticsJBtnActionPerformed(evt);
            }
        });
        add(analyticsJBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 250, -1));

        Cus_nameTxtField.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        add(Cus_nameTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 11, 171, -1));

        manageWalletJBtn.setBackground(new java.awt.Color(255, 255, 255));
        manageWalletJBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        manageWalletJBtn.setText("Manage Wallet");
        manageWalletJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageWalletJBtnActionPerformed(evt);
            }
        });
        add(manageWalletJBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 250, -1));

        notificationJBtn.setBackground(new java.awt.Color(255, 255, 255));
        notificationJBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        notificationJBtn.setForeground(new java.awt.Color(204, 0, 0));
        notificationJBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/badge-small.png"))); // NOI18N
        notificationJBtn.setToolTipText("");
        notificationJBtn.setBorderPainted(false);
        notificationJBtn.setOpaque(false);
        notificationJBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                notificationJBtnMouseEntered(evt);
            }
        });
        notificationJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notificationJBtnActionPerformed(evt);
            }
        });
        add(notificationJBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 10, 100, 50));

        societyReqJBtn.setBackground(new java.awt.Color(255, 255, 255));
        societyReqJBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        societyReqJBtn.setText("Manage Requests to Society");
        societyReqJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                societyReqJBtnActionPerformed(evt);
            }
        });
        add(societyReqJBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 115, 250, -1));

        manageAccountJBtn.setBackground(new java.awt.Color(255, 255, 255));
        manageAccountJBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/accounts.png"))); // NOI18N
        manageAccountJBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                manageAccountJBtnMouseEntered(evt);
            }
        });
        manageAccountJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageAccountJBtnActionPerformed(evt);
            }
        });
        add(manageAccountJBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 10, 90, 50));

        govtOptionJVomboBox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        govtOptionJVomboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                govtOptionJVomboBoxActionPerformed(evt);
            }
        });
        add(govtOptionJVomboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 10, 250, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/smart-home.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1490, 870));
    }// </editor-fold>//GEN-END:initComponents

    private void ManageGroceriesJBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageGroceriesJBtnActionPerformed
        // TODO add your handling code here:
        Interface.Customer.CustomerGroceriesWA1JPanel iccgwajp = new Interface.Customer.CustomerGroceriesWA1JPanel(userProcessContainer, enterprise, business, groceryOrganisation, customer, account);
        userProcessContainer.add("CustomeWAJPanel", iccgwajp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_ManageGroceriesJBtnActionPerformed

    private void societyReqJBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_societyReqJBtnActionPerformed
        // TODO add your handling code here:
        Network n = customer.getNetworkName();
        System.out.println("networkis: " + n.getName());
        for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
            if (e.getEnterpriseType().equals(Society)) {
                enterprise = e;
            }
        }

        System.out.println("enterprise: " + enterprise);

        CustomerSocieryInteractionJPanel iccgwajp = new CustomerSocieryInteractionJPanel(userProcessContainer, enterprise, business, customer, account);
        userProcessContainer.add("CustomerSocieryInteractionJPanel", iccgwajp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_societyReqJBtnActionPerformed

    private void manageAccountJBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageAccountJBtnActionPerformed
        // TODO add your handling code here:
        
        ManageCustomerAccountsJPanel mca = new ManageCustomerAccountsJPanel(userProcessContainer, enterprise, business, customer, account);
        userProcessContainer.add("ManageCustomerAccountsJPanel", mca);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
        
        
    }//GEN-LAST:event_manageAccountJBtnActionPerformed

    private void notificationJBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notificationJBtnActionPerformed
        // TODO add your handling code here:
        
        CustomerNotificationJPanel cnjp = new CustomerNotificationJPanel(userProcessContainer, enterprise, business, customer, account);
        userProcessContainer.add("CustomerNotificationJPanel", cnjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
        
    }//GEN-LAST:event_notificationJBtnActionPerformed

    private void analyticsJBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_analyticsJBtnActionPerformed
        // TODO add your handling code here:
        CustomerAnalyticsJPanel cajp = new CustomerAnalyticsJPanel(userProcessContainer, enterprise, business, customer, account);
        userProcessContainer.add("CustomerAnalyticsJPanel", cajp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_analyticsJBtnActionPerformed

    private void manageWalletJBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageWalletJBtnActionPerformed
        // TODO add your handling code here:
        
        Wallet wallet= customer.getWalletObj();
        String name= customer.toString();
         WalletDetailsJPanel cajp = new WalletDetailsJPanel(name, wallet, userProcessContainer);
        userProcessContainer.add("WalletDetailsJPanel", cajp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageWalletJBtnActionPerformed

    private void notificationJBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_notificationJBtnMouseEntered
        // TODO add your handling code here:
                notificationJBtn.setToolTipText("View Notifications");

    }//GEN-LAST:event_notificationJBtnMouseEntered

    private void manageAccountJBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageAccountJBtnMouseEntered
        // TODO add your handling code here:
        manageAccountJBtn.setToolTipText("Manage User Account");
    }//GEN-LAST:event_manageAccountJBtnMouseEntered

    private void govtOptionJVomboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_govtOptionJVomboBoxActionPerformed
        // TODO add your handling code here:
        String name = (String) govtOptionJVomboBox.getSelectedItem();
        if(name==null)return;

        if (name.equals("Electricity Bills")) {
            Interface.Customer.ViewElectricityBillsJPanel iccgwajp = new Interface.Customer.ViewElectricityBillsJPanel(userProcessContainer, enterprise, business, electricityOrganisation, customer, account);
            userProcessContainer.add("ViewElectricityBillsJPanel", iccgwajp);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);

        } else if (name.equals("Water Bills")) {
            Interface.Customer.ManageWaterBillsJPanel ii = new Interface.Customer.ManageWaterBillsJPanel(userProcessContainer, enterprise, business, waterOrganisation, customer, account);
            userProcessContainer.add("ManageWaterBillsJPanel", ii);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
        
    }//GEN-LAST:event_govtOptionJVomboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Cus_nameTxtField;
    private javax.swing.JButton ManageGroceriesJBtn;
    private javax.swing.JButton analyticsJBtn;
    private javax.swing.JComboBox<String> govtOptionJVomboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JButton manageAccountJBtn;
    private javax.swing.JButton manageWalletJBtn;
    private javax.swing.JButton notificationJBtn;
    private javax.swing.JButton societyReqJBtn;
    // End of variables declaration//GEN-END:variables
}
