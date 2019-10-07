package gramaticaimplementaciones;

import Sentencia.Sentencia;
import SentenciaImplementaciones.Atributo;
import SentenciaImplementaciones.Clase;
import SentenciaImplementaciones.Constructor;
import SentenciaImplementaciones.DeclaradorVariable;
import SentenciaImplementaciones.Expresion;
import SentenciaImplementaciones.Main;
import SentenciaImplementaciones.Metodo;
import excepciones.SintacticException;
import gramaticasdefiniciones.Gramatica;
import util.Lexema;

public class GramaticClase implements Gramatica {
  @Override
  public Clase analizar(Sentencia raiz, Flujotokens flujoTokens) {

    Clase clase = new Clase();
    Lexema lexema = flujoTokens.getTokenActual();

    if (lexema.getToken().equals("clase")) {
      lexema = flujoTokens.avanzar();
      if (lexema == null) {
        throw new SintacticException(new Lexema("", ""), "Identificador");
      } else if (lexema.getTipoLexema().equals("Identificador")) {
        clase.setNombreClase(lexema);
        lexema = flujoTokens.avanzar();
        if (lexema == null) {
          throw new SintacticException(new Lexema("", ""), "{");
        } else if (lexema.getTipoLexema().equals("corchete abierto")) {

          boolean continuar = true;
          GramaticAtributo gramaticaAtributo = new GramaticAtributo();
          GramaticMetodoDeclaracion gramaticaMetodo = new GramaticMetodoDeclaracion();
          GramaticDeclaradorConstructor gramaticaConstructor = new GramaticDeclaradorConstructor();
          GramaticMain gramaticaMain = new GramaticMain();
          GramaticDeclaradorVariable gramaticaDeclaradorVariable = new GramaticDeclaradorVariable();

          GramaticExpresion gramaticaExpresion = new GramaticExpresion();
          do {
            lexema = flujoTokens.avanzar();
            Metodo met = gramaticaMetodo.analizar(clase, flujoTokens);
            if (met != null) {
              clase.getListaMetodos().add(met);
              continue;
            }

            Expresion expresion = gramaticaExpresion.analizar(clase, flujoTokens);

            if (expresion != null) {
              clase.getListaSentencia().add(expresion);
              lexema = flujoTokens.getTokenActual();
              lexema = flujoTokens.retroceder();
              continue;
            }
            Atributo atributo = gramaticaAtributo.analizar(clase, flujoTokens);
            if (atributo != null) {
              clase.getListaAtributos().add(atributo);
              continue;
            }

            Constructor constructor = gramaticaConstructor.analizar(clase, flujoTokens);
            if (constructor != null) {
              clase.getListaSentencia().add(constructor);
              continue;

            }

            Main main = gramaticaMain.analizar(clase, flujoTokens);
            if (main != null) {
              clase.getListaSentencia().add(main);
              continue;

            }

            DeclaradorVariable declaradorVariable = gramaticaDeclaradorVariable.analizar(clase, flujoTokens);
            if (declaradorVariable != null) {
              clase.getListaSentencia().add(declaradorVariable);
              continue;

            }

            continuar = false;

          } while (continuar);

          if (lexema.getTipoLexema().equals("corchete cerrado")) {

            return clase;
          } else {
            throw new SintacticException(lexema, "corchete cerrado");
          }

        } else {
          throw new SintacticException(lexema, "Llave abierta");
        }
      }

    } else {
      flujoTokens.backTrack();
      return null;
    }
    return null;
  }

}
