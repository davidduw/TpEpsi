/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ErEtiK
 */
public class CalculatorTest {
    
    public CalculatorTest() {
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

    @Test
    public void testAdd() {
        System.out.println("add");
        int number1 = 0;
        int number2 = 0;
        int expResult = 0;
        int result = Calculator.add(number1, number2);
        assertEquals(expResult, result);
        assertEquals("error in add()", 5, Calculator.add(5, 0));
        assertNotEquals("error in add()", 0, Calculator.add(1, 2));
    }

    /**
     * Test of divInt method, of class Calculator.
     */
    @Test
    public void testDivInt() {
        System.out.println("divInt");
        int number1 = 12;
        int number2 = 3;
        int expResult = 4;
        int result = Calculator.divInt(number1, number2);
        assertEquals(expResult, result);
    }

    /**
     * Test of divReal method, of class Calculator.
     */
    @Test
    public void testDivReal() {
        System.out.println("divReal");
        int number1 = 5;
        int number2 = 2;
        double expResult = 2.5;
        double result = Calculator.divReal(number1, number2);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testAsserts(){
        int test1[] = {1,2};
        int test2[] = {1,2};
        Date bob = null;
        boolean orange = true;
        assertArrayEquals(test1, test2);
        assertNull(bob);
        assertTrue(orange);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testDivRealBy0() {
        System.out.println("divRealBy0");
        int number1 = 5;
        int number2 = 0;
        double expResult = 2.5;
        double result = Calculator.divReal(number1, number2);
        assertEquals(expResult, result, 0.0);
    }
    
}
