package Test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Controlador.Analizador_JSONArreglo;
import Controlador.Analizador_interfaz;
import util.FlujoCaracteres;
import util.Lexema;

public class AnalizadorJSONArreglo {
  @Test
  public void TestAutomataJSONArregloCorrecto() {
    Analizador_JSONArreglo fun = new Analizador_JSONArreglo();
    char[] caracteres = "JSONArreglo".toCharArray();
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
  public void TestAutomataJSONArregloInCorrecto() {
    Analizador_JSONArreglo fun = new Analizador_JSONArreglo();
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
