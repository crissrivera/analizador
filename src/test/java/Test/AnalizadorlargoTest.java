package Test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Controlador.Analizador_corto;
import Controlador.Analizador_largo;
import util.FlujoCaracteres;
import util.Lexema;

public class AnalizadorlargoTest {
  @Test
  public void TestAutomataLargoCorrecto() {
    Analizador_largo fun = new Analizador_largo();
    char[] caracteres = "largo".toCharArray();
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
  public void TestAutomataLargoInCorrecto() {
    Analizador_largo fun = new Analizador_largo();
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
