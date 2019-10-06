package Test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Controlador.Analizador_diferente;
import Controlador.Analizador_distinto;
import util.FlujoCaracteres;
import util.Lexema;

public class AnalizadordistintoTest {
  @Test
  public void TestAutomataDistintoCorrecto() {
    Analizador_distinto fun = new Analizador_distinto();
    char[] caracteres = "!=".toCharArray();
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
  public void TestAutomataDistintoInCorrecto() {
    Analizador_distinto fun = new Analizador_distinto();
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
