/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscaminasgit;

//import Modelo.Empresa;

import java.awt.Frame;
import javax.swing.JFrame;


/**
 *
 * @author Diegomendez1997
 */
public class PrincipalAlternativa extends javax.swing.JFrame {
    private static final int ANCHO = 350;
    private static final int ALTO = 350;
    
    private static BuscaminasGit buscaminas;
    
    /**
     * Creates new form PrincipalAlternativa
     */
    public PrincipalAlternativa() {
        initComponents();
        
        //this.buscaminas = new BuscaminasGit();
        
        this.setSize(ANCHO, ALTO);
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

        nuevaPartidaButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menú Principal");
        getContentPane().setLayout(new java.awt.GridLayout(2, 2));

        nuevaPartidaButton.setText("Nueva partida");
        nuevaPartidaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevaPartidaButtonActionPerformed(evt);
            }
        });
        getContentPane().add(nuevaPartidaButton);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nuevaPartidaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevaPartidaButtonActionPerformed
          //buscaminas = new BuscaminasGit();
          VistaNiveles vistaNiveles = new VistaNiveles();
          vistaNiveles.setVisible(true);
          //buscaminas.setVisible(true);
          //this.setVisible(false);
    }//GEN-LAST:event_nuevaPartidaButtonActionPerformed
/**/
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
            java.util.logging.Logger.getLogger(PrincipalAlternativa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalAlternativa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalAlternativa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalAlternativa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalAlternativa().setVisible(true);
                
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton nuevaPartidaButton;
    // End of variables declaration//GEN-END:variables
}
