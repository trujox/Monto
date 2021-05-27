/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monto;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Fran
 */
public class MontoBATest {
    
    Monto instance;
    
    public MontoBATest() {
    }
    
    @Before
    public void setUp() {
        instance = new Monto();
        
    }
    
    @After
    public void tearDown() {
        
        instance=null;
    }

    /**
     * Test of ingreso method, of class Monto.
     */
    @Test
    public void testBorde() {
        System.out.println("Borde");
        int cantidad = 0;
        String expResult = "Error: La cantidad introducida es menor de 1";
        String result = instance.ingreso(cantidad);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
    @Test
    public void testBorde1() {
        System.out.println("Borde");
        int cantidad = 1;
        String expResult = "Valor introducido correcto";
        String result = instance.ingreso(cantidad);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
    @Test
    public void testBorde2() {
        System.out.println("Borde");
        int cantidad = 1000;
        String expResult = "Valor introducido correcto";
        String result = instance.ingreso(cantidad);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testBorde3() {
        System.out.println("Borde");
        int cantidad = 1001;
        String expResult = "Error: La cantidad introducida es > 1000";
        String result = instance.ingreso(cantidad);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
