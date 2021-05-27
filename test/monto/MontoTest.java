/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monto;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Fran
 */
public class MontoTest {
    
    public MontoTest() {
    }

    /**
     * Test of ingreso method, of class Monto.
     */
    @Test
    public void testBorde() {
        System.out.println("Borde");
        int cantidad = 0;
        Monto instance = new Monto();
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
        Monto instance = new Monto();
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
        Monto instance = new Monto();
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
        Monto instance = new Monto();
        String expResult = "Error: La cantidad introducida es > 1000";
        String result = instance.ingreso(cantidad);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    /*
     0 = Error: La cantidad introducida es menor de 1                      Valor Borde
     1 = Valor introducido correcto;                       Valor Borde
     1000 = Valor introducido correcto;                    Valor Borde
     1001 = Valor introducido correcto;                    Valor Borde
    */
}
