package gramaticaimplementaciones;

import Sentencia.Sentencia;
import SentenciaImplementaciones.Atributo;
import gramaticasdefiniciones.Gramatica;
import util.Lexema;

public class GramaticAtributo implements Gramatica {

  @Override
  public Atributo analizar(Sentencia padre, Flujotokens flujoTokens) {

    Atributo atributo = new Atributo();
    flujoTokens.guardarPosicion();

    Lexema lexema = flujoTokens.getTokenActual();

    if (lexema.getTipoLexema().equals("Tipo Dato")) {
      atributo.setTipoDato(lexema);
      lexema = flujoTokens.avanzar();

      if (lexema.getTipoLexema().equals("Identificador")) {
        atributo.setNombre(lexema);
        lexema = flujoTokens.avanzar();

        if (lexema.getTipoLexema().equals("PuntoComa")) {

          return atributo;
        } else {

          flujoTokens.backTrack();
          return null;
        }

      } else {

        flujoTokens.backTrack();
        return null;
      }

    }
    return null;

  }

}
