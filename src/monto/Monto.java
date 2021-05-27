/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monto;

/**
 *
 * @author Fran
 */
public class Monto {

    /**
     * @param args the command line arguments
     */
    public String ingreso (int cantidad) {
        String sRespuesta = "Error desconocido";

            if (cantidad >= 1 && cantidad <=1000) {
                sRespuesta = "Valor introducido correcto";
            } else if (cantidad < 1) {
                sRespuesta = "Error: La cantidad introducida es menor de 1";
            } else {
                sRespuesta= "Error: La cantidad introducida es > 1000";
            }

        return sRespuesta;
        }
    /*
    Valores borde
    0 y 1
    1000 y 1001
    */
    
    /*
    650 = Valor introducido correcto;                       Valor equivalencia
    -500 = Error: La cantidad introducida es menor de 1     Valor equivalencia
    2500 = Error: La cantidad introducida es > 1000;        Valor equivalencia
    */
    
}
