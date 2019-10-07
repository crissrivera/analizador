package gramaticaimplementaciones;

import Sentencia.Sentencia;
import SentenciaImplementaciones.Argumento;
import SentenciaImplementaciones.CrearExpresion;
import SentenciaImplementaciones.Lista;
import gramaticasdefiniciones.Gramatica;
import util.Lexema;

public class GramaticExpresioncreada implements Gramatica {

  @Override
  public CrearExpresion analizar(Sentencia padre, Flujotokens flujoTokens) {
   
    CrearExpresion crearExpresion = new CrearExpresion();

    flujoTokens.guardarPosicion();
   
    Lexema lexema = flujoTokens.getTokenActual();

    if (lexema.getToken().equals("nuevo")) {
      lexema = flujoTokens.getTokenActual();
      if (lexema.getTipoLexema().equals("Identificador")) {
        crearExpresion.setIdentificador(lexema);
        lexema = flujoTokens.avanzar();

        if (lexema.getToken().equals("(")) {

          lexema = flujoTokens.getTokenActual();

          Lista<Argumento> argumentos = new Lista<>();
          GramaticArgumento gramma = new GramaticArgumento();
         
          GramaticLista<Argumento> grammaArgumentos = new GramaticLista<>();
          argumentos = grammaArgumentos.analizar(gramma, crearExpresion, flujoTokens, "Coma");
          crearExpresion.setListaArgumentos(argumentos);
          lexema = flujoTokens.getTokenActual();

          if (lexema.getToken().equals(")")) {
            lexema = flujoTokens.getTokenActual();

            return crearExpresion;
          }
        }
      }
    }
    return null;

  }

}
