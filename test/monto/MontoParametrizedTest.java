/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monto;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author Fran
 */
@RunWith(value = org.junit.runners.Parameterized.class)
public class MontoParametrizedTest {
    
    int cantidad;
    String cadena;
    
    public MontoParametrizedTest(int cantidad, String cadena) {
        this.cadena = cadena;
        this.cantidad = cantidad;
    }

    /**
     * Test of ingreso method, of class Monto.
     */
    @Parameters
    public static Iterable<Object[]> getdata(){
        List<Object[]> obj = new ArrayList<>();
        
        obj.add(new Object[]{650, "Valor introducido correct0"});
        obj.add(new Object[]{-500, "Error: La cantidad introducida es menor de 1"});
        obj.add(new Object[]{2500, "Error: La cantidad introducida es > 1000"});
        obj.add(new Object[]{0, "Error: La cantidad introducida es menor de 1"});
        obj.add(new Object[]{1, "Valor introducido correcto"});
        obj.add(new Object[]{1000, "Valor introducido correcto"});
        obj.add(new Object[]{1001, "Error: La cantidad introducida es > 1000"});
        return obj;
    }
     @Test
    public void testParametrized() {
        Monto instance = new Monto();
        String resultadoEsperado = cadena;
        String resultado = instance.ingreso(cantidad);
        assertEquals(resultadoEsperado, resultado);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
}
