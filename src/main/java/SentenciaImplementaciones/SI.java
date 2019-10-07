/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SentenciaImplementaciones;
import java.util.List;

import Sentencia.Sentencia;
import java.util.ArrayList;

/**
 *
 * @author GABRIELA
 */
public class SI extends Sentencia {

    private ExpresionLogica condicion;

    private Lista<Sentencia> listaSentenciaSI;

    private Lista<Sentencia> listaSentenciaContrario;

    private SI contrario;

    public SI() {
        listaSentenciaContrario = new Lista<>();
        listaSentenciaSI = new Lista<>();
    }

    public SI(ExpresionLogica condicion, Lista<Sentencia> listaSentenciaSI, Lista<Sentencia> listaSentenciaContrario, SI contrario) {
        this.condicion = condicion;
        this.listaSentenciaSI = listaSentenciaSI;
        this.listaSentenciaContrario = listaSentenciaContrario;
        this.contrario = contrario;
    }

    public Lista<Sentencia> getListaSentenciaSI() {
        return listaSentenciaSI;
    }

    public void setListaSentenciaSI(Lista<Sentencia> listaSentenciaSI) {
        this.listaSentenciaSI = listaSentenciaSI;
    }

    public Lista<Sentencia> getListaSentenciaContrario() {
        return listaSentenciaContrario;
    }

    public void setListaSentenciaContrario(Lista<Sentencia> listaSentenciaContrario) {
        this.listaSentenciaContrario = listaSentenciaContrario;
    }

    public SI getContrario() {
        return contrario;
    }

    public void setContrario(SI contrario) {
        this.contrario = contrario;
    }
    
    
    

    @Override
    public List<Sentencia> llenarHijos() {
       
        hijos = new ArrayList<>();
        hijos.add(condicion);
        hijos.add(contrario);
        if (!listaSentenciaContrario.getSentencias().isEmpty()){
            hijos.add(listaSentenciaContrario);
        }
        if (!listaSentenciaSI.getSentencias().isEmpty()) {
            hijos.add(listaSentenciaSI);
            
        }
        return hijos;
    }

    

    @Override
    public String parse() {

        StringBuilder str = new StringBuilder();

        str.append("si").append("(");
        str.append(condicion.parse());
        str.append(")");
        str.append("{");

        for (Sentencia sentencia : listaSentenciaSI.getSentencias()) {
            str.append(sentencia.parse());
        }
        str.append("}");

        if (!listaSentenciaContrario.getSentencias().isEmpty()) {
            str.append("contrario").append("{");
            for (Sentencia sentencia : listaSentenciaContrario.getSentencias()) {
                str.append(sentencia.parse());
            }
            str.append("}");
        }

        return str.toString();
    }

    public void setCondicion(ExpresionLogica condicion) {
        this.condicion = condicion;
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
