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
public class MontoEquivalenciaTest {
    
    public MontoEquivalenciaTest() {
    }

    /**
     * Test of ingreso method, of class Monto.
     */
    @Test
    public void testEquivalencia() {
        System.out.println("Equivalencia");
        int cantidad = 650;
        Monto instance = new Monto();
        String expResult = "Valor introducido correcto";
        String result = instance.ingreso(cantidad);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
    @Test
    public void testEquivalencia1() {
        System.out.println("Equivalencia");
        int cantidad = -500;
        Monto instance = new Monto();
        String expResult = "Error: La cantidad introducida es menor de 1";
        String result = instance.ingreso(cantidad);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
    @Test
    public void testEquivalencia2() {
        System.out.println("Equivalencia");
        int cantidad = 2500;
        Monto instance = new Monto();
        String expResult = "Error: La cantidad introducida es > 1000";
        String result = instance.ingreso(cantidad);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
   /*
    650 = Valor introducido correcto;   Valor equivalencia
    -500 = Error: La cantidad introducida es menor de 1 Valor equivalencia
    2500 = Error: La cantidad introducida es > 1000; Valor equivalencia
    
    
    */
}
