package Test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Controlador.Analizador_captura;
import Controlador.Analizador_caracter;
import util.FlujoCaracteres;
import util.Lexema;

public class AnalizadorcaracterTest {
  @Test
  public void TestAutomataCaracterCorrecto() {
    Analizador_caracter fun = new Analizador_caracter();
    char[] caracteres = "caracter".toCharArray();
    Lexema resultado = fun.inicio(new FlujoCaracteres(0, caracteres));
    int esperado = 1;
    int resultadoMetodo;
    if (resultado != null) {
      resultadoMetodo = 1;
    } else {
      resultadoMetodo = 0;
    }

    assertEquals(esperado, resultadoMetodo);

  }

  @Test
  public void TestAutomataCaracterInCorrecto() {
    Analizador_caracter fun = new Analizador_caracter();
    char[] caracteres = "casdmnas".toCharArray();
    Lexema resultado = fun.inicio(new FlujoCaracteres(0, caracteres));
    int esperado = 0;
    int resultadoMetodo;
    if (resultado != null) {
      resultadoMetodo = 1;
    } else {
      resultadoMetodo = 0;
    }

    assertEquals(esperado, resultadoMetodo);

  }
}
