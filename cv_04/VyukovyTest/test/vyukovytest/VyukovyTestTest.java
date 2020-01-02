/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vyukovytest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
public class VyukovyTestTest {
    
    public VyukovyTestTest() {
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
     * Test metody IndexOf tridy List
     */
    @Test
    public void testList_IndexOf() {
        System.out.println("Test metody .IndexOf() pro List");
        List listCisel = new ArrayList<Integer>();
        listCisel.add(1);
        listCisel.add(2);
        listCisel.add(3);
        listCisel.add(4);
        listCisel.add(3,5); // umisteni na pozici indexu 3

        int expResult = 3;
        int result = listCisel.indexOf(5);
        assertEquals(expResult, result, 0.0);
        
        expResult = 0;
        result = listCisel.indexOf(1);
        assertEquals(expResult, result, 0.0);
    }
    
    
    /**
     * Test metody Add() pro slovnik
     */
    /*
    @Test
    public void testMap_Add() {
        System.out.println("Test metody .Add() pro Map");
        HashMap<Integer, Integer> dictionary = new HashMap<>();
        //dictionary.add(1,10); metoad .Add() neni k dispozici
        dictionary.put(1,10);

        int expResult = 10;
        int result = dictionary.get(1);
        assertEquals(expResult, result, 0.0);
    }
    */
    
}
