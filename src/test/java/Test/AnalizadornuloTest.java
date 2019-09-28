package Test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Controlador.Analizador_nulo;
import Controlador.Analizador_o;
import util.FlujoCaracteres;
import util.Lexema;

public class AnalizadornuloTest {
  @Test
  public void TestAutomatanuloCorrecto() {
    Analizador_nulo fun = new Analizador_nulo();
      char[] caracteres = "nulo".toCharArray();
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
  public void TestAutomatanuloInCorrecto() {
    Analizador_nulo fun = new Analizador_nulo();
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
