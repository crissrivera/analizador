package Test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Controlador.Analizador_cadena;
import Controlador.Analizador_si;
import Controlador.Analizador_y;
import util.FlujoCaracteres;
import util.Lexema;

public class AnalizadoryTest {
  

  @Test
  public void TestAutomatayCorrecto() {
      Analizador_y fun = new Analizador_y();
      char[] caracteres = "=".toCharArray();
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
  public void TestAutomatayInCorrecto() {
    Analizador_y fun = new Analizador_y();
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
