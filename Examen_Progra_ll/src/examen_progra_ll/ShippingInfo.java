/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen_progra_ll;

/**
 *
 * @author Crist
 */
public class ShippingInfo {
    private int shippingID;
    private String shippingType;
    private int shippingRegionID;

    private Customer customer;
    
    public ShippingInfo(int shippingID, String shippingType, int shippingRegionID) {
        this.shippingID = shippingID;
        this.shippingType = shippingType;
        this.shippingRegionID = shippingRegionID;
    }
    
    public void updateShippingInfo()
    {
        
    }
    
}
