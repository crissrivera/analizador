package Test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Controlador.Analizador_protegido;
import Controlador.Analizador_restaCombinada;
import util.FlujoCaracteres;
import util.Lexema;

public class AnalizadorprotegidoTest {
  @Test
  public void TestAutomataProtegidoCorrecto() {
    Analizador_protegido fun = new Analizador_protegido();
      char[] caracteres = "protegido".toCharArray();
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
  public void TestAutomataProtegidoInCorrecto() {
    Analizador_protegido fun = new Analizador_protegido();
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
