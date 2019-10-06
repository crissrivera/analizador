package Test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


import Controlador.Analizador_sumaCombinada;
import util.FlujoCaracteres;
import util.Lexema;

public class AnalizadorsumaCombinadaTest {

  @Test
  public void TestAutomataSumaCombinadaCorrecto() {
      Analizador_sumaCombinada fun = new Analizador_sumaCombinada();
      char[] caracteres = "=+".toCharArray();
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
  public void TestAutomataSumaCombinadaInCorrecto() {
    Analizador_sumaCombinada fun = new Analizador_sumaCombinada();
      char[] caracteres = "dfg".toCharArray();
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
