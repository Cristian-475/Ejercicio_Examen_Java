/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen_progra_ll;

public class Order {
     private int orderid;
    private String dateCreated;
    private String dateShipped;
    private String CustomerName;
    private String CustomerID;
    private String status;
    private String shippingID;

    private Customer customer;
    
    public Order(int orderid, String dateCreated, String dateShipped, String CustomerName, String CustomerID, String status, String shippingID) {
        this.orderid = orderid;
        this.dateCreated = dateCreated;
        this.dateShipped = dateShipped;
        this.CustomerName = CustomerName;
        this.CustomerID = CustomerID;
        this.status = status;
        this.shippingID = shippingID;
    }
    
    
    
    public void placeOrder()
    {
        
    }
    
}
