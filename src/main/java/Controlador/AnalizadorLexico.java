/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import util.FlujoCaracteres;
import util.Lexema;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Manuel Alejandro
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
            Analizador_bit();
            Analizador_archivo();
            Analizador_neg();
            Analizador_suma();
            Analizador_JSONArreglo();
            Analizador_agregar();
            Analizador_captura();
            Analizador_diferente();
            Analizador_distinto();
            Analizador_div();
            Analizador_igualque();
            Analizador_listMapa();
            Analizador_mayorigual();
            Analizador_mayor();
            Analizador_menor();
            Analizador_menorigual();
            Analizador_multi();
            Analizador_nulo();
            Analizador_nuevo();
            Analizador_o();
            Analizador_resta();
            Analizador_y();
            Analizador_salto();
                
            Analizador_cadena();
            Analizador_cambiar();
            Analizador_caracter();
            Analizador_clase();
            Analizador_corto();
            Analizador_decimal();
            Analizador_diviCombinada();
            Analizador_doble();
            Analizador_dw();
            Analizador_entero();
            Analizador_estado();
            Analizador_extender();
            Analizador_implementar();
            Analizador_interfaz();
            Analizador_largo();
            Analizador_mapa();
            Analizador_mientras();
            Analizador_multiCombinada();
            Analizador_por();
            Analizador_privado();
            Analizador_publico();
            Analizador_protegido();
            Analizador_restaCombinada();
            Analizador_sumaCombinada();
            Analizador_restoCombinada();
            Analizador_restas();
            Analizador_si();
            Analizador_tiempo();
            
            

        }

    }

    public void Analizador_bit() {
        Analizador_bit not = new Analizador_bit();
        lexe = not.inicio(flujo);
        if (lexe != null) {
            listLexema.add(lexe);
        }
    }

    public void Analizador_archivo() {
        Analizador_archivo not = new Analizador_archivo();
        lexe = not.inicio(flujo);
        if (lexe != null) {
            listLexema.add(lexe);
        }
    }

    public void Analizador_neg() {
        Analizador_neg not = new Analizador_neg();
        lexe = not.inicio(flujo);
        if (lexe != null) {
            listLexema.add(lexe);
        }
    }

    public void Analizador_suma() {
        Analizador_suma not = new Analizador_suma();
        lexe = not.inicio(flujo);
        if (lexe != null) {
            listLexema.add(lexe);
        }
    }

    public void Analizador_nuevo() {
        Analizador_nuevo not = new Analizador_nuevo();
        lexe = not.inicio(flujo);
        if (lexe != null) {
            listLexema.add(lexe);
        }
    }

    public void Analizador_nulo() {
        Analizador_nulo not = new Analizador_nulo();
        lexe = not.inicio(flujo);
        if (lexe != null) {
            listLexema.add(lexe);
        }
    }

    public void Analizador_o() {
        Analizador_o not = new Analizador_o();
        lexe = not.inicio(flujo);
        if (lexe != null) {
            listLexema.add(lexe);
        }
    }

    public void Analizador_y() {
        Analizador_y not = new Analizador_y();
        lexe = not.inicio(flujo);
        if (lexe != null) {
            listLexema.add(lexe);
        }
    }

    public void Analizador_JSONArreglo() {
        Analizador_JSONArreglo not = new Analizador_JSONArreglo();
        lexe = not.inicio(flujo);
        if (lexe != null) {
            listLexema.add(lexe);
        }
    }

    public void Analizador_igualque() {
        Analizador_igualque not = new Analizador_igualque();
        lexe = not.inicio(flujo);
        if (lexe != null) {
            listLexema.add(lexe);
        }
    }

    public void Analizador_captura() {
        Analizador_captura not = new Analizador_captura();
        lexe = not.inicio(flujo);
        if (lexe != null) {
            listLexema.add(lexe);
        }
    }

    public void Analizador_listMapa() {
        Analizador_listMapa not = new Analizador_listMapa();
        lexe = not.inicio(flujo);
        if (lexe != null) {
            listLexema.add(lexe);
        }
    }

    public void Analizador_menor() {
        Analizador_menor not = new Analizador_menor();
        lexe = not.inicio(flujo);
        if (lexe != null) {
            listLexema.add(lexe);
        }
    }

    public void Analizador_mayor() {
        Analizador_mayor not = new Analizador_mayor();
        lexe = not.inicio(flujo);
        if (lexe != null) {
            listLexema.add(lexe);
        }
    }

    public void Analizador_menorigual() {
        Analizador_menorigual not = new Analizador_menorigual();
        lexe = not.inicio(flujo);
        if (lexe != null) {
            listLexema.add(lexe);
        }
    }

    public void Analizador_mayorigual() {
        Analizador_mayorigual not = new Analizador_mayorigual();
        lexe = not.inicio(flujo);
        if (lexe != null) {
            listLexema.add(lexe);
        }
    }
    
     public void Analizador_modulo() {
        Analizador_modulo not = new Analizador_modulo();
        lexe = not.inicio(flujo);
        if (lexe != null) {
            listLexema.add(lexe);
        }
    }
      public void Analizador_div() {
        Analizador_div not = new Analizador_div();
        lexe = not.inicio(flujo);
        if (lexe != null) {
            listLexema.add(lexe);
        }
    }
       public void Analizador_multi() {
        Analizador_multi not = new Analizador_multi();
        lexe = not.inicio(flujo);
        if (lexe != null) {
            listLexema.add(lexe);
        }
    }
        public void Analizador_resta() {
        Analizador_resta not = new Analizador_resta();
        lexe = not.inicio(flujo);
        if (lexe != null) {
            listLexema.add(lexe);
        }
    }
        public void Analizador_salto() {
        Analizador_salto not = new Analizador_salto();
        lexe = not.inicio(flujo);
        if (lexe != null) {
            listLexema.add(lexe);
        }
    }
         public void Analizador_diferente() {
        Analizador_diferente not = new Analizador_diferente();
        lexe = not.inicio(flujo);
        if (lexe != null) {
            listLexema.add(lexe);
        }
    }
    
          public void Analizador_distinto() {
        Analizador_distinto not = new Analizador_distinto();
        lexe = not.inicio(flujo);
        if (lexe != null) {
            listLexema.add(lexe);
        }
    }
            public void Analizador_retorno() {
        Analizador_retorno not = new Analizador_retorno();
        lexe = not.inicio(flujo);
        if (lexe != null) {
            listLexema.add(lexe);
        }
    }
            public void Analizador_agregar() {
        Analizador_agregar not = new Analizador_agregar();
        lexe = not.inicio(flujo);
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

    public void Analizador_diviCombinada() {
        Analizador_diviCombinada dc = new Analizador_diviCombinada();
        lexe = dc.inicio(flujo);
        if (lexe != null) {
            listLexema.add(lexe);
        }
    }

    public void Analizador_multiCombinada() {
        Analizador_multiCombinada mc = new Analizador_multiCombinada();
        lexe = mc.inicio(flujo);
        if (lexe != null) {
            listLexema.add(lexe);
        }
    }

    public void Analizador_sumaCombinada() {
        Analizador_sumaCombinada sc = new Analizador_sumaCombinada();
        lexe = sc.inicio(flujo);
        if (lexe != null) {
            listLexema.add(lexe);
        }
    }

    public void Analizador_restaCombinada() {
        Analizador_restaCombinada rc = new Analizador_restaCombinada();
        lexe = rc.inicio(flujo);
        if (lexe != null) {
            listLexema.add(lexe);
        }
    }
    
      public void Analizador_restoCombinada() {
        Analizador_restoCombinada roc = new Analizador_restoCombinada();
        lexe = roc.inicio(flujo);
        if (lexe != null) {
            listLexema.add(lexe);
        }
    }

    public void Analizador_restas() {
        Analizador_restas r = new Analizador_restas();
        lexe = r.inicio(flujo);
        if (lexe != null) {
            listLexema.add(lexe);
        }
    }

    public void Analizador_sumas() {
        Analizador_sumas s = new Analizador_sumas();
        lexe = s.inicio(flujo);
        if (lexe != null) {
            listLexema.add(lexe);
        }
    }

}
