/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Windows;


import static Windows.wMain.list;
import static Windows.wMain.tabla;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import proyecto_jh.Document;
import proyecto_jh.Function;
/**
 *
 * @author moise
 */
public class Cargar_Datos extends javax.swing.JFrame {

    public static wMenu v1;
    
    public Cargar_Datos(wMenu v1){
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.v1 = v1;
        v1.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        TITULO_Principal = new javax.swing.JLabel();
        Ruta_Fichero = new javax.swing.JTextField();
        Buscar_Archivo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Archivo_Cargado = new javax.swing.JTextArea();
        Volver = new javax.swing.JButton();
        Guardar_Facturas = new javax.swing.JButton();
        Cargar_Doc = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TITULO_Principal.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        TITULO_Principal.setForeground(new java.awt.Color(255, 255, 255));
        TITULO_Principal.setText("Cargar Datos");
        jPanel1.add(TITULO_Principal, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, -1));
        jPanel1.add(Ruta_Fichero, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 290, -1));

        Buscar_Archivo.setText("Buscar Archivo");
        Buscar_Archivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Buscar_ArchivoActionPerformed(evt);
            }
        });
        jPanel1.add(Buscar_Archivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, 110, -1));

        Archivo_Cargado.setColumns(20);
        Archivo_Cargado.setRows(5);
        jScrollPane1.setViewportView(Archivo_Cargado);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 288, 178));

        Volver.setText("Volver");
        Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverActionPerformed(evt);
            }
        });
        jPanel1.add(Volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 290, -1, -1));

        Guardar_Facturas.setText("Guardar Documento");
        Guardar_Facturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Guardar_FacturasActionPerformed(evt);
            }
        });
        jPanel1.add(Guardar_Facturas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 150, -1));

        Cargar_Doc.setText("Ver Documentos");
        Cargar_Doc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cargar_DocActionPerformed(evt);
            }
        });
        jPanel1.add(Cargar_Doc, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 130, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverActionPerformed
        this.setVisible(false);
        wMenu ventana1 = new wMenu();
        ventana1.setVisible(true); 
    }//GEN-LAST:event_VolverActionPerformed

    private void Buscar_ArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Buscar_ArchivoActionPerformed
        //Creo el Objeto JFileChooser
        JFileChooser fc = new JFileChooser();
        
        //Creo el filtro
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("*.TXT", "txt");
        
        //Le indico el filtro
        fc.setFileFilter(filtro);
        
        //Abrimos la ventana, guardamos la op seleccionada por el usuario
        int seleccion = fc.showOpenDialog(this);
        
        //Si el usario presiona aceptar
        if(seleccion == JFileChooser.APPROVE_OPTION){
            
            //Selecciono el fichero
            File fichero = fc.getSelectedFile();
            
            //Escribir la ruta del fichero
            this.Ruta_Fichero.setText(fichero.getAbsolutePath());
            
            try(FileReader fr = new FileReader(fichero)){
                String cadena = "";
                int valor = fr.read();
                while(valor != -1){
                    cadena = cadena + (char) valor;
                    valor = fr.read();
                }
                this.Archivo_Cargado.setText(cadena);
            }catch (IOException e1){
                e1.printStackTrace();
            }
        }else{
            JOptionPane.showMessageDialog(null, "No se ha seleccionado ningún archivo.");
        }
    }//GEN-LAST:event_Buscar_ArchivoActionPerformed

    private void Guardar_FacturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Guardar_FacturasActionPerformed
        Function func = new Function();
        Document documento = func.cargar_documento(Archivo_Cargado.getText());
        func.cargar_HashTable(list,documento, tabla);
    }//GEN-LAST:event_Guardar_FacturasActionPerformed

    private void Cargar_DocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cargar_DocActionPerformed
        list.mostrar1();
    }//GEN-LAST:event_Cargar_DocActionPerformed

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
            java.util.logging.Logger.getLogger(Cargar_Datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cargar_Datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cargar_Datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cargar_Datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cargar_Datos(v1).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Archivo_Cargado;
    private javax.swing.JButton Buscar_Archivo;
    private javax.swing.JButton Cargar_Doc;
    private javax.swing.JButton Guardar_Facturas;
    private javax.swing.JTextField Ruta_Fichero;
    private javax.swing.JLabel TITULO_Principal;
    private javax.swing.JButton Volver;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}