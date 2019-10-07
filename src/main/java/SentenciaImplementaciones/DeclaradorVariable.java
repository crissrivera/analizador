/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SentenciaImplementaciones;

import Sentencia.Sentencia;
import util.Lexema;

/**
 *
 * @author GABRIELA
 */
public class DeclaradorVariable extends Sentencia {

    private Lexema tipo;
    private Lexema identificador;
    private Lista<DeclaradorVariable> listaDeclaradorVariable;

    public DeclaradorVariable() {
        listaDeclaradorVariable = new Lista<>();
    }

    public Lexema getTipo() {
        return tipo;
    }

    public void setTipo(Lexema tipo) {
        this.tipo = tipo;
    }

    public Lexema getIdentificador() {
        return identificador;
    }

    public void setIdentificador(Lexema identificador) {
        this.identificador = identificador;
    }

    public Lista<DeclaradorVariable> getListaDeclaradorVariable() {
        return listaDeclaradorVariable;
    }

    public void setListaDeclaradorVariable(Lista<DeclaradorVariable> listaDeclaradorVariable) {
        this.listaDeclaradorVariable = listaDeclaradorVariable;
    }

    @Override
    public List<Sentencia> llenarHijos() {
        hijos = new ArrayList<>();

        hijos.add(new SentenciaToken(tipo));
        hijos.add(new SentenciaToken(identificador));

        if (!listaDeclaradorVariable.getSentencias().isEmpty()) {
            hijos.add(listaDeclaradorVariable);
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

