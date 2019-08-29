/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;


import java.awt.GridBagLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

import logica.AnalizadorLexico;
import logica.TokensAnalixador;
import util.GestionFichero;

/**
 *
 * @author cristian sinisterra
 */


public class InterfazFinalAnalixador extends javax.swing.JFrame {

    private String titulo = "Analizador Lexico";
    private GestionFichero gestionFichero;
    private ArrayList<TokensAnalixador> analizarTokens;
    private AnalizadorLexico analizadorLexico;
    private int numeroLinea = 1;
    private String advertencia = "Advertencia :El archivo se a guardado automaticamente";
    private String error = "Hubo un error a la hora de hacer la ejecucion";
    private String guardarError = "Falta el nombre del archivo";
    private String nombreArchivo = "";
    private JButton activarBoton;
    
    

    /**
     * Creates new form InterfazFinalAnalixador
     */
    public InterfazFinalAnalixador() {
        initComponents();

        this.setTitle(titulo);
        this.setLocationRelativeTo(null);
        gestionFichero = new GestionFichero();
        analizarTokens = new ArrayList();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
       
    } 

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        analizarBoton = new javax.swing.JButton();
        AbrirArchivoBoton = new javax.swing.JButton();
        guardarArchivoBoton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaAnalixador = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jpanelInterfazEscribir = new javax.swing.JPanel();
        escribirTxt = new javax.swing.JTextArea();
        lineaTxt = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        imprimirText = new javax.swing.JTextArea();
        mensajetxt = new javax.swing.JLabel();
        cmpNombreArchivo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(238, 151, 230));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        analizarBoton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edu/uniquindio/tlf/imagens/logo-videostream-for-chromecast.jpg"))); // NOI18N
        analizarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                analizarBotonActionPerformed(evt);
            }
        });
        jPanel2.add(analizarBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 60, 50));

        AbrirArchivoBoton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edu/uniquindio/tlf/imagens/4125489-3D-icono-para-abrir-la-carpeta-Foto-de-archivo.jpg"))); // NOI18N
        AbrirArchivoBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AbrirArchivoBotonActionPerformed(evt);
            }
        });
        jPanel2.add(AbrirArchivoBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 60, 50));

        guardarArchivoBoton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edu/uniquindio/tlf/imagens/guardar.jpg"))); // NOI18N
        guardarArchivoBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarArchivoBotonActionPerformed(evt);
            }
        });
        jPanel2.add(guardarArchivoBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 60, 50));

        tablaAnalixador.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tablaAnalixador.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Linea", "Token            ", "Lexema"
            }
        ));
        jScrollPane1.setViewportView(tablaAnalixador);
        if (tablaAnalixador.getColumnModel().getColumnCount() > 0) {
            tablaAnalixador.getColumnModel().getColumn(0).setMinWidth(50);
            tablaAnalixador.getColumnModel().getColumn(0).setMaxWidth(13);
            tablaAnalixador.getColumnModel().getColumn(1).setMinWidth(120);
            tablaAnalixador.getColumnModel().getColumn(2).setMinWidth(100);
        }

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, 290, 240));

        jScrollPane2.setAutoscrolls(true);

        jpanelInterfazEscribir.setBackground(new java.awt.Color(102, 102, 255));
        jpanelInterfazEscribir.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        jpanelInterfazEscribir.setAutoscrolls(true);

        escribirTxt.setColumns(20);
        escribirTxt.setRows(5);
        escribirTxt.setWrapStyleWord(true);
        escribirTxt.setAutoscrolls(false);
        escribirTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                escribirTxtKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                escribirTxtKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                escribirTxtKeyTyped(evt);
            }
        });

        lineaTxt.setEditable(false);
        lineaTxt.setColumns(20);
        lineaTxt.setRows(5);
        lineaTxt.setText("1");
        lineaTxt.setAutoscrolls(false);

        javax.swing.GroupLayout jpanelInterfazEscribirLayout = new javax.swing.GroupLayout(jpanelInterfazEscribir);
        jpanelInterfazEscribir.setLayout(jpanelInterfazEscribirLayout);
        jpanelInterfazEscribirLayout.setHorizontalGroup(
            jpanelInterfazEscribirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelInterfazEscribirLayout.createSequentialGroup()
                .addComponent(lineaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(escribirTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jpanelInterfazEscribirLayout.setVerticalGroup(
            jpanelInterfazEscribirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escribirTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
            .addComponent(lineaTxt, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jScrollPane2.setViewportView(jpanelInterfazEscribir);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jPanel3.setLayout(new java.awt.BorderLayout());

        imprimirText.setColumns(20);
        imprimirText.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        imprimirText.setForeground(new java.awt.Color(255, 0, 0));
        imprimirText.setRows(5);
        jPanel3.add(imprimirText, java.awt.BorderLayout.CENTER);

        jScrollPane3.setViewportView(jPanel3);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 345, 600, -1));

        mensajetxt.setBackground(new java.awt.Color(153, 153, 153));
        mensajetxt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        mensajetxt.setForeground(new java.awt.Color(0, 153, 0));
        jPanel2.add(mensajetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, 360, 20));
        jPanel2.add(cmpNombreArchivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, 280, -1));

        jLabel1.setBackground(new java.awt.Color(102, 102, 102));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 51, 0));
        jLabel1.setText("Nombre Archivo");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 90, 20));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void escribirTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_escribirTxtKeyReleased
      
    }//GEN-LAST:event_escribirTxtKeyReleased

    private void analizarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_analizarBotonActionPerformed
        try {
            if (cmpNombreArchivo.getText().equals("")) {
                nombreArchivo = "analizar.mmj";
            } else {
                nombreArchivo = cmpNombreArchivo.getText();
            }
            gestionFichero.guardarFichero(escribirTxt.getText(), nombreArchivo);
            analizadorLexico = new AnalizadorLexico(nombreArchivo);
            
            analizarTokens = analizadorLexico.analizarCodigo();

            DefaultTableModel modelo = (DefaultTableModel) tablaAnalixador.getModel();
            int filas = tablaAnalixador.getRowCount() - 1;
            for (int i = filas; i >= 0; i--) {
                modelo.removeRow(i);
            }

            String mensajeErrores = "";
            for (TokensAnalixador token : analizarTokens) {
                if (!token.getCategoria().equalsIgnoreCase(TokensAnalixador.SIMBOLOS_NO_RECONOCIDOS)) {
                    modelo.addRow(new Object[]{token.getLineaSiguiente(), token.getCategoria(), token.getLexema()});
                }
                if (token.getCategoria().equalsIgnoreCase(TokensAnalixador.SIMBOLOS_NO_RECONOCIDOS)) {
                    mensajeErrores += "Error : El lexema " + token.getLexema() + " ubicado en la línea " + token.getLineaSiguiente() + " no es reconocido.\n";
                }
            }
            mensajetxt.setText(advertencia);
            imprimirText.setText(mensajeErrores);

        } catch (Exception e) {
            imprimirText.setText(error);
        }
        
    }//GEN-LAST:event_analizarBotonActionPerformed

    private void escribirTxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_escribirTxtKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_escribirTxtKeyPressed

    private void escribirTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_escribirTxtKeyTyped
        char tecla = evt.getKeyChar();
        if ((int) tecla == KeyEvent.VK_ENTER) {
            numeroLinea++;
            String num = lineaTxt.getText() + '\n' + numeroLinea;
            lineaTxt.setText(num);
        }
        if ((int) tecla == KeyEvent.VK_BACK_SPACE || (int) tecla == KeyEvent.VK_DELETE) {

            //El while es pos si se eliminan varias lineas a la vez
            while (numeroLinea > escribirTxt.getLineCount()) {
                String num = lineaTxt.getText();

                //Cuando el numero de lineas es solo un digito
                if (escribirTxt.getLineCount() < numeroLinea) {
                    if (numeroLinea < 10) {
                        num = num.substring(0, num.length() - 2);
                        lineaTxt.setText(num);
                        numeroLinea--;
                    }
                    //Cuando el numero de lineas son dos digitos
                    if (numeroLinea > 9 && numeroLinea < 100) {
                        num = num.substring(0, num.length() - 3);
                        lineaTxt.setText(num);
                        numeroLinea--;
                    }
                    //Cuando el numero de lineas son 3 digidos
                    if (numeroLinea > 99 && numeroLinea < 1000) {
                        num = num.substring(0, num.length() - 4);
                        lineaTxt.setText(num);
                        numeroLinea--;
                    }
                }
            }
        }
        //Por si se pegan varias lineas a la vez
        if ((int) tecla == 22) {
            while (numeroLinea < escribirTxt.getLineCount()) {
                numeroLinea++;
                String num = lineaTxt.getText() + '\n' + numeroLinea;
                lineaTxt.setText(num);
            }
        }
    }//GEN-LAST:event_escribirTxtKeyTyped

    private void AbrirArchivoBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbrirArchivoBotonActionPerformed
        JFileChooser jfile = new JFileChooser();
        jfile.setFileFilter(new FileNameExtensionFilter("", "mmj"));

        int respuesta = jfile.showOpenDialog(this);
 
        try {
            if (respuesta == JFileChooser.APPROVE_OPTION) {
                escribirTxt.setText("");
                if (escribirTxt.getText().equals("")) {
                    cmpNombreArchivo.setText(jfile.getSelectedFile().getName());
                    escribirTxt.setText(gestionFichero.cargarFicheroEnString( jfile.getSelectedFile().getName()));
                }
            }
            this.setTitle(titulo + "" + jfile.getSelectedFile().toString());
        } catch (Exception e) {
            ;
        }
    }//GEN-LAST:event_AbrirArchivoBotonActionPerformed


    private void guardarArchivoBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarArchivoBotonActionPerformed
        // TODO add your handling code here:
        try {
            if (cmpNombreArchivo.getText().equals("")) {
                mensajetxt.setText(guardarError);
            } else {
                JFileChooser jfile = new JFileChooser();
                jfile.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
                int respuesta = jfile.showOpenDialog(this);
                if (respuesta == JFileChooser.APPROVE_OPTION) {
                    gestionFichero.guardarFichero(escribirTxt.getText(), cmpNombreArchivo.getText());
                }
            }
        } catch (Exception e) {
            ;
        }
    }//GEN-LAST:event_guardarArchivoBotonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfazFinalAnalixador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazFinalAnalixador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazFinalAnalixador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazFinalAnalixador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazFinalAnalixador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AbrirArchivoBoton;
    private javax.swing.JButton analizarBoton;
    private javax.swing.JTextField cmpNombreArchivo;
    private javax.swing.JTextArea escribirTxt;
    private javax.swing.JButton guardarArchivoBoton;
    private javax.swing.JTextArea imprimirText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel jpanelInterfazEscribir;
    private javax.swing.JTextArea lineaTxt;
    private javax.swing.JLabel mensajetxt;
    private javax.swing.JTable tablaAnalixador;
    // End of variables declaration//GEN-END:variables
}
