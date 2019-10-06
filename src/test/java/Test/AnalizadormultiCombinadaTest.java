package Test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Controlador.Analizador_multiCombinada;
import Controlador.Analizador_neg;
import util.FlujoCaracteres;
import util.Lexema;

public class AnalizadormultiCombinadaTest {
  @Test
  public void TestAutomataMultiCombinadaCorrecto() {
    Analizador_multiCombinada fun = new Analizador_multiCombinada();
    char[] caracteres = "=*".toCharArray();
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
  public void TestAutomataMultiCombinadaInCorrecto() {
    Analizador_multiCombinada fun = new Analizador_multiCombinada();
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
