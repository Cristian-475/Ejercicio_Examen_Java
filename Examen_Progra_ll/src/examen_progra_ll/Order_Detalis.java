/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen_progra_ll;

/**
 *
 * @author Crist
 */
public class Order_Detalis {
     private int orderID;
    private int productID;
    private String productName;
    private int Quantify;
    private float unitCoast;
    private float subCoast;

    private Customer customer;
    
    public Order_Detalis(int orderID, int productID, String productName, int Quantify, float unitCoast, float subCoast) {
        this.orderID = orderID;
        this.productID = productID;
        this.productName = productName;
        this.Quantify = Quantify;
        this.unitCoast = unitCoast;
        this.subCoast = subCoast;
    }
    
    
    
    public void calcPrice()
    {
        
    }
}
