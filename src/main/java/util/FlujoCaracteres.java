package util;

/**
 * 
 * @author Cristian Sinisterra.
 *
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
