package Test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Controlador.Analizador_clase;
import Controlador.Analizador_listMapa;
import util.FlujoCaracteres;
import util.Lexema;

public class AnalizadoclaseTest {
  @Test
  public void TestAutomataClaseCorrecto() {
    Analizador_clase fun = new Analizador_clase();
    char[] caracteres = "clase".toCharArray();
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
  public void TestAutomataClaseInCorrecto() {
    Analizador_clase fun = new Analizador_clase();
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
