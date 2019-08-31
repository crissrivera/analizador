/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author GABRIELA
 */
public class FlujoCaracteres {

    int posicionActual;
    char[] caracteres;

    public FlujoCaracteres(int posicionActual, char[] caracteres) {
        this.posicionActual = posicionActual;
        this.caracteres = caracteres;
    }

    public int getPosActual() {
        return posicionActual;
    }

    public void setPosActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public char[] getCaracteres() {
        return caracteres;
    }

    public void setCaracteres(char[] caracteres) {
        this.caracteres = caracteres;
    }
}
