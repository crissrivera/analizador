package Test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Controlador.Analizador_multi;
import Controlador.Analizador_multiCombinada;
import util.FlujoCaracteres;
import util.Lexema;

public class AnalizadormultiTest {
  @Test
  public void TestAutomataMultiCorrecto() {
    Analizador_multi fun = new Analizador_multi();
      char[] caracteres = "multi".toCharArray();
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
  public void TestAutomataMultiInCorrecto() {
    Analizador_multi fun = new Analizador_multi();
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
