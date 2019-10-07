package gramaticaimplementaciones;

import Sentencia.Sentencia;
import SentenciaImplementaciones.Constructor;
import SentenciaImplementaciones.Lista;
import SentenciaImplementaciones.Metodo;
import SentenciaImplementaciones.Parametro;
import SentenciaImplementaciones.SI;
import gramaticasdefiniciones.Gramatica;
import util.Lexema;

public class GramaticDeclaradorConstructor implements Gramatica {

  @Override
  public Constructor analizar(Sentencia raiz, Flujotokens flujoTokens) {

    Constructor constructor = new Constructor();
    flujoTokens.guardarPosicion();

    Lexema lexema = flujoTokens.getTokenActual();

    if (lexema.getTipoLexema().equals("Identificador")) {
      constructor.setNombre(lexema);
      lexema = flujoTokens.avanzar();
      if (lexema == null) {
        throw new SintacticException(new Lexema("", ""), "Identificador");
      }

      if (lexema.getTipoLexema().equals("parentesis abierto")) {

        Lista<Parametro> parametros = new Lista<>();
        GramaticParameter gramma = new GramaticParameter();

        GramaticLista<Parametro> grammaParametros = new GramaticLista<>();
        parametros = grammaParametros.analizar(gramma, constructor, flujoTokens, "Coma");
        constructor.setListaParametros(parametros);
        lexema = flujoTokens.getTokenActual();

        if (lexema == null) {
          throw new SintacticException(new Lexema("", ""), "parentesis cerrado");
        }
        if (lexema.getTipoLexema().equals("parentesis cerrado")) {
          lexema = flujoTokens.avanzar();

          if (lexema == null) {
            throw new SintacticException(new Lexema("", ""), "corchete abierto");

          }
          if (lexema.getTipoLexema().equals("corchete abierto")) {

            boolean continuar = true;
            GramaticIF gramaticaIF = new GramaticIF();
            GramaticMetodoDeclaracion gramaticaMetodo = new GramaticMetodoDeclaracion();
            do {
              lexema = flujoTokens.avanzar();
              Metodo met = gramaticaMetodo.analizar(constructor, flujoTokens);
              if (met != null) {
                constructor.getListaSentencia().add(met);
                continue;
              }

              SI si = gramaticaIF.analizar(constructor, flujoTokens);
              if (si != null) {
                constructor.getListaSentencia().add(si);
                continue;
              }
              continuar = false;

            } while (continuar);

            if (lexema.getTipoLexema().equals("corchete cerrado")) {

              return constructor;
            } else {
              throw new SintacticException(lexema, "Llave cerrada");
            }

          } else {
            throw new SintacticException(lexema, "Llave abierta");
          }

        } else {
          throw new SintacticException(lexema, "parentesis cerrado");
        }

      } else {

        flujoTokens.backTrack();
        return null;
      }

    } else {

      flujoTokens.backTrack();
      return null;
    }

  }

}
