/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.r2d2.entities;


/**
 * Represents a client entity with basic information.
 * This class provides methods to set and get client data.
 * 
 * @author compu
 */
public class Client {

    /**
     * Retrieves the email of the client.
     * 
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the email of the client.
     * 
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Retrieves the name of the client.
     * 
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the client.
     * 
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Retrieves the address of the client.
     * 
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the address of the client.
     * 
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Retrieves the phone number of the client.
     * 
     * @return the phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the phone number of the client.
     * 
     * @param phoneNumber the phoneNumber to set
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Retrieves the width of the client.
     * 
     * @return the width
     **/
    public int getWidth() {
        return width;
    }

    /**
     * Sets the width of the client.
     * 
     * @param width the width to set
     */
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * Retrieves the length of the client.
     * 
     * @return the length
     */
    public int getLength() {
        return length;
    }

    /**
     * Sets the length of the client.
     * 
     * @param length the length to set
     */
    public void setLength(int length) {
        this.length = length;
    }
    
    private String name;
    private String address;
    private String phoneNumber;
    private String email;
    private int width;
    private int length;
    
    
}