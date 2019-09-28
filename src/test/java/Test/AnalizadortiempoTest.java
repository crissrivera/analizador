package Test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Controlador.Analizador_cadena;
import Controlador.Analizador_si;
import Controlador.Analizador_tiempo;
import util.FlujoCaracteres;
import util.Lexema;

public class AnalizadortiempoTest {
  

  @Test
  public void TestAutomataTiempoCorrecto() {
      Analizador_tiempo fun = new Analizador_tiempo();
      char[] caracteres = "tiempo".toCharArray();
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
  public void TestAutomataTiempoInCorrecto() {
    Analizador_tiempo fun = new Analizador_tiempo();
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
