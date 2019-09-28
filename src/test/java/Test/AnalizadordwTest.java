package Test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


import Controlador.Analizador_dw;
import util.FlujoCaracteres;
import util.Lexema;

public class AnalizadordwTest {
  @Test
  public void TestAutomataDwCorrecto() {
    Analizador_dw fun = new Analizador_dw();
    char[] caracteres = "dw".toCharArray();
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
  public void TestAutomataDwInCorrecto() {
    Analizador_dw fun = new Analizador_dw();
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
