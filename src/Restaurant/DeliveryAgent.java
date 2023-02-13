/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Restaurant;

import Personnel.Person;
import Services.Order;
import java.util.ArrayList;

/**
 *
 * @author caofei
 */
public class DeliveryAgent extends Person{
    private int ordercount;
    
    private ArrayList<Order> agentOrderList;
    
    public DeliveryAgent() {
        super();
        this.agentOrderList = new ArrayList<Order>();
    }

    public int getOrdercount() {
        return ordercount;
    }

    public void setOrdercount(int ordercount) {
        this.ordercount = ordercount;
    }

    public ArrayList<Order> getAgentOrderList() {
        return agentOrderList;
    }

    public void setAgentOrderList(ArrayList<Order> agentOrderList) {
        this.agentOrderList = agentOrderList;
    }
    
    public void addDeliveryOrder(Order o) {
        this.agentOrderList.add(o);
    }
    
}
