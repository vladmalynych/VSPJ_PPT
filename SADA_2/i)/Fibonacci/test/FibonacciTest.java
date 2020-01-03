/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tomprokop
 */
public class FibonacciTest {
    
    public FibonacciTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of calcNerek method, of class Fibonacci.
     */
    @Test
    public void testCalcNerek() {
        System.out.println("calcNerek");    
        Fibonacci instance = new Fibonacci();
        
        instance.Init_CalcSlozitost();
        int expResult = 13;
        int result = instance.calcNerek(7);
        assertEquals(expResult, result);
        
        instance.Init_CalcSlozitost();
        expResult = 0;
        result = instance.calcNerek(0);
        assertEquals(expResult, result);
        
        instance.Init_CalcSlozitost();
        expResult = 1;
        result = instance.calcNerek(1);
        assertEquals(expResult, result);
    }

    /**
     * Test of calcRek method, of class Fibonacci.
     */
    @Test
    public void testCalcRek() {
        System.out.println("calcRek");
        Fibonacci instance = new Fibonacci();
        
        instance.Init_CalcSlozitost();
        int expResult = 13;
        int result = instance.calcRek(7);
        assertEquals(expResult, result);
        
        instance.Init_CalcSlozitost();
        expResult = 0;
        result = instance.calcRek(0);
        assertEquals(expResult, result);
        
        instance.Init_CalcSlozitost();
        expResult = 1;
        result = instance.calcRek(1);
        assertEquals(expResult, result);
    }

    /**
     * Test of calcRekTable method, of class Fibonacci.
     */
    @Test
    public void testCalcRekTable() {
        System.out.println("calcRekTable");
 
        Fibonacci instance = new Fibonacci();
        
        instance.Init_CalcSlozitost();
        instance.Init();
        int expResult = 13;
        int result = instance.calcRekTable(7);
        assertEquals(expResult, result);
        
        
        instance.Init_CalcSlozitost();
        instance.Init();
        expResult = 0;
        result = instance.calcRekTable(0);
        assertEquals(expResult, result);
        
        instance.Init_CalcSlozitost();
        instance.Init();
        expResult = 1;
        result = instance.calcRekTable(1);
        assertEquals(expResult, result);
    }

    
}
