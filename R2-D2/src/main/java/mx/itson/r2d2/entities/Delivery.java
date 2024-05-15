/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.r2d2.entities;

import java.util.Date;

/**
 * Represents a delivery entity with order and delivery information.
 * This class provides methods to set and get delivery data.
 * 
 * @author compu
 */
public class Delivery {

    /**
     * Retrieves the order date of the delivery.
     * 
     * @return the orderDate
     */
    public Date getOrderDate() {
        return orderDate;
    }

    /**
     * Sets the order date of the delivery.
     * 
     * @param orderDate the orderDate to set
     */
    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    /**
     * Retrieves the delivery date of the delivery.
     * 
     * @return the deliveryDate
     */
    public Date getDeliveryDate() {
        return deliveryDate;
    }

    /**
     * Sets the delivery date of the delivery.
     * 
     * @param deliveryDate the deliveryDate to set
     */
    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    /**
     * Retrieves the delivery status of the delivery.
     * 
     * @return the deliveryStatus
     */
    public String getDeliveryStatus() {
        return deliveryStatus;
    }

    /**
     * Sets the delivery status of the delivery.
     * 
     * @param deliveryStatus the deliveryStatus to set
     */
    public void setDeliveryStatus(String deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }

    private Date orderDate;
    private Date deliveryDate;
    private String deliveryStatus;
}