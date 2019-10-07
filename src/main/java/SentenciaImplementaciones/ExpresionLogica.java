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
public class ExpresionLogica extends Sentencia {

    private Expresion expresion;
    private Expresion expresion2;
    private Lexema operador;
    private Lexema identificador;

    public ExpresionLogica() {

    }

    public Expresion getExpresion2() {
        return expresion2;
    }

    public void setExpresion2(Expresion expresion2) {
        this.expresion2 = expresion2;
    }

    public Lexema getIdentificador() {
        return identificador;
    }

    public void setIdentificador(Lexema identificador) {
        this.identificador = identificador;
    }

    public Lexema getOperador() {
        return operador;
    }

    public void setOperador(Lexema operador) {
        this.operador = operador;
    }

    public Expresion getExpresion() {
        return expresion;
    }

    public void setExpresion(Expresion expresion) {
        this.expresion = expresion;
    }

    @Override
    public List<Sentencia> llenarHijos() {
        hijos = new ArrayList<>();
        hijos.add(expresion);

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
