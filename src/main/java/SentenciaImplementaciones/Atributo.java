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
public class Atributo extends Sentencia {

    /**
     * Nombre del atributo
     */
    private Lexema nombre;

    /**
     * Tipo de dato.
     */
    private Lexema tipoDato;

    public Atributo() {
    }

    public Atributo(Lexema nombre, Lexema tipoDato) {
        this.nombre = nombre;
        this.tipoDato = tipoDato;
    }

    @Override
    public List<Sentencia> llenarHijos() {
        hijos = new ArrayList<>();

        hijos.add(new SentenciaToken(tipoDato));
        hijos.add(new SentenciaToken(nombre));
        return hijos;
    }

    @Override
    public String toString() {
        return "Atributo:" + tipoDato.getToken() + "-" + nombre.getToken();
    }

    public Lexema getNombre() {
        return nombre;
    }

    public void setNombre(Lexema nombre) {
        this.nombre = nombre;
    }

    public Lexema getTipoDato() {
        return tipoDato;
    }

    public void setTipoDato(Lexema tipoDato) {
        this.tipoDato = tipoDato;
    }

    @Override
    public String parse() {
        StringBuilder str = new StringBuilder();

        str.append("atributo ");

        str.append("con nombre ").append(nombre.getToken());
        str.append(" y de tipo ").append(tipoDato.getToken());
        str.append(";");

        return str.toString();
    }
    
}
