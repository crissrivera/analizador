/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SentenciaImplementaciones;

import Sentencia.Sentencia;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author GABRIELA
 */
public class BloqueSentencia extends Sentencia {

  Sentencia sentencia;

  public BloqueSentencia(Sentencia sentencia) {
    this.sentencia = sentencia;
  }

  public BloqueSentencia() {

  }

  public Sentencia getSentencia() {
    return sentencia;
  }

  public void setSentencia(Sentencia sentencia) {
    this.sentencia = sentencia;
  }

  @Override
  public List<Sentencia> llenarHijos() {

    hijos = new ArrayList<>();

    hijos.add(sentencia);

    return hijos;

  }

  @Override
  public String toString() {
    throw new UnsupportedOperationException("Not supported yet."); 
                                                                   
  }

  @Override
  public String parse() {
    throw new UnsupportedOperationException("Not supported yet."); 
                                                                   
  }
}
