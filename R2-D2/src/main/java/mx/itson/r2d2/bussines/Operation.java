/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.r2d2.bussines;

/**
 *
 * @author compu
 */
public class Operation {
  public double calcIva (double a,double b ){
        return (a * (b/100));
    
    }
    public double calcShipping (double b, double c){
        return (b * c);
    }
}
