package Test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Controlador.Analizador_neg;
import Controlador.Analizador_nuevo;
import util.FlujoCaracteres;
import util.Lexema;

public class AnalizadornegTest {
  @Test
  public void TestAutomatanegCorrecto() {
    Analizador_neg fun = new Analizador_neg();
      char[] caracteres = "neg".toCharArray();
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
  public void TestAutomatanegInCorrecto() {
    Analizador_neg fun = new Analizador_neg();
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
