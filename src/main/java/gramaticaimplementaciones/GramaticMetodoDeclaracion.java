package gramaticaimplementaciones;

import Sentencia.Sentencia;
import SentenciaImplementaciones.Lista;
import SentenciaImplementaciones.Metodo;
import SentenciaImplementaciones.Parametro;
import SentenciaImplementaciones.SI;
import gramaticasdefiniciones.Gramatica;
import util.Lexema;

public class GramaticMetodoDeclaracion implements Gramatica {
  @Override
  public Metodo analizar(Sentencia raiz, Flujotokens flujoTokens) {

    Metodo metodo = new Metodo();
    flujoTokens.guardarPosicion();

    Lexema lexema = flujoTokens.getTokenActual();

    if (lexema.getTipoLexema().equals("Tipo Dato")) {
      metodo.setRetorno(lexema);
      lexema = flujoTokens.avanzar();
      if (lexema == null) {
        throw new SintacticException(new Lexema("", ""), "Identificador");
      }

      if (lexema.getTipoLexema().equals("Identificador")) {
        metodo.setNombre(lexema);
        lexema = flujoTokens.avanzar();
      } else {

        flujoTokens.backTrack();
        return null;
      }

      if (lexema.getTipoLexema().equals("parentesis abierto")) {

        Lista<Parametro> parametros = new Lista<>();
        GramaticParameter gramma = new GramaticParameter();

        GramaticLista<Parametro> grammaParametros = new GramaticLista<>();
        parametros = grammaParametros.analizar(gramma, metodo, flujoTokens, "Coma");
        metodo.setListaParametros(parametros);
        lexema = flujoTokens.getTokenActual();
        if (lexema.getTipoLexema().equals("parentesis cerrado")) {
          if (parametros != null) {
            metodo.setListaParametros(parametros);
          }
          lexema = flujoTokens.avanzar();

          if (lexema.getTipoLexema().equals("corchete abierto")) {

            boolean continuar = true;
            GramaticIF gramaticaIF = new GramaticIF();
            GramaticMetodoDeclaracion gramaticaMetodo = new GramaticMetodoDeclaracion();
            do {
              lexema = flujoTokens.avanzar();
              Metodo met = gramaticaMetodo.analizar(metodo, flujoTokens);
              if (met != null) {
                metodo.getListaSentencias().add(met);
                continue;
              }

              SI si = gramaticaIF.analizar(metodo, flujoTokens);
              if (si != null) {
                metodo.getListaSentencias().add(si);
                continue;
              }
              continuar = false;

            } while (continuar);

            if (lexema.getTipoLexema().equals("corchete cerrado")) {

              return metodo;
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
