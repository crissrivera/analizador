package Test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Controlador.Analizador_diviCombinada;
import Controlador.Analizador_entero;
import util.FlujoCaracteres;
import util.Lexema;

public class AnalizadorenteroTest {
  @Test
  public void TestAutomataEnteroCorrecto() {
    Analizador_entero fun = new Analizador_entero();
    char[] caracteres = "entero".toCharArray();
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
  public void TestAutomataEnteroInCorrecto() {
    Analizador_entero fun = new Analizador_entero();
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
