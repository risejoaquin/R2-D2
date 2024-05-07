/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.r2d2.entities;

import java.util.Date;
import java.util.List;


/**
 *
 * @author compu
 */
public class Ticket {

    /**
     * @return the client
     */
    public Client getClient() {
        return client;
    }

    /**
     * @param client the client to set
     */
    public void setClient(Client client) {
        this.client = client;
    }

    /**
     * @return the delivery
     */
    public Delivery getDelivery() {
        return delivery;
    }

    /**
     * @param delivery the delivery to set
     */
    public void setDelivery(Delivery delivery) {
        this.delivery = delivery;
    }

    /**
     * @return the product
     */
    public List<Product> getProduct() {
        return product;
    }

    /**
     * @param product the product to set
     */
    public void setProduct(List<Product> product) {
        this.product = product;
    }

    /**
     * @return the dateOrder
     */
    public Date getDateOrder() {
        return dateOrder;
    }

    /**
     * @param dateOrder the dateOrder to set
     */
    public void setDateOrder(Date dateOrder) {
        this.dateOrder = dateOrder;
    }

    /**
     * @return the dateDelivery
     */
    public Date getDateDelivery() {
        return dateDelivery;
    }

    /**
     * @param dateDelivery the dateDelivery to set
     */
    public void setDateDelivery(Date dateDelivery) {
        this.dateDelivery = dateDelivery;
    }
   
    private Client client;
    private Delivery delivery;
    private List<Product> product;
    private Date dateOrder;
    private Date dateDelivery;
    
}
