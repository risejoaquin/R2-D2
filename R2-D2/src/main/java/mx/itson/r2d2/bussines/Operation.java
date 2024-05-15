/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.r2d2.bussines;

/**
 * Represents operations related to business logic.
 * 
 * @author compu
 */
public class Operation {

    /**
     * Calculates the value of the IVA (Value Added Tax) based on the given amount and rate.
     * 
     * @param a the amount
     * @param b the rate
     * @return the calculated IVA value
     */
    public static double calcIva(double a, double b) {
        return (a * (b / 100));
    }
    
    /**
     * Calculates the shipping cost based on the given subtotal and rate.
     * 
     * @param b the subtotal
     * @param c the rate
     * @return the calculated shipping cost
     */
    public double calcShipping(double b, double c) {
        return (b * c);
    }
}