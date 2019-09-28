package Test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Controlador.Analizador_bit;
import Controlador.Analizador_extender;
import util.FlujoCaracteres;
import util.Lexema;

public class AnalizadorextenderTest {
  @Test
  public void TestAutomataExtenderCorrecto() {
    Analizador_extender fun = new Analizador_extender();
    char[] caracteres = "extender".toCharArray();
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
  public void TestAutomataExtenderInCorrecto() {
    Analizador_extender fun = new Analizador_extender();
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
