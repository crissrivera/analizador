package gramaticasdefiniciones;

import Sentencia.Sentencia;
import gramaticaimplementaciones.Flujotokens;

public interface Gramatica {

  Sentencia analizar(Sentencia padre, Flujotokens flujoTokens);

}
