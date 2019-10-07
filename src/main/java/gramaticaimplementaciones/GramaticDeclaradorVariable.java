package gramaticaimplementaciones;

import Sentencia.Sentencia;
import SentenciaImplementaciones.DeclaradorVariable;
import gramaticasdefiniciones.Gramatica;
import util.Lexema;

public class GramaticDeclaradorVariable implements Gramatica {

  
 

  @Override
  public DeclaradorVariable analizar(Sentencia padre, Flujotokens flujoTokens) {

    DeclaradorVariable declaradorVariable = new DeclaradorVariable();

    flujoTokens.guardarPosicion();

    Lexema lexema = flujoTokens.getTokenActual();

    if (lexema.getTipoLexema().equals("Tipo Dato")) {
      declaradorVariable.setTipo(lexema);
      lexema = flujoTokens.avanzar();

      if (lexema == null) {
        throw new SintacticException(new Lexema("", ""), "Identificador");

      }
      if (lexema.getTipoLexema().equals("Identificador")) {

        declaradorVariable.setIdentificador(lexema);
        lexema = flujoTokens.avanzar();

        if (lexema.getToken().equals(",")) {

          boolean continuar = true;
          GramaticDeclaradorVariable gramaticaDeclaradorVariable = new GramaticDeclaradorVariable();
          do {
            lexema = flujoTokens.avanzar();

            DeclaradorVariable decla = gramaticaDeclaradorVariable.analizar(declaradorVariable, flujoTokens);

            if (decla != null) {
              declaradorVariable.getListaDeclaradorVariable().add(decla);
              lexema = flujoTokens.getTokenActual();
              if (lexema.getToken().equals(";")) {

              } else {
                continue;
              }

            }
            continuar = false;
          } while (continuar);

        }

        if (lexema.getToken().equals(";")) {
          return declaradorVariable;

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
