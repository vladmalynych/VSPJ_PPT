/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package porovnanistring;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tprokop
 */
public class StringsToolsTest {
    
    public StringsToolsTest() {
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
     * Test of PorovnejRetezce method, of class StringsTools.
     */
    @Test
    public void testPorovnejRetezce() {
        System.out.println("PorovnejRetezce ('abc' A 'abc')");
        String s1 = "abc";
        String s2 = "abc";
        Boolean expResult = true;
        Boolean result = StringsTools.PorovnejRetezce(s1, s2);
        assertEquals(expResult, result);

        
        System.out.println("PorovnejRetezce ('abc' A 'xyz')");
        s1 = "abc";
        s2 = "xyz";
        expResult = false;
        result = StringsTools.PorovnejRetezce(s1, s2);
        assertEquals(expResult, result);
        
        System.out.println("PorovnejRetezce ('abc' A 'abcd')");
        s1 = "abc";
        s2 = "abcd";
        expResult = false;
        result = StringsTools.PorovnejRetezce(s1, s2);
        assertEquals(expResult, result);
        
        System.out.println("PorovnejRetezce ('abcd' A 'abc')");
        s1 = "abcd";
        s2 = "abc";
        expResult = false;
        result = StringsTools.PorovnejRetezce(s1, s2);
        assertEquals(expResult, result);
        
        System.out.println("PorovnejRetezce ('abc' A '')");
        s1 = "abc";
        s2 = "";
        expResult = false;
        result = StringsTools.PorovnejRetezce(s1, s2);
        assertEquals(expResult, result);
        
        System.out.println("PorovnejRetezce ('' A 'abc')");
        s1 = "";
        s2 = "abc";
        expResult = false;
        result = StringsTools.PorovnejRetezce(s1, s2);
        assertEquals(expResult, result);
        
        System.out.println("PorovnejRetezce ('' A '')");
        s1 = "";
        s2 = "";
        expResult = true;
        result = StringsTools.PorovnejRetezce(s1, s2);
        assertEquals(expResult, result);
        

        
    }
    
}
