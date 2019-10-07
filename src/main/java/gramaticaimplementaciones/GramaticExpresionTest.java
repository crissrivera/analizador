package gramaticaimplementaciones;

import Sentencia.Sentencia;
import SentenciaImplementaciones.ExpresionTest;
import excepciones.SintacticException;
import gramaticasdefiniciones.Gramatica;
import util.Lexema;

public class GramaticExpresionTest implements Gramatica {

  @Override
  public ExpresionTest analizar(Sentencia padre, Flujotokens flujoTokens) {

    ExpresionTest expresionTest = new ExpresionTest();

    flujoTokens.guardarPosicion();

    Lexema lexema = flujoTokens.getTokenActual();

    if (lexema.getTipoLexema().equals("Identificador")) {
      expresionTest.setExpresion1(lexema);
      lexema = flujoTokens.avanzar();

      if (lexema == null) {
        throw new SintacticException(new Lexema("", ""), "operador");
      }

      if (lexema.getToken().equals(">") || lexema.getToken().equals("<") || lexema.getToken().equals(">=")
          || lexema.getToken().equals("<=") || lexema.getToken().equals("==") || lexema.getToken().equals("!=")) {

        expresionTest.setOperador(lexema);
        lexema = flujoTokens.avanzar();

        if (lexema.getTipoLexema().equals("Identificador")) {
          expresionTest.setExpresion2(lexema);
          lexema = flujoTokens.avanzar();
          return expresionTest;
        } else {
          throw new SintacticException(lexema, "identificador");

        }

      } else {
        throw new SintacticException(lexema, "operador");

      }
    }
    return null;

  }

}
