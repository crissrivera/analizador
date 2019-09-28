package Test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Controlador.Analizador_cadena;
import Controlador.Analizador_restas;
import Controlador.Analizador_si;
import util.FlujoCaracteres;
import util.Lexema;

public class AnalizadorrestasTest {

  @Test
  public void TestAutomatarestasCorrecto() {
      Analizador_restas fun = new Analizador_restas();
      char[] caracteres = "--".toCharArray();
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
  public void TestAutomatarestasInCorrecto() {
    Analizador_restas fun = new Analizador_restas();
      char[] caracteres = "++".toCharArray();
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
