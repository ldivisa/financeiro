/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.financeiro.Configuracoes;

import com.mycompany.financeiro.dao.utilidades.configurações;
import java.util.Properties;

/**
 *
 * @author luiz
 */
public class frmConfiguracoes extends javax.swing.JFrame {
    public Properties cfg;
    public configurações config = new configurações();
    /**
     * Creates new form frmCOnfigurações
     */
    public frmConfiguracoes() {
        initComponents();
        cfg = config.leBanco();
        tf_NomedoArquivo.setText(cfg.getProperty("banco"));
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_Titulo = new javax.swing.JLabel();
        lbl_NomeArquivo = new javax.swing.JLabel();
        Gravar = new javax.swing.JButton();
        Sair = new javax.swing.JButton();
        tf_NomedoArquivo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_Titulo.setFont(new java.awt.Font("Noto Sans", 0, 24)); // NOI18N
        lbl_Titulo.setForeground(new java.awt.Color(255, 0, 0));
        lbl_Titulo.setText("Caminho do banco de dados");

        lbl_NomeArquivo.setText("Caminho:");

        Gravar.setMnemonic('g');
        Gravar.setText("Gravar");
        Gravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GravarActionPerformed(evt);
            }
        });

        Sair.setMnemonic('s');
        Sair.setText("Sair");
        Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairActionPerformed(evt);
            }
        });

        tf_NomedoArquivo.setText("jTextField1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(lbl_Titulo))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(lbl_NomeArquivo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tf_NomedoArquivo, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(46, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Gravar)
                .addGap(18, 18, 18)
                .addComponent(Sair)
                .addGap(141, 141, 141))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lbl_Titulo)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_NomeArquivo)
                    .addComponent(tf_NomedoArquivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Gravar)
                    .addComponent(Sair))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
    dispose();
    }//GEN-LAST:event_SairActionPerformed

    private void GravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GravarActionPerformed
    cfg.put("banco", tf_NomedoArquivo);
    config.gravaBanco(tf_NomedoArquivo.getText());
    dispose();
    }//GEN-LAST:event_GravarActionPerformed

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
            java.util.logging.Logger.getLogger(frmConfiguracoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmConfiguracoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmConfiguracoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmConfiguracoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmConfiguracoes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Gravar;
    private javax.swing.JButton Sair;
    private javax.swing.JLabel lbl_NomeArquivo;
    private javax.swing.JLabel lbl_Titulo;
    private javax.swing.JTextField tf_NomedoArquivo;
    // End of variables declaration//GEN-END:variables
}