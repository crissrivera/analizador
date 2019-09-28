package Test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Controlador.Analizador_privado;
import Controlador.Analizador_protegido;
import util.FlujoCaracteres;
import util.Lexema;

public class AnalizadorprivadoTest {
  @Test
  public void TestAutomataPrivadoCorrecto() {
    Analizador_privado fun = new Analizador_privado();
      char[] caracteres = "privado".toCharArray();
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
  public void TestAutomataPrivadoInCorrecto() {
    Analizador_privado fun = new Analizador_privado();
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
