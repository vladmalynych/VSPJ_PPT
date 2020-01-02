/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Arrays;
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
public class ToolFunkceTest {
    
    public ToolFunkceTest() {
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
     * Test of spocitejVzorek_1 method, of class ToolFunkce.
     */
    @Test
    public void testSpocitejVzorek_1() {
        System.out.println("spocitejVzorek_1");
        double x0 = 0.0;
        double x1 = 3.0;
        double krok = 1.0;
        KvadratickaFunkce f = new KvadratickaFunkce(1, 5, 4);
        
        double[] expResult = {4.0,10.0,18.0};
        double[] result = ToolFunkce.spocitejVzorek_1(x0, x1, krok, f);
        assertTrue(Arrays.equals(expResult, result));
        //assertArrayEquals(expResult, result);
    }

    /**
     * Test of spocitejVzorek_2 method, of class ToolFunkce.
     */
    @Test
    public void testSpocitejVzorek_2() {
        System.out.println("spocitejVzorek_2");
        double x0 = 0.0;
        double x1 = 3.0;
        double krok = 1.0;
        KvadratickaFunkce f = new KvadratickaFunkce(1, 5, 4);
        
        double[][] expResult = {{0.0,4.0},{1.0,10.0},{2.0,18.0}};
        double[][] result = ToolFunkce.spocitejVzorek_2(x0, x1, krok, f);
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of spocitejVzorek_3 method, of class ToolFunkce.
     */
    @Test
    public void testSpocitejVzorek_3() {
        System.out.println("spocitejVzorek_3");
        double x0 = 0.0;
        double x1 = 3.0;
        double krok = 1.0;
        KvadratickaFunkce f = new KvadratickaFunkce(1, 5, 4);
        
        Vzorek[] expResult = {new Vzorek(0.0,4.0), new Vzorek(1.0,10.0), new Vzorek(2.0,18.0)};
        Vzorek[] result = ToolFunkce.spocitejVzorek_3(x0, x1, krok, f);
        assertArrayEquals(expResult, result);
    }
    
}
