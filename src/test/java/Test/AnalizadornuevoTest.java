package Test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Controlador.Analizador_nuevo;
import Controlador.Analizador_nulo;
import util.FlujoCaracteres;
import util.Lexema;

public class AnalizadornuevoTest {
  @Test
  public void TestAutomatanuevoCorrecto() {
    Analizador_nuevo fun = new Analizador_nuevo();
      char[] caracteres = "nuevo".toCharArray();
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
  public void TestAutomatanuevoInCorrecto() {
    Analizador_nuevo fun = new Analizador_nuevo();
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
