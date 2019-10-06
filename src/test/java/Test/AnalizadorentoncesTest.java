package Test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Controlador.Analizador_diviCombinada;
import Controlador.Analizador_entonces;
import util.FlujoCaracteres;
import util.Lexema;

public class AnalizadorentoncesTest {
  @Test
  public void TestAutomataEntoncesCorrecto() {
    Analizador_entonces fun = new Analizador_entonces();
    char[] caracteres = "entonces".toCharArray();
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
  public void TestAutomataEntoncesInCorrecto() {
    Analizador_entonces fun = new Analizador_entonces();
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
