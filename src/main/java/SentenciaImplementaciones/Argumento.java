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
public class Argumento extends Sentencia {

    private Lexema nombre;

    public Argumento() {
    }

    public Argumento(Lexema nombre) {
        this.nombre = nombre;
    }

    
    public Lexema getNombre() {
        return nombre;
    }

    public void setNombre(Lexema nombre) {
        this.nombre = nombre;
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
