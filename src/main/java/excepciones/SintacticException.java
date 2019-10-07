package excepciones;

import util.Lexema;

public class SintacticException extends RuntimeException {

  private Lexema antes;

  private String esperado;

  public SintacticException(Lexema antes, String esperado) {

    super("Simbolo no esperado: " + antes.getToken() + ". se esperaba " + esperado);

    this.antes = antes;
    this.esperado = esperado;
  }

  public Lexema getAntes() {
    return antes;
  }

  public void setAntes(Lexema antes) {
    this.antes = antes;
  }

  public String getEsperado() {
    return esperado;
  }

  public void setEsperado(String esperado) {
    this.esperado = esperado;
  }

}
