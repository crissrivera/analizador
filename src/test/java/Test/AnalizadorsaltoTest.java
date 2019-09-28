package Test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Controlador.Analizador_cadena;
import Controlador.Analizador_salto;
import util.FlujoCaracteres;
import util.Lexema;

public class AnalizadorsaltoTest {

  @Test
   public void TestAutomataSaltoCorrecto() {
       Analizador_salto fun = new Analizador_salto();
       char[] caracteres = "salto".toCharArray();
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
   public void TestAutomataSaltoInCorrecto() {
     Analizador_salto fun = new Analizador_salto();
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
