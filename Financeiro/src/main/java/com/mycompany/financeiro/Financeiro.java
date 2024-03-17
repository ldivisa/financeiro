/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.financeiro;


import com.mycompany.financeiro.Menu.frmMenu;
import com.mycompany.financeiro.dao.utilidades.*;
import com.mycompany.financeiro.frmsaldo.frmSaldo;
import com.mypackage.financeiro.login.frmLogin;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import java.text.NumberFormat;

/**
 *
 * @author luiz.souza
 */
public class Financeiro {
    public static double saldo,boletosVencidos,chequesVencidos,boletosVencer,chequesVencer;
    
    
    
    
    public static void main(String[] args) {
        frmSaldo frms = new frmSaldo();
        saldo= frms.pegarSaldo();
        pegarValorBoletosVencer();
        pegarValorBoletosVencidos();
        pegarValorChequesVencer();
        pegarValorChequesVencidos();
        frmLogin frm = new frmLogin();
        frm.setVisible(true);
        //As duas linhas acima abrem a tela de login
        frmMenu menu = new frmMenu();
        //menu.setVisible(true);
        
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
    if (rsBoletosVencidos!=null){
        while(rsBoletosVencidos.next()){
            String dataregistro = (rsBoletosVencidos.getString("DataVencimento"));
            ////System.out.print("\nData registro antes->"+dataregistro);
            dataregistro = dataregistro.substring(6,10)+dataregistro.substring(3,5)+dataregistro.substring(0,2);
            //System.out.print("\nData registro ->"+dataregistro);
            //System.out.print(" - Data hoje->"+datahoje);
            
            if(Integer.parseInt(dataregistro)<=Integer.parseInt(datahoje))
            {
               // boletosVencidos= (boletosVencidos+Double.valueOf(rsBoletosVencidos.getDouble("Valor"))); --> Versao sqlite mudando para mysql
    boletosVencidos= (boletosVencidos+rsBoletosVencidos.getDouble("Valor"));
               
                
//boletosVencidos= NumberFormat.getCurrencyInstance().format(boletosVencidos);
                //System.out.print("\nAdicionando o valor de "+rsBoletosVencidos.getString("Valor")+" referente ao registro "+rsBoletosVencidos.getString("IdCompromisso")+" somatorio:"+boletosVencidos);
            }
        }
    rsBoletosVencidos.close();
    }}
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
            
            ResultSet rsboletosvencer = con.executaConsulta("select sum(valor) from compromissos where TipoDivida=0 and PagamentoEfetuado =0" );
            rsboletosvencer.next();
            boletosVencer = Double.parseDouble(rsboletosvencer.getString(1));
            //System.out.print("rsboletosvencer = " + boletosVencer);
            if (rsboletosvencer.isFirst()){
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
        ResultSet rsChequesVencidos = con.executaConsulta("select * from compromissos where TipoDivida=1 and PagamentoEfetuado=0");
        
//System.out.print("\nPegou resultset");
     if (rsChequesVencidos!=null){
         //System.out.print("\n Há registros de cheques vencidos");
        while(rsChequesVencidos.next())
        {
            String dataregistro = (rsChequesVencidos.getString("DataVencimento"));
            ////System.out.print("\nData registro antes->"+dataregistro);
            dataregistro = dataregistro.substring(6,10)+dataregistro.substring(3,5)+dataregistro.substring(0,2);
            //System.out.print("\n Data registro ->"+dataregistro+" Data hoje: "+datahoje);
            int intDataHoje=Integer.parseInt(datahoje);
            int intDataRegistro=Integer.parseInt(dataregistro);
            //System.out.print("\n Data registro ->"+intDataRegistro+" Data hoje: "+intDataHoje);
                if(intDataRegistro<=intDataHoje)
                {
                    //System.out.print("\n * ");
                chequesVencidos=chequesVencidos+Double.parseDouble(rsChequesVencidos.getString("Valor"));
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
            ResultSet rschequesvencer = con.executaConsulta("select sum(valor) as valor from compromissos where TipoDivida=1 and PagamentoEfetuado =0" );
            rschequesvencer.next();
            //System.out.println(rschequesvencer.getString("valor"));
            //System.out.print("\nPegarvalorchequesvencer->"+chequesVencer);
            //System.out.print("\nResultset size>"+rschequesvencer.getString("valor"));
           if (rschequesvencer.getString("valor")!=null)
            chequesVencer =Double.parseDouble(rschequesvencer.getString("valor"));
            //System.out.print("\nTotal cheques a vencer: "+chequesVencer);
           rschequesvencer.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        
        return chequesVencer;    
}

}