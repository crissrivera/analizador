package util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class GestionFichero {
	
private ArrayList<String> arregloArchivo;
    
    public GestionFichero() {
        arregloArchivo = new ArrayList();
    }

    public ArrayList<String> cargarFichero(String nombre) {
        FileReader fr = null;
        BufferedReader br = null;
       
        try {
            fr = new FileReader(nombre);
            br = new BufferedReader(fr);
            String linea;
            while ((linea = br.readLine()) != null) {
                arregloArchivo.add(linea);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return arregloArchivo;
    }

    public String cargarFicheroEnString(String nombre) {
        FileReader fr = null;
        BufferedReader br = null;
        String mensaje = "";
        try {
            fr = new FileReader(nombre);
            br = new BufferedReader(fr);
            String linea;
            while ((linea = br.readLine()) != null) {
                mensaje += linea + "\n";
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return mensaje;
    }

    public void guardarFichero(String codigo,String nombre) {
        File fichero = new File(nombre);
          try {
            if (!fichero.exists()) {
                fichero.createNewFile();
            }
            BufferedWriter bw = new BufferedWriter(new FileWriter(fichero));
            bw.write(codigo);
            bw.close();
        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(null, ioe.getMessage(), "Error", JOptionPane.ERROR);
        }
    }
}
