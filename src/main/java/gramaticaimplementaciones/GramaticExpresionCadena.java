package gramaticaimplementaciones;

import Sentencia.Sentencia;
import SentenciaImplementaciones.ExpresionCadena;
import gramaticasdefiniciones.Gramatica;
import util.Lexema;

public class GramaticExpresionCadena implements Gramatica {
  @Override
  public ExpresionCadena analizar(Sentencia padre, Flujotokens flujoTokens) {

    ExpresionCadena expresionCadena = new ExpresionCadena();

    flujoTokens.guardarPosicion();

    Lexema lexema = flujoTokens.getTokenActual();

    if (lexema.getTipoLexema().equals("Identificador")) {
      expresionCadena.setExpresion1(lexema);
      lexema = flujoTokens.avanzar();

      if (lexema == null) {
        throw new SintacticException(new Lexema("", ""), "operador");
      }

      if (lexema.getToken().equals("+") || lexema.getToken().equals("+=")) {

        expresionCadena.setOperador(lexema);
        lexema = flujoTokens.avanzar();

        if (lexema.getTipoLexema().equals("Identificador")) {
          expresionCadena.setExpresion2(lexema);
          lexema = flujoTokens.avanzar();
          return expresionCadena;
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
