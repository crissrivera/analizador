package gramaticaimplementaciones;

import Sentencia.Sentencia;
import SentenciaImplementaciones.Parametro;
import gramaticasdefiniciones.Gramatica;
import util.Lexema;

public class GramaticParameter implements Gramatica {

  @Override
  public Parametro analizar(Sentencia raiz, Flujotokens flujoTokens) {

    Lexema tipo, nombre;
    Lexema lexema = flujoTokens.getTokenActual();

    if (lexema.getTipoLexema().equals("Tipo Dato")) {
      tipo = lexema;
      lexema = flujoTokens.avanzar();

      if (lexema.getTipoLexema().equals("Identificador")) {
        nombre = lexema;
      } else {
        throw new SintacticException(lexema, "Identificador");
      }

      return new Parametro(nombre, tipo);
    } else {
      return null;
    }
  }

}
