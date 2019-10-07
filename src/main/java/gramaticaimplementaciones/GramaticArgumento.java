package gramaticaimplementaciones;


import Sentencia.Sentencia;
import SentenciaImplementaciones.Argumento;
import excepciones.SintacticException;
import gramaticasdefiniciones.Gramatica;
import util.Lexema;

public class GramaticArgumento implements Gramatica {

  @Override
  public Argumento analizar(Sentencia raiz, Flujotokens flujoTokens) {

    Lexema nombre;
    Lexema lexema = flujoTokens.getTokenActual();

    if (lexema.getTipoLexema().equals("Identificador")) {
      nombre = lexema;
    } else {
      throw new SintacticException(lexema, "Identificador");
    }

    return new Argumento(nombre);

  }

}
