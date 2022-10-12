/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.financeiro.dao.utilidades;



import com.mycompany.financeiro.Configuracoes.frmConfiguracoes;
import com.mycompany.financeiro.dao.fornecedores;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import com.mycompany.financeiro.Configuracoes.frmConfiguracoes;
/**
 *
 * @author luiz.souza
 */
public class conexao {

    
    public Connection conectar;
    public Statement statement;
    public ResultSet resultado;
    public String SQL;
    public String url;
    public configurações configs = new configurações();    
           
    
public boolean conecta()
{
    try
    {
    Class.forName("org.sqlite.JDBC");
        ////System.out.println("\nClasse carregada");
    }
    catch (ClassNotFoundException e)
    {
        JOptionPane.showMessageDialog(null, e);
        return false;
    }
    return true;
}
public ResultSet executaConsulta(String SQL)
    {
    
        try{
            conexao con = new conexao();
            url = configs.leBanco().getProperty("banco"); 
            conectar = DriverManager.getConnection("jdbc:sqlite://"+url);
            ////System.out.println("\nDriver manager conexao efetuada");
            statement =conectar.createStatement();
            ////System.out.println("\nStatement criado");
            //System.out.println("\nSQL:"+SQL);
            resultado = statement.executeQuery(SQL);
            //statement.close();
            ////System.out.println("\nresultset preenchido");
            return resultado;
            }
        catch (SQLException e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        
        return resultado;
    }
    
public void executaUpdate(String SQL)
    {
        
        try{
            conexao con = new conexao();
            url = configs.leBanco().getProperty("banco"); 
            conectar = DriverManager.getConnection("jdbc:sqlite://"+url);
            //System.out.println("\nDriver manager conexao efetuada");
            statement =conectar.createStatement();
            //System.out.println("\nStatement criado");
            //System.out.println("\nSQL:"+SQL);
            statement.executeUpdate(SQL);
            //System.out.println("\nresultset preenchido");
            statement.close();
            }
        catch (SQLException e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    
    }
    

}
