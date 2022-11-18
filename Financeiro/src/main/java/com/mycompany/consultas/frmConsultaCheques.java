/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.consultas;

import com.mycompany.financeiro.dao.compromissos;
import com.mycompany.financeiro.dao.fornecedores;
import com.mycompany.financeiro.dao.tipodespesa;
import com.mycompany.financeiro.dao.utilidades.conexao;
import com.mycompany.financeiro.frmCompromissos.frmCompromisso;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import static javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author luiz
 */
public class frmConsultaCheques extends javax.swing.JFrame {
    public ResultSet rsCompromissos,  rsFornecedor, rstipoDespesa;
    public String SQL;
    public int posicaoCompromissos=0,posicaoFornecedor=0,posicaoTipoDespesa=0,posicaoUltimoCompromisso=0,IdUltimoCompromisso=0;
    public List<compromissos> compromissos = new ArrayList<>();
    public List<fornecedores> fornecedores = new ArrayList<>();
    public List<tipodespesa> tipoDespesa = new ArrayList<>();
    /**
     * Creates new form frmCompromisso
     */
    public frmConsultaCheques() {
        initComponents();
        preencher_Jtable();
        
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GrupoTipoDívida = new javax.swing.ButtonGroup();
        DescritivoDoFormulário = new javax.swing.JLabel();
        btn_sair = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_Boletos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(800, 600));

        DescritivoDoFormulário.setFont(new java.awt.Font("Noto Sans", 0, 36)); // NOI18N
        DescritivoDoFormulário.setForeground(new java.awt.Color(255, 0, 0));
        DescritivoDoFormulário.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DescritivoDoFormulário.setText("Consultar Cheques");
        DescritivoDoFormulário.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btn_sair.setMnemonic('s');
        btn_sair.setText("Sair");
        btn_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sairActionPerformed(evt);
            }
        });

        tbl_Boletos.setAutoCreateRowSorter(true);
        tbl_Boletos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Data Vencimento", "Fornecedor", "Valor", "Documento", "Parcela", "Observação", "Pago", "Tipo", "NºCheque"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbl_Boletos.setName("Modelo"); // NOI18N
        tbl_Boletos.setShowGrid(true);
        jScrollPane1.setViewportView(tbl_Boletos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(DescritivoDoFormulário, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(btn_sair)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(DescritivoDoFormulário)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_sair)
                .addGap(328, 328, 328))
        );

        setSize(new java.awt.Dimension(1229, 484));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sairActionPerformed
   dispose();
    }//GEN-LAST:event_btn_sairActionPerformed

    
    
    
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
            java.util.logging.Logger.getLogger(frmCompromisso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCompromisso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCompromisso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCompromisso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmConsultaCheques().setVisible(true);
                
            }
        });
    }
    public void preencher_Jtable(){
        List<Consulta> ListagemJtable = new ArrayList<>();
        
                
        DefaultTableModel modelo = (DefaultTableModel)tbl_Boletos.getModel();
            modelo.setNumRows(0);
            
            tbl_Boletos.setAutoResizeMode(AUTO_RESIZE_ALL_COLUMNS);
        //int int_Contador = 0;
            try
                {
                    conexao con = new conexao();
                    con.conecta();
                    ResultSet rs_Jtable = con.executaConsulta("select "+ 
                        "a.idCompromisso ,"+
                        "a.TipoDivida ,"+
                        "a.DataVencimento,"+
                        "a.Valor,"+
                        "a.IdFornecedor ,"+
                        "a.Documento,"+
                        "a.Parcela,"+
                        "a.CodigoBarras,"+
                        "a.Observacao,"+
                        "a.TipoDespesa,"+
                        "a.DataPagamento,"+
                        "a.PagamentoEfetuado,"+
                        "a.NCheque,"+
                        "b.IdFornecedor as IdFornecedorb,"+
                        "b.NomeFornecedor,"+
                        "c.IdTipoDespesa ,"+
                        "c.NomeDespesa, "+
                        "SUBSTR(DataVencimento,1,2) as Dia,"+
                        "SUBSTR(DataVencimento,4,2) as Mes,"+
                        "SUBSTR(DataVencimento,7,4) as Ano "+
                        "from compromissos a INNER JOIN fornecedores b ON a.IdFornecedor = b.IdFornecedor " +
                        "INNER JOIN tipodespesa c ON a.TipoDespesa = c.IdTipoDespesa "+
                        "where TipoDivida=true " + 
                        "order by Ano,Mes,Dia " );

                    
                    while(!rs_Jtable.isAfterLast()){
                    Consulta registroAtual= new Consulta();    
                        registroAtual.setCodigoBarras(rs_Jtable.getString("CodigoBarras"));
                        registroAtual.setDataPagamento(rs_Jtable.getString("DataPagamento"));
                        registroAtual.setDataVencimento(rs_Jtable.getString("DataVencimento"));
                        registroAtual.setDocumento(rs_Jtable.getString("Documento"));
                        registroAtual.setIdCompromisso(rs_Jtable.getInt("IdCompromisso"));
                        registroAtual.setIdFornecedorb(rs_Jtable.getInt("IdFornecedorb"));
                        registroAtual.setIdFornecedor(rs_Jtable.getInt("IdFornecedor"));
                        registroAtual.setIdTipoDespesa(rs_Jtable.getInt("IdTipoDespesa"));
                        registroAtual.setNCheque(rs_Jtable.getInt("NCheque"));
                        registroAtual.setNomeDespesa(rs_Jtable.getString("NomeDespesa"));
                        registroAtual.setNomeFornecedor(rs_Jtable.getString("NomeFornecedor"));
                        registroAtual.setObservacao(rs_Jtable.getString("Observacao"));
                        registroAtual.setPagamentoEfetuado(rs_Jtable.getBoolean("PagamentoEfetuado"));
                        registroAtual.setParcela(rs_Jtable.getString("Parcela"));
                        registroAtual.setTipoDespesa(rs_Jtable.getInt("TipoDespesa"));
                        registroAtual.setTipoDivida(rs_Jtable.getBoolean("TipoDivida"));
                        registroAtual.setValor(rs_Jtable.getDouble("Valor"));

                     //System.out.print("\n"+registroAtual.getIdFornecedorb());
                    //int_Contador++;
                    ListagemJtable.add(registroAtual);
                    rs_Jtable.next();
                    }
                                        
                    //System.out.print(rs_Jtable.getString(17)+" \n");
                    System.out.print(ListagemJtable.size());

                        
                      //while(!ListagemJtable.isAfterLast()){
                        for(int i=0;i<=ListagemJtable.size()-1;i++)
                            {
                    //System.out.print("\n"+registroAtual.getIdFornecedorb());
                    //int_Contador++;
                            modelo.addRow(new Object[]{
                            ListagemJtable.get(i).getIdCompromisso(),
                            ListagemJtable.get(i).getDataVencimento(),
                            ListagemJtable.get(i).getNomeFornecedor(),
                            ListagemJtable.get(i).getValor(),
                            ListagemJtable.get(i).getDocumento(),
                            ListagemJtable.get(i).getParcela(),
                            ListagemJtable.get(i).getObservacao(),
                            ListagemJtable.get(i).getPagamentoEfetuado(),
                            ListagemJtable.get(i).getTipoDivida(),
                            ListagemJtable.get(i).getNCheque()
                            //ListagemJtable.get(i).getIdFornecedor(),
                            //ListagemJtable.get(i).getIdFornecedor(),
                            //ListagemJtable.get(i).getIdTipoDespesa()
                            //ListagemJtable.get(i).getTipoDivida(),
                            //ListagemJtable.get(i).getNomeDespesa()
                                    });
                    //rs_Jtable.next();
                    //}
                        /*//rs_movimentação.getInt("a.idCompromisso"),
                      
                        //rs_movimentação.getString("a.CodigoBarras")
                        /*"a.TipoDivida ,"+
                        "a.DataVencimento,"+
                        "a.Valor,"+
                        "a.IdFornecedor ,"+
                        "a.Documento,"+
                        "a.Parcela,"+
                        "a.CodigoBarras,"+
                        "a.Observacao,"+
                        "a.TipoDespesa,"+
                        "a.DataPagamento,"+
                        "a.PagamentoEfetuado,"+
                        "a.NCheque,"+
                        "b.IdFornecedor,"+
                        "b.NomeFornecedor,"+
                        "c.IdTipoDespesa ,"+
                        "c.NomeDespesa "+
                    */
                    
                    
                    
                    
                    }
                }
                //lbl_Contador.setText("Há "+int_Contador+ " registros disponíveis.");
                
    
                
            catch(SQLException SqlErro)
                {
               JOptionPane.showMessageDialog(null, SqlErro);
                }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DescritivoDoFormulário;
    private javax.swing.ButtonGroup GrupoTipoDívida;
    private javax.swing.JButton btn_sair;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_Boletos;
    // End of variables declaration//GEN-END:variables
}
