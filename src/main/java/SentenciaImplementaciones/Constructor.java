/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SentenciaImplementaciones;

import Sentencia.Sentencia;
import java.util.List;
import util.Lexema;

/**
 *
 * @author GABRIELA
 */
public class Constructor extends Sentencia {

    Lexema nombre;

    Lista<Parametro> listaParametros;

    Lista<Sentencia> listaSentencia;

    public Constructor(Lexema nombre, Lista<Parametro> listaParametros, Lista<Sentencia> listaSentencia) {
        this.nombre = nombre;
        this.listaParametros = listaParametros;
        this.listaSentencia = listaSentencia;
    }

    public Constructor() {
        listaParametros = new Lista<>();
        listaSentencia = new Lista<>();
    }

    public Lexema getNombre() {
        return nombre;
    }

    public void setNombre(Lexema nombre) {
        this.nombre = nombre;
    }

    public Lista<Parametro> getListaParametros() {
        return listaParametros;
    }

    public void setListaParametros(Lista<Parametro> listaParametros) {
        this.listaParametros = listaParametros;
    }

    public Lista<Sentencia> getListaSentencia() {
        return listaSentencia;
    }

    public void setListaSentencia(Lista<Sentencia> listaSentencia) {
        this.listaSentencia = listaSentencia;
    }

    @Override
    public List<Sentencia> llenarHijos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String parse() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
