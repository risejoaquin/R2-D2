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
     * does the multiplicatin of 2 different values
     * 
     * @param b first value
     * @param c second value
     * @return the result of the multiplication
     */
    public double calcMultiplication(double b, double c) {
        return (b * c);
    }
}