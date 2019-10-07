/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SentenciaImplementaciones;

import Sentencia.Sentencia;
import java.util.ArrayList;
import java.util.List;
import util.Lexema;

/**
 *
 * @author GABRIELA
 */
public class Metodo extends Sentencia {

    /**
     * Nombre del metodo
     */
    private Lexema nombre;

    /**
     * Tipo de retorno.
     */
    private Lexema retorno;

    /**
     * Lista de parametros.
     */
    private Lista<Parametro> listaParametros;

    /**
     * Instrucciones dentro del metodo.
     */
    private Lista<Sentencia> listaSentencias;

    /**
     * COnstructor
     */
    public Metodo() {
        listaParametros = new Lista<>();
        listaSentencias = new Lista<>();
    }

    /**
     * Constructor.
     *
     * @param nombre
     * @param retorno
     * @param listaParametros
     * @param listaSentencias
     */
    public Metodo(Lexema nombre, Lexema retorno, Lista<Parametro> listaParametros, Lista<Sentencia> listaSentencias) {
        this.nombre = nombre;
        this.retorno = retorno;
        this.listaParametros = listaParametros;
        this.listaSentencias = listaSentencias;
    }

    @Override
    public List<Sentencia> llenarHijos() {

        hijos = new ArrayList<>();

        hijos.add(new SentenciaToken(retorno));
        hijos.add(new SentenciaToken(nombre));

        if (!listaParametros.getSentencias().isEmpty()) {
            hijos.add(listaParametros);
        }
        if (!listaSentencias.getSentencias().isEmpty()) {
            hijos.add(listaSentencias);
        }
        return hijos;

    }

    @Override
    public String toString() {
        return "Metodo:  " + nombre.getToken();
    }

    public Lexema getNombre() {
        return nombre;
    }

    public void setNombre(Lexema nombre) {
        this.nombre = nombre;
    }

    public Lexema getRetorno() {
        return retorno;
    }

    public void setRetorno(Lexema retorno) {
        this.retorno = retorno;
    }

    public Lista<Parametro> getListaParametros() {
        return listaParametros;
    }

    public void setListaParametros(Lista<Parametro> listaParametros) {
        this.listaParametros = listaParametros;
    }

    public Lista<Sentencia> getListaSentencias() {
        return listaSentencias;
    }

    public void setListaSentencias(Lista<Sentencia> listaSentencias) {
        this.listaSentencias = listaSentencias;
    }

    @Override
    public String parse() {
        StringBuilder str = new StringBuilder();
        str.append("metodo ");

        str.append("con nombre ").append(nombre.getToken());
        str.append(" y paramatros:  ").append(listaParametros.parse());
        str.append(" retornando ").append(retorno.getToken());

        return str.toString();
    }
    
}
