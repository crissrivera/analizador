package gramaticaimplementaciones;

import java.util.List;

import util.Lexema;

public class Flujotokens {

  private final List<Lexema> lexemas;

  private int posActual;

  private int posTemp;

  public Flujotokens(List<Lexema> lista) {
    this.lexemas = lista;
  }

  public Lexema avanzar() {
    posActual++;

    return getTokenActual();
  }

  public Lexema retroceder() {
    posActual--;

    return getTokenActual();
  }

  public Lexema getTokenActual() {
    if (posActual >= lexemas.size()) {
      return null;
    }
    return lexemas.get(posActual);
  }

  public void guardarPosicion() {
    posTemp = posActual;
  }

  public void backTrack() {

    posActual = posTemp;
  }

}
