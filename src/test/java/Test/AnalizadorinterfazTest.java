package Test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Controlador.Analizador_implementar;
import Controlador.Analizador_interfaz;
import util.FlujoCaracteres;
import util.Lexema;

public class AnalizadorinterfazTest {
  @Test
  public void TestAutomataInterfazCorrecto() {
    Analizador_interfaz fun = new Analizador_interfaz();
    char[] caracteres = "interfaz".toCharArray();
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
  public void TestAutomataInterfazInCorrecto() {
    Analizador_interfaz fun = new Analizador_interfaz();
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
