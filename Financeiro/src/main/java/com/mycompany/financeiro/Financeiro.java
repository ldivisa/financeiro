/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.financeiro;


import com.mycompany.financeiro.dao.utilidades.*;
import com.mycompany.financeiro.frmsaldo.frmSaldo;
import com.mypackage.financeiro.login.frmLogin;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.Array;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author luiz.souza
 */
public class Financeiro {
    public static double saldo,boletosVencidos,chequesVencidos,boletosVencer,chequesVencer;
    public static String strUltimaAcao;
    
    
    
    public static void main(String[] args) {
        CarregarUltimoUso();
        frmSaldo frms = new frmSaldo();
        saldo= frms.pegarSaldo();
        pegarValorBoletosVencer();
        pegarValorBoletosVencidos();
        pegarValorChequesVencer();
        pegarValorChequesVencidos();
        frmLogin frm = new frmLogin();
        frm.setVisible(true);
        
        
        
}
    
    public static double pegarValorBoletosVencidos(){
    
        boletosVencidos=0;
   
    try{
         conexao con = new conexao();
    con.conecta();
    Date hoje = new Date();
    SimpleDateFormat formatodata = new SimpleDateFormat("YYYYMMdd");
    String datahoje = formatodata.format(hoje);
    //System.out.print("\n Hoje é:"+datahoje);
    ResultSet rsBoletosVencidos = con.executaConsulta("select * from compromissos where TipoDivida='0' and PagamentoEfetuado='0'");
        while(rsBoletosVencidos.next())
        {
            String dataregistro = (rsBoletosVencidos.getString("DataVencimento"));
            ////System.out.print("\nData registro antes->"+dataregistro);
            dataregistro = dataregistro.substring(6,10)+dataregistro.substring(3,5)+dataregistro.substring(0,2);
            //System.out.print("\nData registro ->"+dataregistro);
            //System.out.print(" - Data hoje->"+datahoje);
            
            if(Integer.parseInt(dataregistro)<=Integer.parseInt(datahoje))
            {
                boletosVencidos= (boletosVencidos+Double.valueOf(rsBoletosVencidos.getString("Valor")));
                //boletosVencidos= NumberFormat.getCurrencyInstance().format(boletosVencidos);
                //System.out.print("\nAdicionando o valor de "+rsBoletosVencidos.getString("Valor")+" referente ao registro "+rsBoletosVencidos.getString("IdCompromisso")+" somatorio:"+boletosVencidos);
            }
        }
    rsBoletosVencidos.close();
    }
    catch (SQLException e)
    {
    JOptionPane.showMessageDialog(null, e);
    }
     //System.out.print("\ntotal valor boletos vencidos: "+boletosVencidos);
    return boletosVencidos;
    }
    
    
    public static double pegarValorBoletosVencer(){
        boletosVencer=0;
        try {
            conexao con = new conexao();
            con.conecta();
            ResultSet rsboletosvencer = con.executaConsulta("select sum(valor) from compromissos where TipoDivida='0' and PagamentoEfetuado ='0'" );
            if (rsboletosvencer.isBeforeFirst()){
                boletosVencer = Double.valueOf(rsboletosvencer.getString(1));
                //System.out.print("\nTotal boletos a vencer: "+boletosVencer);
              
            }
            else
                {
                JOptionPane.showMessageDialog(null, "Não há boletos a vencer encontrados");
                }
              rsboletosvencer.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        
        return boletosVencer;    
}

    public static double pegarValorChequesVencidos(){
        chequesVencidos=0;
    try{
        //System.out.print("\nDentro de pegarvalorchequesvencidos");
        conexao con = new conexao();
        con.conecta();
        Date hoje = new Date();
        SimpleDateFormat formatodata = new SimpleDateFormat("YYYYMMdd");
        String datahoje = formatodata.format(hoje);
        //System.out.print("\n Hoje é:"+datahoje);
        //System.out.print("\nVai pegar resultset");
        ResultSet rsChequesVencidos = con.executaConsulta("select * from compromissos where TipoDivida='1' and PagamentoEfetuado='0'");
        //System.out.print("\nPegou resultset");
     if (rsChequesVencidos.isBeforeFirst()){
         //System.out.print("\n Há registros de cheques vencidos");
        while(rsChequesVencidos.next())
        {
            String dataregistro = (rsChequesVencidos.getString("DataVencimento"));
            ////System.out.print("\nData registro antes->"+dataregistro);
            dataregistro = dataregistro.substring(6,10)+dataregistro.substring(3,5)+dataregistro.substring(0,2);
            //System.out.print("\n Data registro ->"+dataregistro+" Data hoje: "+datahoje);
            int intDataHoje=Integer.valueOf(datahoje);
            int intDataRegistro=Integer.valueOf(dataregistro);
            //System.out.print("\n Data registro ->"+intDataRegistro+" Data hoje: "+intDataHoje);
                if(intDataRegistro<=intDataHoje)
                {
                    //System.out.print("\n * ");
                chequesVencidos=chequesVencidos+Double.valueOf(rsChequesVencidos.getString("Valor"));
                //System.out.print(" Adicionando o valor de "+rsChequesVencidos.getString("Valor")+" referente ao registro "+rsChequesVencidos.getString("IdCompromisso")+" somatorio:"+chequesVencidos);
                }
        }
        
    }
         else
    {
        JOptionPane.showMessageDialog(null, "Não há cheques vencidos encontrados");
    }
     rsChequesVencidos.close();
    }
    catch (SQLException e)
        {
        JOptionPane.showMessageDialog(null, e);
        }
        //System.out.print("\ntotal valor cheques vencidos: "+chequesVencidos);
        return chequesVencidos;
    }
    
    
    
    public static double pegarValorChequesVencer(){
        chequesVencer=0;
        try {
            conexao con = new conexao();
            con.conecta();
            ResultSet rschequesvencer = con.executaConsulta("select sum(valor) as valor from compromissos where TipoDivida='1' and PagamentoEfetuado ='0'" );
            //System.out.print("\nPegarvalorchequesvencer->"+chequesVencer);
            //System.out.print("\nResultset size>"+rschequesvencer.getString("valor"));
            if (rschequesvencer.isBeforeFirst())
            {
            chequesVencer =Double.valueOf(rschequesvencer.getString("valor"));
            //System.out.print("\nTotal cheques a vencer: "+chequesVencer);
            }
            else
            {
            JOptionPane.showMessageDialog(null, "Não foram encontrados cheques a pagar");
            }
            rschequesvencer.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        
        return chequesVencer;    
}
    public static void atualizartela(JFrame frame){
    frame.repaint();
    }
    public static void nada(){
    System.out.print("função nada \n");
    }
public static String CarregarUltimoUso()
    {
               /* ArrayList<String> teste = new ArrayList<>();
                   teste.add("Um");
                   teste.add("Dois");
                
                //System.out.print(teste);
                
                for (String tst:teste){
                    System.out.print("\n "+tst);
                }
                
                    System.out.print("\n "+teste.get(1));
                for (int i = 0; i<teste.size();i++){
                    System.out.print("\n "+teste.get(i));
                }
                
                /*
                teste.forEach(tst ->{
                    System.out.print("Percorrendo");
                    System.out.print("\n "+tst);
                });
               
                Collections.sort(teste);
                    System.out.print("\n "+teste.get(1));
                for (int i = 0; i<teste.size();i++){
                    System.out.print("\n "+teste.get(i));
                }
                */
       
       try
            {
                FileInputStream arquivoLeitura = new FileInputStream("ultimologin.txt");
                ObjectInputStream objLeitura = new ObjectInputStream(arquivoLeitura);
                UltimoAcesso objeto = new UltimoAcesso();
                objeto=(UltimoAcesso) objLeitura.readObject();
                strUltimaAcao =objeto.getUltimoAcesso();
                //System.out.print("\n  arquivo e vi que tem o seguinte conteudo: "+strUltimaAcao);
                
             }
        catch (ClassNotFoundException erro)
            {
             JOptionPane.showMessageDialog(null, erro);
             System.exit(0);
            }
        catch (FileNotFoundException erro)
             {
                JOptionPane.showMessageDialog(null,"Nao foi encontrado arquivo de ultimo login. Criando..."+erro);
                gravaHora();
                System.exit(0);
                }
        catch (IOException erro)
            {
                JOptionPane.showMessageDialog(null,"Erro ao gravar dados em arquivo: "+erro);
                System.exit(0);
            }
            
       return strUltimaAcao;
    }
        
       
        /*
        try
        {
        Object[] ultimoLogin;
        ultimoLogin = new Object[1];
        FileOutputStream arquivoSaida;
        arquivoSaida = new FileOutputStream(new File("login.log"));
        }
        catch (IOException erro)
        {
        JOptionPane.showMessageDialog(null, "Erro ao gravar arquivo "+erro);
        }
         */ 
    
   
        /*
try
        {
        Object[] ultimoLogin;
        ultimoLogin = new Object[1];
        
        FileOutputStream arquivoSaida;
        arquivoSaida = new FileOutputStream(new File("login.log"));
        
        
        
        }
        catch (IOException erro)
        {
            JOptionPane.showMessageDialog(null, "Erro ao gravar arquivo "+erro);
        }
    */    
     public static void gravaHora(){
         String strAgora =LocalDateTime.now().toString();
                UltimoAcesso objUltimoAcesso = new UltimoAcesso();
                objUltimoAcesso.setUltimoAcesso(strAgora);
                try {                
                FileOutputStream arquivo = new FileOutputStream("ultimologin.txt");
                ObjectOutputStream arquivoGravar = new ObjectOutputStream(arquivo);
                arquivoGravar.writeObject(objUltimoAcesso);
                arquivoGravar.flush();
                arquivoGravar.close();
     }
                catch(Exception Erro){
                JOptionPane.showMessageDialog(null, Erro);
                }
    }

}