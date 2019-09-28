package Test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Controlador.Analizador_bit;
import Controlador.Analizador_estado;
import util.FlujoCaracteres;
import util.Lexema;

public class AnalizadorestadoTest {
  @Test
  public void TestAutomataEstadoCorrecto() {
    Analizador_estado fun = new Analizador_estado();
    char[] caracteres = "estado".toCharArray();
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
  public void TestAutomataEstadoInCorrecto() {
    Analizador_estado fun = new Analizador_estado();
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
