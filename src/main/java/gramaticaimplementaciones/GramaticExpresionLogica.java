package gramaticaimplementaciones;

import Sentencia.Sentencia;
import SentenciaImplementaciones.Expresion;
import SentenciaImplementaciones.ExpresionLogica;
import gramaticasdefiniciones.Gramatica;
import util.Lexema;

public class GramaticExpresionLogica implements Gramatica {

  @Override
  public ExpresionLogica analizar(Sentencia padre, Flujotokens flujoTokens) {

    ExpresionLogica expresionLogica = new ExpresionLogica();

    flujoTokens.guardarPosicion();

    Lexema lexema = flujoTokens.getTokenActual();

    if (lexema.getToken().equals("!")) {

      expresionLogica.setOperador(lexema);
      lexema = flujoTokens.avanzar();

      GramaticExpresion gramaticaExpresion = new GramaticExpresion();

      Expresion expresion = gramaticaExpresion.analizar(expresionLogica, flujoTokens);
      if (expresion != null) {
        expresionLogica.setExpresion(expresion);
        return expresionLogica;
      }

    }

    GramaticExpresion gramaticaExpresion = new GramaticExpresion();

    Expresion expresion = gramaticaExpresion.analizar(expresionLogica, flujoTokens);
    if (expresion != null) {
      expresionLogica.setExpresion(expresion);
      lexema = flujoTokens.getTokenActual();
      if (lexema.getToken().equals("&") || lexema.getToken().equals("|")) {
        expresionLogica.setOperador(lexema);
        lexema = flujoTokens.avanzar();

        if (lexema == null) {
          throw new SintacticException(new Lexema("", ""), "expresion");
        }

        Expresion expresion1 = gramaticaExpresion.analizar(expresionLogica, flujoTokens);
        if (expresion != null) {
          expresionLogica.setExpresion2(expresion1);
          return expresionLogica;
        } else {
          throw new SintacticException(lexema, "expresion");

        }

      } else {
        throw new SintacticException(lexema, "operador");

      }
    }

    if (lexema.getTipoLexema().equals("Identificador")) {
      expresionLogica.setIdentificador(lexema);
      return expresionLogica;
    }
    return null;

  }

}
