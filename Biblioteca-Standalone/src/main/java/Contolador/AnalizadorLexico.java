package Controlador;

import Modelo.FlujoCaracteres;
import Modelo.Lexema;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mauricio
 */
public class AnalizadorLexico {

    List<Lexema> listLexema = new ArrayList<>();
    Lexema lexe;
    public static FlujoCaracteres flujo;

    public List<Lexema> getListLexema() {
        return listLexema;
    }

    public void setListLexema(List<Lexema> listLexema) {
        this.listLexema = listLexema;
    }

    public void analizar(FlujoCaracteres flu) {
        flujo = flu;

        while (flujo.getPosActual() < flujo.getCaracteres().length) {

            // ----------------------------------
            Analizador_bit();
            Analizador_cadena();
            Analizador_cambiar();

        }

    }

    public void Analizador_bit() {
        Analizador_bit bit = new Analizador_bit();
        lexe = bit.inicio(flujo);
        if (lexe != null) {
            listLexema.add(lexe);
        }
    }

    public void Analizador_cadena() {
        Analizador_cadena cad = new Analizador_cadena();
        lexe = cad.inicio(flujo);
        if (lexe != null) {
            listLexema.add(lexe);
        }
    }

    public void Analizador_cambiar() {
        Analizador_cambiar cam = new Analizador_cambiar();
        lexe = cam.inicio(flujo);
        if (lexe != null) {
            listLexema.add(lexe);
        }
    }

    public void Analizador_caracter() {
        Analizador_caracter car = new Analizador_caracter();
        lexe = car.inicio(flujo);
        if (lexe != null) {
            listLexema.add(lexe);
        }
    }

    public void Analizador_clase() {
        Analizador_clase cla = new Analizador_clase();
        lexe = cla.inicio(flujo);
        if (lexe != null) {
            listLexema.add(lexe);
        }
    }

    public void Analizador_corto() {
        Analizador_corto cor = new Analizador_corto();
        lexe = cor.inicio(flujo);
        if (lexe != null) {
            listLexema.add(lexe);
        }
    }

    public void Analizador_decimal() {
        Analizador_decimal de = new Analizador_decimal();
        lexe = de.inicio(flujo);
        if (lexe != null) {
            listLexema.add(lexe);
        }
    }

    public void Analizador_doble() {
        Analizador_doble de = new Analizador_doble();
        lexe = de.inicio(flujo);
        if (lexe != null) {
            listLexema.add(lexe);
        }
    }

    public void Analizador_dw() {
        Analizador_dw dw = new Analizador_dw();
        lexe = dw.inicio(flujo);
        if (lexe != null) {
            listLexema.add(lexe);
        }
    }

    public void Analizador_entero() {
        Analizador_entero en = new Analizador_entero();
        lexe = en.inicio(flujo);
        if (lexe != null) {
            listLexema.add(lexe);
        }
    }

    public void Analizador_estado() {
        Analizador_estado es = new Analizador_estado();
        lexe = es.inicio(flujo);
        if (lexe != null) {
            listLexema.add(lexe);
        }
    }

    public void Analizador_extender() {
        Analizador_extender ex = new Analizador_extender();
        lexe = ex.inicio(flujo);
        if (lexe != null) {
            listLexema.add(lexe);
        }
    }

    public void Analizador_implementar() {
        Analizador_implementar im = new Analizador_implementar();
        lexe = im.inicio(flujo);
        if (lexe != null) {
            listLexema.add(lexe);
        }
    }

    public void Analizador_interfaz() {
        Analizador_interfaz in = new Analizador_interfaz();
        lexe = in.inicio(flujo);
        if (lexe != null) {
            listLexema.add(lexe);
        }
    }

    public void Analizador_largo() {
        Analizador_largo lg = new Analizador_largo();
        lexe = lg.inicio(flujo);
        if (lexe != null) {
            listLexema.add(lexe);
        }
    }

    public void Analizador_mapa() {
        Analizador_mapa ma = new Analizador_mapa();
        lexe = ma.inicio(flujo);
        if (lexe != null) {
            listLexema.add(lexe);
        }
    }

    public void Analizador_mientras() {
        Analizador_mientras mi = new Analizador_mientras();
        lexe = mi.inicio(flujo);
        if (lexe != null) {
            listLexema.add(lexe);
        }
    }

    public void Analizador_por() {
        Analizador_por p = new Analizador_por();
        lexe = p.inicio(flujo);
        if (lexe != null) {
            listLexema.add(lexe);
        }
    }

    public void Analizador_privado() {
        Analizador_privado pr = new Analizador_privado();
        lexe = pr.inicio(flujo);
        if (lexe != null) {
            listLexema.add(lexe);
        }
    }

    public void Analizador_protegido() {
        Analizador_protegido pro = new Analizador_protegido();
        lexe = pro.inicio(flujo);
        if (lexe != null) {
            listLexema.add(lexe);
        }
    }

    public void Analizador_publico() {
        Analizador_publico pu = new Analizador_publico();
        lexe = pu.inicio(flujo);
        if (lexe != null) {
            listLexema.add(lexe);
        }
    }

    public void Analizador_si() {
        Analizador_si si = new Analizador_si();
        lexe = si.inicio(flujo);
        if (lexe != null) {
            listLexema.add(lexe);
        }
    }

    public void Analizador_tiempo() {
        Analizador_tiempo ti = new Analizador_tiempo();
        lexe = ti.inicio(flujo);
        if (lexe != null) {
            listLexema.add(lexe);
        }
    }

}
