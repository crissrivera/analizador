package Test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Controlador.Analizador_decimal;
import Controlador.Analizador_diferente;
import util.FlujoCaracteres;
import util.Lexema;

public class AnalizadordiferenteTest {
  @Test
  public void TestAutomataDiferenteCorrecto() {
    Analizador_diferente fun = new Analizador_diferente();
    char[] caracteres = "<>".toCharArray();
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
  public void TestAutomataDiferenteInCorrecto() {
    Analizador_diferente fun = new Analizador_diferente();
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
