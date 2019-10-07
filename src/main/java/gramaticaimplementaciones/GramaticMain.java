package gramaticaimplementaciones;

import Sentencia.Sentencia;
import SentenciaImplementaciones.Main;
import gramaticasdefiniciones.Gramatica;
import util.Lexema;

public class GramaticMain implements Gramatica {
  @Override
  public Main analizar(Sentencia raiz, Flujotokens flujoTokens) {

    Main main = new Main();
    flujoTokens.guardarPosicion();

    Lexema lexema = flujoTokens.getTokenActual();

    if (lexema.getTipoLexema().equals("Tipo Dato") || lexema.getToken().equals("vacio")) {
      main.setRetorno(lexema);
      lexema = flujoTokens.avanzar();
      if (lexema == null) {
        throw new SintacticException(new Lexema("", ""), "main");
      }

      if (lexema.getToken().equals("main")) {
        main.setMain(lexema);
        lexema = flujoTokens.avanzar();

        if (lexema == null) {
          throw new SintacticException(new Lexema("", ""), "(");
        }

        if (lexema.getToken().equals("(")) {
          lexema = flujoTokens.avanzar();

          if (lexema == null) {
            throw new SintacticException(new Lexema("", ""), "(");
          }

          if (lexema.getTipoLexema().equals("Tipo Dato")) {
            main.setTipoIdentidicador(lexema);
            lexema = flujoTokens.avanzar();

            if (lexema == null) {
              throw new SintacticException(new Lexema("", ""), "[");
            }

            if (lexema.getToken().equals("[")) {
              lexema = flujoTokens.avanzar();

              if (lexema == null) {
                throw new SintacticException(new Lexema("", ""), "]");
              }

              if (lexema.getToken().equals("]")) {
                lexema = flujoTokens.avanzar();
                if (lexema == null) {
                  throw new SintacticException(new Lexema("", ""), "identificador");
                }

                if (lexema.getTipoLexema().equals("Identificador")) {
                  main.setNombreParametro(lexema);
                  lexema = flujoTokens.avanzar();

                  if (lexema == null) {
                    throw new SintacticException(new Lexema("", ""), ")");
                  }

                  if (lexema.getToken().equals(")")) {
                    lexema = flujoTokens.avanzar();

                    if (lexema == null) {
                      throw new SintacticException(new Lexema("", ""), "{");
                    }

                    if (lexema.getToken().equals("{")) {

                      boolean continuar = true;
                      GramaticAtributo gramaticaAtributo = new GramaticAtributo();
                      do {
                        lexema = flujoTokens.avanzar();
                        Atributo atributo = gramaticaAtributo.analizar(main, flujoTokens);
                        if (atributo != null) {
                          main.getListaSentencia().add(atributo);
                          continue;
                        }

                        continuar = false;

                      } while (continuar);

                      if (lexema.getToken().equals("}")) {

                        return main;
                      } else {
                        throw new SintacticException(lexema, "}");
                      }

                    } else {
                      throw new SintacticException(lexema, "{");

                    }
                  } else {
                    throw new SintacticException(lexema, ")");

                  }
                } else {
                  throw new SintacticException(lexema, "Identificador");

                }

              } else {
                throw new SintacticException(lexema, "]");

              }

            } else {
              throw new SintacticException(lexema, "[");

            }

          } else {
            throw new SintacticException(lexema, "Tipo Dato");

          }

        } else {
          throw new SintacticException(lexema, "(");

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
