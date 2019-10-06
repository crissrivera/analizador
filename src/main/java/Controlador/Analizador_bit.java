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
 * @author GABRIELA
 */
public class Analizador_bit {

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

      return new Lexema("bit", "tipo dato");
    } else {

      if (aceptada) {
        AnalizadorLexico.flujo.setPosActual(cont);
        return new Lexema("bit", "tipo de dato");
      } else {

        return null;
      }
    }
  }

  public void q0() {

    if (cont < car.length) {

      if (car[cont] == 'b') {

        cont++;

        q1();

      } else {

        aceptada = false;

      }
    }
  }

  public void q1() {

    if (cont < car.length) {

      if (car[cont] == 'i') {

        cont++;

        qF();

      } else {

        aceptada = false;

      }
    }
  }

  public void qF() {
    if (cont < car.length) {

      if (car[cont] == 't') {

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
