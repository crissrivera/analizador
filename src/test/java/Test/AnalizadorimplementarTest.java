package Test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Controlador.Analizador_igualque;
import Controlador.Analizador_implementar;
import util.FlujoCaracteres;
import util.Lexema;

public class AnalizadorimplementarTest {
  @Test
  public void TestAutomataImplementarCorrecto() {
    Analizador_implementar fun = new Analizador_implementar();
    char[] caracteres = "implementar".toCharArray();
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
  public void TestAutomataImplementarInCorrecto() {
    Analizador_implementar fun = new Analizador_implementar();
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
