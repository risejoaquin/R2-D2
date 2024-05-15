/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.r2d2.entities;

import com.google.gson.Gson;
import java.util.Date;
import java.util.List;


/**
 *
 * @author compu
 */
public class Ticket {

    /**
     * @return the store
     */
    public String getStore() {
        return store;
    }

    /**
     * @param store the store to set
     */
    public void setStore(String store) {
        this.store = store;
    }

    /**
     * @return the iva
     */
    public double getIva() {
        return iva;
    }

    /**
     * @param iva the iva to set
     */
    public void setIva(double iva) {
        this.iva = iva;
    }

    
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
   
    
    private String store;
    private Client client;
    private Delivery delivery;
    private List<Product> product;
    private Date dateOrder;
    private Date dateDelivery;
    private double iva;
    
    public Ticket deserializar(String json){
        Ticket ticket = new Ticket();
        try{
            ticket = new Gson().fromJson(json, Ticket.class);
            
        } catch(Exception ex){
            System.err.println("Ocurrio un error al deserializar" + ex.getMessage());
        }
        return ticket;
}}
