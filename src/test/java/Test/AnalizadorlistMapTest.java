package Test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


import Controlador.Analizador_listMapa;
import util.FlujoCaracteres;
import util.Lexema;

public class AnalizadorlistMapTest {
  @Test
  public void TestAutomataListMapCorrecto() {
    Analizador_listMapa fun = new Analizador_listMapa();
    char[] caracteres = "caracter".toCharArray();
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
  public void TestAutomataListMapInCorrecto() {
    Analizador_listMapa fun = new Analizador_listMapa();
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
