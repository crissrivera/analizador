package Test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Controlador.Analizador_restoCombinada;
import util.FlujoCaracteres;
import util.Lexema;

public class AnalizadorrestoCombinada {

  @Test
   public void TestAutomataRestoCombinadaCorrecto() {
       Analizador_restoCombinada fun = new Analizador_restoCombinada();
       char[] caracteres = "=%".toCharArray();
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
   public void TestAutomataRestoCombinadaInCorrecto() {
     Analizador_restoCombinada fun = new Analizador_restoCombinada();
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
