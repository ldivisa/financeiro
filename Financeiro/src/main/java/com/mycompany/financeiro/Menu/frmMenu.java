/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.financeiro.Menu;
import com.mycompany.financeiro.dao.utilidades.*;
import com.mycompany.financeiro.Configuracoes.frmConfiguracoes;
import com.mycompany.financeiro.frmCompromissos.frmBaixarBoletos;
import com.mycompany.financeiro.frmCompromissos.frmBaixarBoletosVencidos;
import com.mycompany.financeiro.frmCompromissos.frmBaixarCheques;
import com.mycompany.financeiro.frmCompromissos.frmBaixarChequesVencidos;
import com.mycompany.financeiro.frmCompromissos.frmCompromisso;
import static com.mycompany.financeiro.Financeiro.*;
import com.mycompany.financeiro.frmFornecedores.frmFornecedores;
import com.mycompany.financeiro.frmTipoDespesa.frmTipoDespesa;
import com.mycompany.financeiro.frmsaldo.frmSaldo;
import java.io.InputStream;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRDataSourceProvider;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;


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
        frmSaldo frms = new frmSaldo();
        saldo= frms.pegarSaldo();
        pegarValorBoletosVencer();
        pegarValorBoletosVencidos();
        pegarValorChequesVencer();
        pegarValorChequesVencidos();
        lblSaldo.setText(String.valueOf(saldo));
        Double DiferencaVencidos =boletosVencidos+chequesVencidos-saldo;
        lblDiferencaVencidos.setText(String.valueOf(DiferencaVencidos));
        Double SubtotalVencidos = boletosVencidos+chequesVencidos;
        lblSubtotalVencidos.setText(String.valueOf(SubtotalVencidos));
        lbl_ChequesVencidos.setText(String.valueOf(chequesVencidos));
        lbl_BoletosVencidos.setText(String.valueOf(boletosVencidos));
        lbl_BoletosTotal.setText(String.valueOf(boletosVencer));
        lbl_ChequesTotal.setText(String.valueOf(chequesVencer));
        lblSubtotalTotal.setText(String.valueOf(boletosVencer+chequesVencer));
        lblDiferencaTotal.setText(String.valueOf(chequesVencer+boletosVencer-saldo));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem3 = new javax.swing.JMenuItem();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblSaldo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbl_ChequesVencidos = new javax.swing.JLabel();
        lbl_BoletosVencidos = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblSubtotalVencidos = new javax.swing.JLabel();
        lblDiferencaVencidos = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lbl_ChequesTotal = new javax.swing.JLabel();
        lbl_BoletosTotal = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        lblSubtotalTotal = new javax.swing.JLabel();
        lblDiferencaTotal = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
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
        jMenu3 = new javax.swing.JMenu();
        mi_fornecedores = new javax.swing.JMenuItem();
        tipodepesa = new javax.swing.JMenuItem();
        Configuração = new javax.swing.JMenu();
        Bancodedados = new javax.swing.JMenuItem();
        Saldobancário = new javax.swing.JMenuItem();
        Relatórios = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setMnemonic('s');
        jButton1.setText("Sair");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Último Saldo Bancário Registrado:");

        lblSaldo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblSaldo.setText("jLabel2");

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel2.setText("Vencidos:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Cheques:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Boletos:");

        lbl_ChequesVencidos.setText("jLabel5");

        lbl_BoletosVencidos.setText("jLabel6");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Subtotal Vencidos:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Diferença para o saldo declarado:");

        lblSubtotalVencidos.setText("lblSubtotalVencidos");

        lblDiferencaVencidos.setText("jLabel8");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbl_BoletosVencidos, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbl_ChequesVencidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 68, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblSubtotalVencidos, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                            .addComponent(lblDiferencaVencidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lbl_ChequesVencidos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lbl_BoletosVencidos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lblSubtotalVencidos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lblDiferencaVencidos)))
        );

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel13.setText("Todos os registros a vencer ou vencidos:");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Cheques:");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Boletos:");

        lbl_ChequesTotal.setText("jLabel5");

        lbl_BoletosTotal.setText("jLabel6");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setText("Subtotal Vencidos:");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel17.setText("Diferença para o saldo declarado:");

        lblSubtotalTotal.setText("lblSubtotalVencidos");

        lblDiferencaTotal.setText("jLabel8");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel13))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addComponent(jLabel15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbl_BoletosTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbl_ChequesTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblSubtotalTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                            .addComponent(lblDiferencaTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(lbl_ChequesTotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(lbl_BoletosTotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(lblSubtotalTotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(lblDiferencaTotal)))
        );

        jButton2.setMnemonic('a');
        jButton2.setText("Atualizar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
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

        jMenu3.setText("Tabelas");

        mi_fornecedores.setText("Fornecedores");
        mi_fornecedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_fornecedoresActionPerformed(evt);
            }
        });
        jMenu3.add(mi_fornecedores);

        tipodepesa.setText("Tipo de Despesa");
        tipodepesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipodepesaActionPerformed(evt);
            }
        });
        jMenu3.add(tipodepesa);

        jMenuBar1.add(jMenu3);

        Configuração.setText("Configuração");

        Bancodedados.setText("Banco de dados");
        Bancodedados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BancodedadosActionPerformed(evt);
            }
        });
        Configuração.add(Bancodedados);

        Saldobancário.setText("Saldo Bancário");
        Saldobancário.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaldobancárioActionPerformed(evt);
            }
        });
        Configuração.add(Saldobancário);

        jMenuBar1.add(Configuração);

        Relatórios.setText("Relatórios");

        jMenuItem2.setText("Todas dívidas");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        Relatórios.add(jMenuItem2);

        jMenuItem4.setText("Apenas Cheques");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        Relatórios.add(jMenuItem4);

        jMenuItem5.setText("Apenas Boletos");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        Relatórios.add(jMenuItem5);

        jMenuBar1.add(Relatórios);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(36, 36, 36)
                        .addComponent(jButton1))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblSaldo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        frmSaldo fsaldo = new frmSaldo();
        saldo= fsaldo.pegarSaldo();
        pegarValorBoletosVencer();
        pegarValorBoletosVencidos();
        pegarValorChequesVencer();
        pegarValorChequesVencidos();
        lblSaldo.setText(String.valueOf(saldo));
        Double DiferencaVencidos =boletosVencidos+chequesVencidos-saldo;
        lblDiferencaVencidos.setText(String.valueOf(DiferencaVencidos));
        Double SubtotalVencidos = boletosVencidos+chequesVencidos;
        lblSubtotalVencidos.setText(String.valueOf(SubtotalVencidos));
        lbl_ChequesVencidos.setText(String.valueOf(chequesVencidos));
        lbl_BoletosVencidos.setText(String.valueOf(boletosVencidos));
        lbl_BoletosTotal.setText(String.valueOf(boletosVencer));
        lbl_ChequesTotal.setText(String.valueOf(chequesVencer));
        lblSubtotalTotal.setText(String.valueOf(boletosVencer+chequesVencer));
        lblDiferencaTotal.setText(String.valueOf(chequesVencer+boletosVencer-saldo));
    }//GEN-LAST:event_jButton2ActionPerformed

    private void BancodedadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BancodedadosActionPerformed
    frmConfiguracoes frmcfg = new frmConfiguracoes();
    frmcfg.setVisible(true);
    }//GEN-LAST:event_BancodedadosActionPerformed

    private void SaldobancárioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaldobancárioActionPerformed
     frmSaldo frm = new frmSaldo();
     frm.setVisible(true);
    }//GEN-LAST:event_SaldobancárioActionPerformed

    private void mi_fornecedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_fornecedoresActionPerformed
  frmFornecedores frm = new frmFornecedores();
  frm.setVisible(true);
    }//GEN-LAST:event_mi_fornecedoresActionPerformed

    private void tipodepesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipodepesaActionPerformed
        frmTipoDespesa frm = new frmTipoDespesa();
  frm.setVisible(true);
    }//GEN-LAST:event_tipodepesaActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
               
    try {
        InputStream in =  this.getClass().getClassLoader().getResourceAsStream("relatorios/Financeiro.jrxml");
        JasperDesign jd;
        
        configurações configs = new configurações();
        conexao con = new conexao();
        String url ="jdbc:sqlite:"+ configs.leBanco().getProperty("banco"); 
        Connection conectar = DriverManager.getConnection(url);
         System.out.print("\nurl: "+url);
            
        //Connection con = DriverManager.getConnection("jdbc:sqlite:"+cfg.url.toString());
        jd = JRXmlLoader.load(in);
        //dsp.create(jr);
         System.out.print("\n 0");
        JasperReport jr = JasperCompileManager.compileReport(jd);
        System.out.print(" -1 ");
        JasperPrint jp = JasperFillManager.fillReport(jr, null,conectar);
        System.out.print("- 2");
        JasperViewer.viewReport(jp, false);
        conectar.close();
    }
    catch (Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
 try {
        InputStream in =  this.getClass().getClassLoader().getResourceAsStream("relatorios/FinanceiroCheques.jrxml");
        JasperDesign jd;
        
        configurações configs = new configurações();
        conexao con = new conexao();
        String url ="jdbc:sqlite:"+ configs.leBanco().getProperty("banco"); 
        Connection conectar = DriverManager.getConnection(url);
         System.out.print("\nurl: "+url);
            
        //Connection con = DriverManager.getConnection("jdbc:sqlite:"+cfg.url.toString());
        jd = JRXmlLoader.load(in);
        //dsp.create(jr);
         System.out.print("\n 0");
        JasperReport jr = JasperCompileManager.compileReport(jd);
        System.out.print(" -1 ");
        JasperPrint jp = JasperFillManager.fillReport(jr, null,conectar);
        System.out.print("- 2");
        JasperViewer.viewReport(jp, false);
        conectar.close();
         }
    catch (Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
try {
        InputStream in =  this.getClass().getClassLoader().getResourceAsStream("relatorios/FinanceiroBoletos.jrxml");
        JasperDesign jd;
        
        configurações configs = new configurações();
        conexao con = new conexao();
        String url ="jdbc:sqlite:"+ configs.leBanco().getProperty("banco"); 
        Connection conectar = DriverManager.getConnection(url);
         System.out.print("\nurl: "+url);
            
        //Connection con = DriverManager.getConnection("jdbc:sqlite:"+cfg.url.toString());
        jd = JRXmlLoader.load(in);
        //dsp.create(jr);
         System.out.print("\n 0");
        JasperReport jr = JasperCompileManager.compileReport(jd);
        System.out.print(" -1 ");
        JasperPrint jp = JasperFillManager.fillReport(jr, null,conectar);
        System.out.print("- 2");
        JasperViewer.viewReport(jp, false);
        conectar.close();
         }
    catch (Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
    }//GEN-LAST:event_jMenuItem5ActionPerformed

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
    private javax.swing.JMenuItem Bancodedados;
    private javax.swing.JMenu Configuração;
    private javax.swing.JMenu Lançamentos;
    private javax.swing.JMenu Relatórios;
    private javax.swing.JMenuItem Saldobancário;
    private javax.swing.JMenu Vencidos;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblDiferencaTotal;
    private javax.swing.JLabel lblDiferencaVencidos;
    private javax.swing.JLabel lblSaldo;
    private javax.swing.JLabel lblSubtotalTotal;
    private javax.swing.JLabel lblSubtotalVencidos;
    private javax.swing.JLabel lbl_BoletosTotal;
    private javax.swing.JLabel lbl_BoletosVencidos;
    private javax.swing.JLabel lbl_ChequesTotal;
    private javax.swing.JLabel lbl_ChequesVencidos;
    private javax.swing.JMenuItem mi_fornecedores;
    private javax.swing.JMenuItem tipodepesa;
    // End of variables declaration//GEN-END:variables
}
