package Test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Controlador.Analizador_retorno;
import Controlador.Analizador_salto;
import util.FlujoCaracteres;
import util.Lexema;

public class AnalizadorretornoTest {

  @Test
   public void TestAutomataRetornoCorrecto() {
       Analizador_retorno fun = new Analizador_retorno();
       char[] caracteres = "retorno".toCharArray();
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
   public void TestAutomataRetornoInCorrecto() {
     Analizador_retorno fun = new Analizador_retorno();
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
