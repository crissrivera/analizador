package gramaticaimplementaciones;

import Sentencia.Sentencia;
import SentenciaImplementaciones.ExpresionLogica;
import SentenciaImplementaciones.SI;
import gramaticasdefiniciones.Gramatica;
import util.Lexema;

public class GramaticIF implements Gramatica {
  @Override
  public SI analizar(Sentencia raiz, Flujotokens flujoTokens) {
    SI si = new SI();
    flujoTokens.guardarPosicion();

    Lexema lexema = flujoTokens.getTokenActual();

    if (lexema.getToken().equals("si")) {
      lexema = flujoTokens.avanzar();
      if (lexema == null) {
        throw new SintacticException(new Lexema("", ""), "(");
      } else if (lexema.getToken().equals("(")) {
        GramaticExpresionLogica gramaticaExpresionLogica = new GramaticExpresionLogica();
        lexema = flujoTokens.avanzar();
        ExpresionLogica expresionLogica = gramaticaExpresionLogica.analizar(si, flujoTokens);

        if (expresionLogica != null) {
          si.setCondicion(expresionLogica);
          lexema = flujoTokens.getTokenActual();
        } else {
          throw new SintacticException(lexema, "condicion");
        }

        if (lexema.getToken().equals(")")) {
          lexema = flujoTokens.avanzar();
          if (lexema.getToken().equals("{")) {
            lexema = flujoTokens.avanzar();
         
            if (lexema.getToken().equals("}")) {
              return si;
            }
          } else if (lexema == null) {
            throw new SintacticException(new Lexema("", ""), "}");
          }
        } else if (lexema == null) {
          throw new SintacticException(new Lexema("", ""), "{");
        }

      } else {
        throw new SintacticException(lexema, "(");
      }

    } else {
      flujoTokens.backTrack();
      return null;
    }

    return null;

  }

}
