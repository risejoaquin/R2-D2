/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package mx.itson.r2d2.bussines;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author MI PC
 */
public class OperationTest {
    
    public OperationTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of calcIva method, of class Operation.
     */
    @Test
    public void testCalcIva() {
        System.out.println("calcIva");
        double a = 10.0;
        double b = 100.0;
        double expResult = 10.0;
        double result = Operation.calcIva(a, b);
        assertEquals(expResult, result, 0);
        
    }

    /**
     * Test of calcMultiplication method, of class Operation.
     */
    @Test
    public void testCalcMultiplication() {
        System.out.println("calcMultiplication");
        double b = 2.0;
        double c = 5.0;
        Operation instance = new Operation();
        double expResult = 10.0;
        double result = instance.calcMultiplication(b, c);
        assertEquals(expResult, result, 0);

    }
    
}
