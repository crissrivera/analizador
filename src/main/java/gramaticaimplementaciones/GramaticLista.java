package gramaticaimplementaciones;

import java.util.ArrayList;
import java.util.List;

import Sentencia.Sentencia;
import SentenciaImplementaciones.Lista;
import gramaticasdefiniciones.Gramatica;
import util.Lexema;

public class GramaticLista<T extends Sentencia> {

  public Lista<T> analizar(Gramatica gramma, Sentencia raiz, Flujotokens flujoTokens, String separador) {

    List<T> sentencias = new ArrayList<>();
    T parametro = null;
    boolean go = true;
    do {
      Lexema lexema = flujoTokens.avanzar();
      parametro = (T) gramma.analizar(raiz, flujoTokens);
      if (parametro != null) {
        sentencias.add(parametro);
        lexema = flujoTokens.avanzar();

        if (lexema.getTipoLexema() != separador) {
          break;
        }
        continue;

      }

      go = false;

    } while (go);

    return new Lista<T>(sentencias);
  }

}
