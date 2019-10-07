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
public class Expresion extends Sentencia {

    private ExpresionNumerica expresionNumerica;
    private ExpresionTest expresionTest;
    private ExpresionCadena expresionCadena;
    private CrearExpresion crearExpresion;
    private Lexema tipo;
    private Lista<Parametro> listaArgumentos;

    public Expresion() {
        listaArgumentos = new Lista<>();

    }

    public Lexema getTipo() {
        return tipo;
    }

    public void setTipo(Lexema tipo) {
        this.tipo = tipo;
    }

    public ExpresionNumerica getExpresionNumerica() {
        return expresionNumerica;
    }

    public void setExpresionNumerica(ExpresionNumerica expresionNumerica) {
        this.expresionNumerica = expresionNumerica;
    }

    public ExpresionTest getExpresionTest() {
        return expresionTest;
    }

    public void setExpresionTest(ExpresionTest expresionTest) {
        this.expresionTest = expresionTest;
    }

    public ExpresionCadena getExpresionCadena() {
        return expresionCadena;
    }

    public void setExpresionCadena(ExpresionCadena expresionCadena) {
        this.expresionCadena = expresionCadena;
    }

    public CrearExpresion getCrearExpresion() {
        return crearExpresion;
    }

    public void setCrearExpresion(CrearExpresion crearExpresion) {
        this.crearExpresion = crearExpresion;
    }

    public Lista<Parametro> getListaArgumentos() {
        return listaArgumentos;
    }

    public void setListaArgumentos(Lista<Parametro> listaArgumentos) {
        this.listaArgumentos = listaArgumentos;
    }

    @Override
    public List<Sentencia> llenarHijos() {

        hijos = new ArrayList<>();

        hijos.add(new SentenciaToken(tipo));

        if (!listaArgumentos.getSentencias().isEmpty()) {
            hijos.add(listaArgumentos);
        }

        return hijos;

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
