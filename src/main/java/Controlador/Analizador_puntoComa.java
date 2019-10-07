/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import util.FlujoCaracteres;
import util.Lexema;

/**
 *
 * @author Crist
 */
public class Analizador_puntoComa {
    int cont;
  boolean aceptada;
   char[] car;
   
   
    public Lexema inicio(FlujoCaracteres flujo) {
        cont = flujo.getPosActual();
        
        car = flujo.getCaracteres();
        aceptada = false;
        q0F();
         if (aceptada == true) {
      AnalizadorLexico.flujo.setPosActual(cont);

      return new Lexema(";", "punto y coma");
    } else {
      return null;
    }
    }
    
    
    public void q0F() {
        if (cont < car.length) {/*cuantos espacios tiene mi arreglo*/

            if (car[cont] == ';' && aceptada == false) {/*el arreglo car en el contador 0 lo vamos a comparar si es = a*/

                cont++;
                aceptada = true;
                q0F();

            } 
        }
    }
}
