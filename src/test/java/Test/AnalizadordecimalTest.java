package Test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Controlador.Analizador_decimal;
import Controlador.Analizador_largo;
import util.FlujoCaracteres;
import util.Lexema;

public class AnalizadordecimalTest {
  @Test
  public void TestAutomataDecimalCorrecto() {
    Analizador_decimal fun = new Analizador_decimal();
    char[] caracteres = "decimal".toCharArray();
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
  public void TestAutomataDecimalInCorrecto() {
    Analizador_decimal fun = new Analizador_decimal();
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
