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
public class Analizador_incrementador {
    int cont;
  boolean aceptada;
   char[] car;
   
   
    public Lexema inicio(FlujoCaracteres flujo) {
        cont = flujo.getPosActual();
        
        car = flujo.getCaracteres();
        aceptada = false;
        q0();
         if (aceptada == true) {
      AnalizadorLexico.flujo.setPosActual(cont);

      return new Lexema(")", "Parentesis cerrado");
    } else {
      return null;
    }
    }
    
    
    public void q0() {
        if (cont < car.length) {

            if (car[cont] == '+' && aceptada == false) {
                cont++;
                aceptada = true;
                qF();

            } 
        }
    }
    
    public void qF() {

        if (cont < car.length) {/*cuantos espacios tiene mi arreglo*/

            if (car[cont] == '+' && aceptada == false) {/*el arreglo car en el contador 0 lo vamos a comparar si es = a*/

                cont++;/*incrememnto mi contador*/

                aceptada = true;
                qF();

            }
        }
    }
}
