package gramaticaimplementaciones;

import Sentencia.Sentencia;
import SentenciaImplementaciones.SI;
import gramaticasdefiniciones.Gramatica;
import util.Lexema;

public class GramaticPara implements Gramatica {
  @Override
  public SI analizar(Sentencia raiz, Flujotokens flujoTokens) {
    SI si = new SI();
    flujoTokens.guardarPosicion();

    Lexema lexema = flujoTokens.getTokenActual();

    if (lexema.getToken().equals("para")) {
      lexema = flujoTokens.avanzar();
      if (lexema == null) {
        throw new SintacticException(new Lexema("", ""), "(");
      } else if (lexema.getToken().equals("(")) {

        lexema = flujoTokens.avanzar();

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
