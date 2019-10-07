package gramaticaimplementaciones;

import Sentencia.Sentencia;
import SentenciaImplementaciones.ExpresionNumerica;
import gramaticasdefiniciones.Gramatica;
import util.Lexema;

public class GramaticExpresionNumerica implements Gramatica{
  @Override
  public ExpresionNumerica analizar(Sentencia padre, Flujotokens flujoTokens) {

    ExpresionNumerica expresionNumerica = new ExpresionNumerica();

    flujoTokens.guardarPosicion();

    Lexema lexema = flujoTokens.getTokenActual();

    if (lexema.getToken().equals("-")) {

      lexema = flujoTokens.avanzar();

      if (lexema == null) {
        throw new SintacticException(new Lexema("", ""), "expresion");

      }

      if (lexema.getTipoLexema().equals("Identificador")) {
        expresionNumerica.setExpresion1(lexema);
        lexema = flujoTokens.avanzar();

        return expresionNumerica;
      } else {
        throw new SintacticException(lexema, "Identificador");

      }

    }

    if (lexema.getTipoLexema().equals("Identificador")) {
      expresionNumerica.setExpresion1(lexema);
      lexema = flujoTokens.avanzar();

      if (lexema == null) {
        throw new SintacticException(new Lexema("", ""), "expresion");
      }

      if (lexema.getToken().equals("++") || lexema.getToken().equals("--")) {
        expresionNumerica.setOperador(lexema);
        lexema = flujoTokens.avanzar();
        return expresionNumerica;
      }

      if (lexema.getToken().equals("+") || lexema.getToken().equals("+=") || lexema.getToken().equals("-")
          || lexema.getToken().equals("-=") || lexema.getToken().equals("=") || lexema.getToken().equals("/")
          || lexema.getToken().equals("/=") || lexema.getToken().equals("%") || lexema.getToken().equals("%=")) {
        expresionNumerica.setOperador(lexema);
        lexema = flujoTokens.avanzar();

        if (lexema == null) {
          throw new SintacticException(new Lexema("", ""), "expresion");
        }

        if (lexema.getTipoLexema().equals("Identificador")) {
          expresionNumerica.setExpresion2(lexema);
          lexema = flujoTokens.avanzar();

          return expresionNumerica;
        }

      } else {
        flujoTokens.backTrack();
        return null;
      }
    } else {
      flujoTokens.backTrack();
      return null;
    }

    return null;
  }

}
