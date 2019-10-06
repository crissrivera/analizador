package Test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Controlador.Analizador_publico;
import Controlador.Analizador_restaCombinada;
import util.FlujoCaracteres;
import util.Lexema;

public class AnalizadorpublicoTest {
  @Test
  public void TestAutomataPublicoCorrecto() {
      Analizador_publico fun = new Analizador_publico();
      char[] caracteres = "publico".toCharArray();
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
  public void TestAutomataPublicoInCorrecto() {
    Analizador_publico fun = new Analizador_publico();
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
