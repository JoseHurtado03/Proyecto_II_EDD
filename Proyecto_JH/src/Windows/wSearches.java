/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Windows;

import javax.swing.JOptionPane;
import proyecto_jh.Searches;
import static Windows.wMain.tabla;

/**
 *
 * @author Usuario
 */
public class wSearches extends javax.swing.JFrame {

    /**
     * Creates new form wSearches
     */
    public wSearches() {
        initComponents();
        this.setLocationRelativeTo(null);
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
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        screen = new javax.swing.JTextArea();
        keyWord = new javax.swing.JButton();
        searchAuthor = new javax.swing.JButton();
        seeInformation = new javax.swing.JButton();
        back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Buscar Resumen");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, -1, -1));

        screen.setColumns(20);
        screen.setRows(5);
        jScrollPane1.setViewportView(screen);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 380, 120));

        keyWord.setText("Palabra Clave");
        jPanel1.add(keyWord, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, -1));

        searchAuthor.setText("Autor");
        searchAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchAuthorActionPerformed(evt);
            }
        });
        jPanel1.add(searchAuthor, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, -1, -1));

        seeInformation.setText("Ver Información");
        jPanel1.add(seeInformation, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, -1, -1));

        back.setText("⬅️");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 310));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        wMenu menu = new wMenu();
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backActionPerformed

    private void searchAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchAuthorActionPerformed
        String author = JOptionPane.showInputDialog(null, "Ingrese el nombre del autor que busca");
        Searches search = new Searches(tabla);
        String info = search.searchAuthor(author);
        screen.setText(info);
    }//GEN-LAST:event_searchAuthorActionPerformed

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
            java.util.logging.Logger.getLogger(wSearches.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(wSearches.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(wSearches.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(wSearches.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new wSearches().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton keyWord;
    private javax.swing.JTextArea screen;
    private javax.swing.JButton searchAuthor;
    private javax.swing.JButton seeInformation;
    // End of variables declaration//GEN-END:variables
}
