package Test;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Controlador.Analizador_cadena;
import util.FlujoCaracteres;
import util.Lexema;

public class AnalizadorCadenaTest {

  
  @Test
   public void TestAutomataCadenaCorrecto() {
       Analizador_cadena fun = new Analizador_cadena();
       char[] caracteres = "cadena".toCharArray();
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
     Analizador_cadena fun = new Analizador_cadena();
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
