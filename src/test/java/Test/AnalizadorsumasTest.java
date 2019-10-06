package Test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Controlador.Analizador_cadena;
import Controlador.Analizador_si;
import Controlador.Analizador_sumas;
import util.FlujoCaracteres;
import util.Lexema;

public class AnalizadorsumasTest {

  @Test
  public void TestAutomataCadenaCorrecto() {
      Analizador_sumas fun = new Analizador_sumas();
      char[] caracteres = "++".toCharArray();
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
  public void TestAutomataCadenaInCorrecto() {
    Analizador_sumas fun = new Analizador_sumas();
      char[] caracteres = "asdas".toCharArray();
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
