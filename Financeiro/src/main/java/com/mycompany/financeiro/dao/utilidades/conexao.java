/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.financeiro.dao.utilidades;



import com.mycompany.financeiro.dao.fornecedores;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author luiz.souza
 */
public class conexao {

    
    public Connection conectar;
    public Statement statement;
    public ResultSet resultado;
    public String SQL;
    
public boolean conecta()
{
    try
    {
    Class.forName("org.sqlite.JDBC");
        System.out.println("\nClasse carregada");
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
    String url="jdbc:sqlite:c:/banco/financeiro";
    
        try{
            conexao con = new conexao();
            conectar = DriverManager.getConnection(url);
            System.out.println("\nDriver manager conexao efetuada");
            statement =conectar.createStatement();
            System.out.println("\nStatement criado");
            System.out.println("\nSQL:"+SQL);
            resultado = statement.executeQuery(SQL);
            //statement.close();
            System.out.println("\nresultset preenchido");
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
    String url="jdbc:sqlite:c:/banco/financeiro";
    
        try{
            conexao con = new conexao();
            conectar = DriverManager.getConnection(url);
            System.out.println("\nDriver manager conexao efetuada");
            statement =conectar.createStatement();
            System.out.println("\nStatement criado");
            System.out.println("\nSQL:"+SQL);
            //statement.executeUpdate(SQL);
            System.out.println("\nresultset preenchido");
            statement.close();
            }
        catch (SQLException e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    
    }
    

}
