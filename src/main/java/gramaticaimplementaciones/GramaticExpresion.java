package gramaticaimplementaciones;

import Sentencia.Sentencia;
import SentenciaImplementaciones.CrearExpresion;
import SentenciaImplementaciones.Expresion;
import SentenciaImplementaciones.ExpresionNumerica;
import SentenciaImplementaciones.ExpresionTest;
import gramaticasdefiniciones.Gramatica;
import util.Lexema;

public class GramaticExpresion implements Gramatica {

  @Override
  public Expresion analizar(Sentencia padre, Flujotokens flujoTokens) {

    Expresion expresion = new Expresion();

    flujoTokens.guardarPosicion();

    Lexema lexema = flujoTokens.getTokenActual();

    GramaticExpresionNumerica gramaticaExpresionNumerica = new GramaticExpresionNumerica();
    GramaticExpresionTest gramaticaExpresionTest = new GramaticExpresionTest();
    GramaticExpresionCadena gramaticaExpresionCadena = new GramaticExpresionCadena();
    GramaticExpresioncreada gramaticaCrearExpresion = new GramaticExpresioncreada();

    boolean continuar = true;
    do {
      ExpresionNumerica expresionNumerica = gramaticaExpresionNumerica.analizar(expresion, flujoTokens);

      if (expresionNumerica != null) {
        expresion.setExpresionNumerica(expresionNumerica);
        continue;
      }
      ExpresionTest expresionTest = gramaticaExpresionTest.analizar(expresion, flujoTokens);

      if (expresionTest != null) {
        expresion.setExpresionTest(expresionTest);
        continue;
      }

      CrearExpresion crearExpresion = gramaticaCrearExpresion.analizar(expresion, flujoTokens);

      if (crearExpresion != null) {
        expresion.setCrearExpresion(crearExpresion);
        continue;
      }
      continuar = false;
    } while (continuar);

    lexema = flujoTokens.getTokenActual();

    if (expresion.getExpresionNumerica() == null && expresion.getExpresionTest() == null
        && expresion.getExpresionCadena() == null) {
      return null;
    } else {
      return expresion;
    }

  }

}
