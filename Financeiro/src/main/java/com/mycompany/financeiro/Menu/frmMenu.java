/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.financeiro.Menu;

import com.mycompany.financeiro.frmCompromissos.frmBaixarBoletos;
import com.mycompany.financeiro.frmCompromissos.frmBaixarBoletosVencidos;
import com.mycompany.financeiro.frmCompromissos.frmBaixarCheques;
import com.mycompany.financeiro.frmCompromissos.frmBaixarChequesVencidos;
import com.mycompany.financeiro.frmCompromissos.frmCompromisso;

/**
 *
 * @author Luiz
 */
public class frmMenu extends javax.swing.JFrame {

    /**
     * Creates new form frmMenu
     */
    public frmMenu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        Lançamentos = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        Avencer = new javax.swing.JMenu();
        Baixarchequesnaovencidos = new javax.swing.JMenuItem();
        BaixarBoletosnaovencidos = new javax.swing.JMenuItem();
        Vencidos = new javax.swing.JMenu();
        BaixarBoletosvencidos = new javax.swing.JMenuItem();
        Baixarchequesvencidos = new javax.swing.JMenuItem();
        Relatórios = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setMnemonic('s');
        jButton1.setText("Sair");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Lançamentos.setText("Lançamentos");

        jMenu1.setText("Lançar nova dívida");

        jMenuItem1.setText("Nova dívida");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        Lançamentos.add(jMenu1);

        jMenu2.setText("Baixar dívida");

        Avencer.setText("A vencer");

        Baixarchequesnaovencidos.setText("Baixar Cheques não vencidos");
        Baixarchequesnaovencidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BaixarchequesnaovencidosActionPerformed(evt);
            }
        });
        Avencer.add(Baixarchequesnaovencidos);

        BaixarBoletosnaovencidos.setText("Baixar Boletos não vencidos");
        BaixarBoletosnaovencidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BaixarBoletosnaovencidosActionPerformed(evt);
            }
        });
        Avencer.add(BaixarBoletosnaovencidos);

        jMenu2.add(Avencer);

        Vencidos.setText("Vencidos");

        BaixarBoletosvencidos.setText("Baixar boletos vencidos");
        BaixarBoletosvencidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BaixarBoletosvencidosActionPerformed(evt);
            }
        });
        Vencidos.add(BaixarBoletosvencidos);

        Baixarchequesvencidos.setText("Baixar cheques vencidos");
        Baixarchequesvencidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BaixarchequesvencidosActionPerformed(evt);
            }
        });
        Vencidos.add(Baixarchequesvencidos);

        jMenu2.add(Vencidos);

        Lançamentos.add(jMenu2);

        jMenuBar1.add(Lançamentos);

        Relatórios.setText("Relatórios");
        jMenuBar1.add(Relatórios);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(335, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(231, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
     frmCompromisso frm = new frmCompromisso();
     frm.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void BaixarBoletosnaovencidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BaixarBoletosnaovencidosActionPerformed
     frmBaixarBoletos frm = new frmBaixarBoletos();
     frm.setVisible(true);
    }//GEN-LAST:event_BaixarBoletosnaovencidosActionPerformed

    private void BaixarchequesnaovencidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BaixarchequesnaovencidosActionPerformed
      frmBaixarCheques frm = new frmBaixarCheques();
     frm.setVisible(true);
    }//GEN-LAST:event_BaixarchequesnaovencidosActionPerformed

    private void BaixarBoletosvencidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BaixarBoletosvencidosActionPerformed
    frmBaixarBoletosVencidos frm = new frmBaixarBoletosVencidos();
    frm.setVisible(true);
    }//GEN-LAST:event_BaixarBoletosvencidosActionPerformed

    private void BaixarchequesvencidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BaixarchequesvencidosActionPerformed
    frmBaixarChequesVencidos frm = new frmBaixarChequesVencidos();
    frm.setVisible(true);
    }//GEN-LAST:event_BaixarchequesvencidosActionPerformed

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
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Avencer;
    private javax.swing.JMenuItem BaixarBoletosnaovencidos;
    private javax.swing.JMenuItem BaixarBoletosvencidos;
    private javax.swing.JMenuItem Baixarchequesnaovencidos;
    private javax.swing.JMenuItem Baixarchequesvencidos;
    private javax.swing.JMenu Lançamentos;
    private javax.swing.JMenu Relatórios;
    private javax.swing.JMenu Vencidos;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    // End of variables declaration//GEN-END:variables
}
