package Test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Controlador.Analizador_div;
import Controlador.Analizador_diviCombinada;
import util.FlujoCaracteres;
import util.Lexema;

public class AnalizadordivcombinadaTest {
  @Test
  public void TestAutomataDiviCombinadaCorrecto() {
    Analizador_diviCombinada fun = new Analizador_diviCombinada();
    char[] caracteres = "=/".toCharArray();
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
  public void TestAutomataDiviCombinadaInCorrecto() {
    Analizador_diviCombinada fun = new Analizador_diviCombinada();
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
