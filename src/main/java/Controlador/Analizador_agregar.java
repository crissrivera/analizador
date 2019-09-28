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
 * @author Manuel Alejandro
 */
public class Analizador_agregar {

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

      return new Lexema(".agregar", "metodo interface");
    } else {
      return null;
    }
  }

  public void q0() {

    if (cont < car.length) {

      if (car[cont] == '.') {

        cont++;

        q1();

      } else {

        aceptada = false;

      }
    }
  }

  public void q1() {

    if (cont < car.length) {

      if (car[cont] == 'a') {

        cont++;

        q2();

      } else {

        aceptada = false;

      }
    }
  }

  public void q2() {

    if (cont < car.length) {

      if (car[cont] == 'g') {

        cont++;

        q3();

      } else {

        aceptada = false;

      }
    }
  }

  public void q3() {

    if (cont < car.length) {

      if (car[cont] == 'r') {

        cont++;

        q4();

      } else {

        aceptada = false;

      }
    }
  }

  public void q4() {

    if (cont < car.length) {

      if (car[cont] == 'e') {

        cont++;

        q5();

      } else {

        aceptada = false;

      }
    }
  }

  public void q5() {

    if (cont < car.length) {/* cuantos espacios tiene mi arreglo */

      if (car[cont] == 'g') {/* el arreglo car en el contador 0 lo vamos a comparar si es = a */

        cont++;/* incrememnto mi contador */

        q6();

      } else {

        aceptada = false;

      }
    }
  }

  public void q6() {

    if (cont < car.length) {/* cuantos espacios tiene mi arreglo */

      if (car[cont] == 'a') {/* el arreglo car en el contador 0 lo vamos a comparar si es = a */

        cont++;/* incrememnto mi contador */

        qF();

      } else {

        aceptada = false;

      }
    }
  }

  public void qF() {
    if (cont < car.length) {/* cuantos espacios tiene mi arreglo */

      if (car[cont] == 'r') {/* el arreglo car en el contador 0 lo vamos a comparar si es = a */

        aceptada = true;
        cont++;
        qF();

      } else if (Character.isLetter(car[cont]) || Character.isDigit(car[cont])) {
        aceptada = false;
        cont--;

      }
    }
  }

}
