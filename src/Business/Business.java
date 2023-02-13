/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Customer.CustomerDirectory;
import Restaurant.DeliveryAgentDirectory;
import Services.MasterOrderDirectory;

/**
 *
 * @author caofei
 */
public class Business {
    private UserAccountDirectory useraccountDirectory;
    private CustomerDirectory customerDirectory;
    private DeliveryAgentDirectory deliveryAgentDirectory;
    private MasterOrderDirectory allorders;
    
    public Business() {
        this.useraccountDirectory=new UserAccountDirectory();
        this.customerDirectory=new CustomerDirectory();
        this.allorders=new MasterOrderDirectory();
        this.deliveryAgentDirectory=new DeliveryAgentDirectory();
        
        UserAccount user=this.useraccountDirectory.createUserAccount("admin","admin","manager");
    }
    
    public static Business getBusinessInstance() {
        
        return new Business();
    }

    public UserAccountDirectory getUseraccountDirectory() {
        return useraccountDirectory;
    }

    public void setUseraccountDirectory(UserAccountDirectory useraccountDirectory) {
        this.useraccountDirectory = useraccountDirectory;
    }

    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(CustomerDirectory customerDirectory) {
        this.customerDirectory = customerDirectory;
    }

    public DeliveryAgentDirectory getDeliveryAgentDirectory() {
        return deliveryAgentDirectory;
    }

    public void setDeliveryAgentDirectory(DeliveryAgentDirectory deliveryAgentDirectory) {
        this.deliveryAgentDirectory = deliveryAgentDirectory;
    }

    public MasterOrderDirectory getAllorders() {
        return allorders;
    }

    public void setAllorders(MasterOrderDirectory allorders) {
        this.allorders = allorders;
    }

//    public UserAccount getUser() {
//        return user;
//    }
//
//    public void setUser(UserAccount user) {
//        this.user = user;
//    }
    
    
}
